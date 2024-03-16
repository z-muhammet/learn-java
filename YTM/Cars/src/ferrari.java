public class ferrari extends araba implements Iaraba {
    boolean turbo = true;
    boolean klimali = true;

    @Override
    public void hizlan(int hiz) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ".saniyede hiz(turbo,klimali): " + (hiz * 2 * i) * 9 / 10);
        }
    }

}
