import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList<myArray> myArray = new ArrayList<myArray>();
        int i = 0;
        int j = 1;
        boolean addarray = true;
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();
        thread3 t3 = new thread3();
        t1.start();
        t2.start();
        t3.start();

        for (j = 0; j < t1.getmyArraysize(); j++) {

            if (!myArray.contains(t1.getmyArray(j))) {
                myArray.add(new myArray(t1.getmyArray(i).a));
            } else {
                for (int k2 = 0; k2 < t1.getmyArraysize(); k2++) {
                    if (myArray.get(j).a.equals(t1.getmyArray(k2).a)) {
                        myArray.get(j).b += t1.getmyArray(k2).b;
                    }
                }
            }

        }
        for (myArray myArray2 : myArray) {
            System.out.println("denemee");
            System.out.println(myArray2.a + " " + myArray2.b);
        }
    }
}

class thread1 extends Thread {
    reading read = new reading();
    ArrayList<myArray> myArray = new ArrayList<myArray>();
    String cache;
    int i = 0;
    int j = 0;

    public void run() {
        try {
            File myObj1 = new File("src\\heb1");
            myArray = reading.readfile(new Scanner(myObj1));
            for (int i = 0; i < myArray.size(); i++) {
                cache = myArray.get(i).a;
                myArray.get(i).b++;
                for (int j = 0; j < myArray.size(); j++) {
                    if (cache.equals(myArray.get(j).a) && myArray.get(j).b == 0) {
                        myArray.get(i).b++;
                        myArray.remove(j);
                        j--;
                    }
                }
            }
            for (i = 0; i < myArray.size(); i++) {
                System.out.println(myArray.get(i).a + " " + myArray.get(i).b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public myArray getmyArray(int i) {
        return myArray.get(i);
    }

    public int getmyArraysize() {
        return myArray.size();
    }
}

class thread2 extends Thread {
    reading read = new reading();
    ArrayList<myArray> myArray = new ArrayList<myArray>();
    String cache;
    int i = 0;
    int j = 0;

    public void run() {
        try {
            File myObj1 = new File("src\\heb2");
            myArray = reading.readfile(new Scanner(myObj1));
            for (int i = 0; i < myArray.size(); i++) {
                cache = myArray.get(i).a;
                myArray.get(i).b++;
                for (int j = 0; j < myArray.size(); j++) {
                    if (cache.equals(myArray.get(j).a) && myArray.get(j).b == 0) {
                        myArray.get(i).b++;
                        myArray.remove(j);
                        j--;
                    }
                }
            }
            for (i = 0; i < myArray.size(); i++) {
                System.out.println(myArray.get(i).a + " " + myArray.get(i).b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public myArray getmyArray(int i) {
        return myArray.get(i);
    }

    public int getmyArraysize() {
        return myArray.size();
    }
}

class thread3 extends Thread {
    reading read = new reading();
    ArrayList<myArray> myArray = new ArrayList<myArray>();
    String cache;
    int i = 0;
    int j = 0;

    public void run() {
        try {
            File myObj1 = new File("src\\heb3");
            myArray = reading.readfile(new Scanner(myObj1));
            for (int i = 0; i < myArray.size(); i++) {
                cache = myArray.get(i).a;
                myArray.get(i).b++;
                for (int j = 0; j < myArray.size(); j++) {
                    if (cache.equals(myArray.get(j).a) && myArray.get(j).b == 0) {
                        myArray.get(i).b++;
                        myArray.remove(j);
                        j--;
                    }
                }
            }
            for (i = 0; i < myArray.size(); i++) {
                System.out.println(myArray.get(i).a + " " + myArray.get(i).b);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public myArray getmyArray(int i) {
        return myArray.get(i);
    }

    public int getmyArraysize() {
        return myArray.size();
    }
}

/**
 * arrayoperation
 */
class arrayOperation {

}

/**
 * reading file
 */
class reading {

    public static ArrayList readfile(Scanner myReader) {
        ArrayList<myArray> myArray = new ArrayList<myArray>();
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
            myArray.add(new myArray(data.toLowerCase()));
        }
        myReader.close();
        return myArray;
    }

}

class myArray {
    String a;
    int b;

    myArray(String a) {
        this.a = a;
        this.b = 0;
    }

    public void seta(String a) {
        this.a = a;
    }
}
