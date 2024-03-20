import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dosya adı: ");
        String dosyaAdi = scanner.nextLine();

        try (Scanner fileScanner = new Scanner(new java.io.File(dosyaAdi))) {
            StringBuilder allLinks = new StringBuilder(); // Tüm bağlantıları tek bir dosyada biriktirelim
            int sayac = 1;
            while (fileScanner.hasNextLine()) {
                String url = fileScanner.nextLine().trim();
                try {
                    URL obj = new URL(url);
                    HttpURLConnection con = (HttpURLConnection) obj.openConnection();

                    con.setRequestMethod("GET");
                    con.setRequestProperty("User-Agent", "Mozilla/5.0");

                    BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();

                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    in.close();

                    String rawHTML = content.toString();
                    Pattern pattern = Pattern.compile("<a\\s+[^>]*href=\"([^\"]+)\"[^>]*>");
                    Matcher matcher = pattern.matcher(rawHTML);

                    // Her bir bağlantıyı allLinks'e ekleyelim
                    while (matcher.find()) {
                        String link = matcher.group(1);
                        allLinks.append(link).append("\n");
                    }

                    System.out.println(url + " adresinden bağlantılar başarıyla alındı.");
                    sayac++;
                } catch (IOException e) {
                    System.out.println(url + " adresinde içerik bulunamadı veya alınamadı.");
                }
            }

            // Tüm bağlantıları tek bir dosyaya yazalım
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("all_links.txt"))) {
                writer.write(allLinks.toString());
                System.out.println("Tüm bağlantılar başarıyla kaydedildi: all_links.txt");
            } catch (IOException e) {
                System.out.println("Dosya yazma hatası: " + e.getMessage());
            }

        } catch (Exception e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
}