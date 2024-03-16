public class App {
    public static void main(String[] args) throws Exception {
        kullanici kullanici = new kullanici("hebele", null, null, null);
        sender sendmail = new mailgonder();
        sender sendbrowser = new tarayicigonder();

        sendmail.send(kullanici.getIsim());
        sendbrowser.send(kullanici.getIsim());
    }
}
