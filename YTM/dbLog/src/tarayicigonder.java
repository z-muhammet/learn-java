public class tarayicigonder implements sender {
    bildirim tarayici = new tarayici();

    @Override
    public void send(String isim) {
        tarayici.gonder(isim);
    }
}
