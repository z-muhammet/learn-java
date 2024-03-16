public class App {
    public static void main(String[] args) throws Exception {
        IdeviceMenager note7Factory = new Note7Factory();
        IdeviceMenager note8Factory = new Note8Factory();
        Itablet note7Tab = note7Factory.getTablet("10.1", "8GB");
        IPhone note7 = note7Factory.getPhone("5.7", "6GB");
        IPhone note8 = note8Factory.getPhone("6.3", "8GB");
        Itablet note8Tab = note8Factory.getTablet("10.5", "8GB");
    }
}
