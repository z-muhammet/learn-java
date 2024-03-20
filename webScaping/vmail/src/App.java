import java.io.*;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        System.out.println("Lütfen klasör yolunu girin:");
        Scanner scanner = new Scanner(System.in);
        String folderPath = scanner.nextLine();

        File folder = new File(folderPath);
        File[] listOfFiles = folder.listFiles();
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (File file : listOfFiles) {
            System.out.println(file.getName() + " tamamlandı... \n");
            if (file.isFile() && file.getName().endsWith(".html")) {
                executor.execute(() -> {
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        String line;
                        while ((line = reader.readLine()) != null) {
                            stringBuilder.append(line);
                            stringBuilder.append(System.lineSeparator());
                        }
                        String dosyaAdi = file.getName().replace(".html", "");
                        int bolumNo = Integer.valueOf(dosyaAdi.substring(6));
                        String content = stringBuilder.toString();
                        String textColor = "cyan"; // varsayılan metin rengi
                        String backgroundColor = "black"; // varsayılan arka plan rengi

                        // HTML dosyasının içeriği değiştiriliyor
                        content = "<!DOCTYPE html>\n" +
                                "<html>\n" +
                                "  <body>\n" +
                                content +
                                "  </body>\n" +
                                "</html>";
                        try (BufferedWriter writer = new BufferedWriter(
                                new OutputStreamWriter(new FileOutputStream(file)))) {
                            writer.write(content);
                        } catch (IOException e) {
                            System.err.println("Dosya yazma hatası: " + e.getMessage());
                        }
                    } catch (IOException e) {
                        System.err.println("Dosya okuma hatası: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.err.println("Bölüm numarası çıkarma hatası: " + e.getMessage());
                    }
                });
            }
        }
        executor.shutdown();
    }
}
