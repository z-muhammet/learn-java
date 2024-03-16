public class App {
    public static void main(String[] args) throws Exception {
        IPhone note7 = PhoneFactory.getPhone("note7", "5.7", "4GB");
        IPhone note8 = PhoneFactory.getPhone("note8", "6.3", "6GB");
    }
}
