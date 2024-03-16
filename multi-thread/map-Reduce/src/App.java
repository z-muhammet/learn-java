import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

}

class thread1 extends Thread {
    public void run() {
        try {
            File myObj1 = new File("src\\heb1");
            readfile(new Scanner(myObj1));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class thread2 extends Thread {
    public void run() {
        try {
            File myObj1 = new File("src\\heb2");
            readfile(new Scanner(myObj1));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

class thread3 extends Thread {
    public void run() {
        try {
            File myObj1 = new File("src\\heb3");
            readfile(new Scanner(myObj1));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

public static void readfile(Scanner myReader) {
    while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
    }
    myReader.close();
}
