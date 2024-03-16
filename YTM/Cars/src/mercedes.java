public class mercedes extends araba implements Iaraba {

    boolean turbo = true;

    @Override

    public void hizlan(int hiz) {
        for (int i = 1; i < 10; i++) {
            System.out.println(i + ".saniyede hiz(turbo): " + hiz * 2 * i);
        }
    }

}
