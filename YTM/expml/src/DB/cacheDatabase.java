package DB;

import urunislem.urun;
import users.kullanici;

public class cacheDatabase implements IcacheDatabase {
    private urun[] urunler = new urun[10];
    private kullanici[] kullanicilar = new kullanici[10];
    private String[] odemeler = new String[10];

    public urun[] getUrunler() {
        return urunler;
    }

    public kullanici[] getKullanicilar() {
        return kullanicilar;
    }

    public String[] getOdemeler() {
        return odemeler;
    }

    public void urunekle(urun urun) {
        for (int k = 0; k < urunler.length; k++) {
            if (urunler[k] == null) {
                urunler[k] = urun;
                return;
            }
        }
    }

    public void kullaniciekle(kullanici kullanici) {
        for (int k = 0; k < kullanicilar.length; k++) {
            if (kullanicilar[k] == null) {
                kullanicilar[k] = kullanici;
                return;
            }
        }
    }

    public void odemeekle(String odeme) {
        for (int k = 0; k < odemeler.length; k++) {
            if (odemeler[k] == null) {
                odemeler[k] = odeme;
                return;
            }
        }
    }

}
