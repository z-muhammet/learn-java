import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class EmailDecoder {

    public ArrayList<String> reader() {
        ArrayList<String> encodedEmails = new ArrayList<String>();

        try {
            File file = new File("src/heb");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                encodedEmails.add(data);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        return encodedEmails;
    }

    public static String decodeEmail(String string) {
        int r = Integer.parseInt(string.substring(0, 2), 16);
        StringBuilder emailBuilder = new StringBuilder();

        for (int i = 2; i < string.length(); i += 2) {
            int intValue = Integer.parseInt(string.substring(i, i + 2), 16);
            char decodedChar = (char) (intValue ^ r);
            emailBuilder.append(decodedChar);
        }

        return emailBuilder.toString();
    }

    public static void main(String[] args) {

        EmailDecoder emailDecoder = new EmailDecoder();
        ArrayList<String> encodedEmails = emailDecoder.reader();
        for (String string : encodedEmails) {
            System.out.println("Encoded Email: " + decodeEmail(string));

        }
    }
}