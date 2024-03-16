public class bmw extends araba implements Iaraba {
    boolean klimali = true;

    @Override

    public void hizlan(int hiz) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ".saniyede hiz(klimali): " + (hiz * i) * 9 / 10);
        }
    }

}
