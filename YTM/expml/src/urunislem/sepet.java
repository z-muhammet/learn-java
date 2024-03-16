package urunislem;

public class sepet extends odeme {

    private urun[] urunler = new urun[10];

    public urun[] getsepet() {
        return urunler;
    }

    public void urunekle(urun urun) {
        for (int k = 0; k < urunler.length; k++) {
            if (urunler[k] == null) {
                urunler[k] = urun;
                return;
            }
        }
    }

    public void uruncikar(urun urun) {
        for (int i = 0; i < urunler.length; i++) {
            if (urunler[i].getUrunad() == urun.getUrunad()) {
                urunler[i] = null;
                for (int j = i; j < urunler.length - 1; j++) {
                    urunler[j] = urunler[j + 1];
                }
            }
        }
    }

    public void sepetlistele() {
        for (urun urunler : urunler) {
            if (urunler != null)
                System.out.println(urunler.getUrunad() + " " + urunler.getUrunfiyat());
        }
    }

}