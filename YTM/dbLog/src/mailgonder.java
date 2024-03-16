public class mailgonder implements sender {
    bildirim mail = new mail();

    @Override
    public void send(String isim) {
        mail.gonder(isim);
    }
}
