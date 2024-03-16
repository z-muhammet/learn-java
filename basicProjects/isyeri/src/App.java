public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        isci isci = new isci(50, 10, "hebele");
        muhendis muhendis = new muhendis("hubele", 10, 100);

        maashesap calisanIsci = new maashesap(isci);
        maashesap calisanMuhendis = new maashesap(muhendis);
    }
}
