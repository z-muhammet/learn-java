public class mail implements bildirim {
    @Override
    public void gonder(String iString) {
        System.out.println(iString + "isimli kullaniciya " + "Mail bildirimi gonderildi.");
    }
}
