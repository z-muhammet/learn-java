public class climate {
    private int sicaklik;

    public climate() {
    }

    public void open() {
        sicaklik = 20;
        System.out.println("Klima Is Turned On.");
    }

    public void Close() {
        System.out.println("Klima Is Turned On.");
    }

    public void Chager(int sicaklik) {
        this.sicaklik = sicaklik;
        System.out.println("\r" + //
                "The temperature has been changed: " + sicaklik);
    }
}
