package urunislem;

import DB.IcacheDatabase;
import DB.Iveritabani;
import users.musteri;

public class odeme {

    public odeme() {
    }

    public void odemeYap(musteri kullanici, Iveritabani veritabani, IcacheDatabase cacheDatabase) {
        String odeme;
        urun[] sepet = kullanici.getSepet().getsepet();
        for (urun sepeturunler : sepet) {
            if (sepeturunler != null) {
                odeme = kullanici.getAd() + " isimli kullanici " + sepeturunler.getUrunad()
                        + " isimli ürünü satin alarak "
                        + sepeturunler.getUrunfiyat() + " Odeme yapti.";
                veritabani.odemeKaydet(odeme, cacheDatabase);
            }
        }
    }
}
