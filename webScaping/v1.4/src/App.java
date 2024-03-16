import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class heb1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread1 çalıştı");
        }
    }
}

class heb2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread2 çalıştı");
        }
    }
}

class heb3 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread3 çalıştı");
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        heb1 thread1 = new heb1();
        heb2 thread2 = new heb2();
        heb3 thread3 = new heb3();

        thread1.start();
        thread2.start();
        thread3.start();

        // open scanner
        /*
         * int sayac = 1;
         * while (fileScanner.hasNextLine()) {
         * String url = fileScanner.nextLine().trim();
         * // URL obj = new URL(url);
         * URL obj = new URL("https://ankarateknokent.com/firmalar-portfolio/");
         * HttpURLConnection con = (HttpURLConnection) obj.openConnection();
         * // HttpURLConnection con = (HttpURLConnection) obj.openConnection();
         */
        URL obj = new URL("https://ankarateknokent.com/firmalar-portfolio/");
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

        // ilgili bölümü almak için regex kullanıyoruz
        Pattern pattern = Pattern.compile("<div class=\"fg-item-content\">(.*?)</div>");
        Matcher matcher = pattern.matcher(rawHTML);

        if (matcher.find()) {
            String textColor = "cyan"; // varsayılan metin rengi
            String backgroundColor = "black"; // varsayılan arka plan rengi
            String contentText = matcher.group(1);
            FileWriter writer = new FileWriter("mailtekno" + ".html");

            writer.write(contentText + "\n");
            writer.close();

            /*
             * writer.write(
             * "<html><head><meta charset=\"UTF-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style>body { color: "
             * + textColor + "; background-color: " + backgroundColor +
             * "; }</style></head><body>"
             * +
             * "<p><span><button onclick=\"changeTextColor()\">Metin Rengini Değiştir</button></span><span><button onclick=\"changeBackgroundColor()\">Arka Plan Rengini Değiştir</button></span></p><a href=\"bolum"
             * + (sayac - 1) + ".html\">Önceki</a><br><a href=\"bolum" + (sayac + 1)
             * + ".html\">Sonraki</a>"
             * + contentText
             * +
             * "<script>function changeTextColor() { var newColor = prompt('Lütfen yeni metin rengini girin:', 'red'); document.body.style.color = newColor; } function changeBackgroundColor() { var newColor = prompt('Lütfen yeni arka plan rengini girin:', 'white'); document.body.style.backgroundColor = newColor; }</script></body></html>"
             * );
             * writer.close();
             */

            // close scanner
        }
    }
}