import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        int y = 0;
        while (!(y <= 100 && y >= 10)) {

            System.out.println("10la 100 arasında bir sayı giriniz");
            y = input.nextInt();

        }
        int boy = 2 * y;
        for (int i = 0; i < y; i++) {

            for (int j = 0; j < boy; j++) {

                if (i == 0 || i == (y - 1))
                    System.out.print("*");
                else if (j == 0 || j == boy - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");

            }
            System.out.println("");
        }

    }

}
