
package DB;

import urunislem.urun;
import users.kullanici;

public class MysqlVeritabani implements Iveritabani {
    @Override
    public void kullanicikaydet(kullanici kullanici, IcacheDatabase cacheDatabase) {

        cacheDatabase.kullaniciekle(kullanici);
        System.out.println(kullanici.getAd() + " Mysql veritabanina kaydedildi.");
    }

    public void urunKaydet(urun urun, IcacheDatabase cacheDatabase) {
        cacheDatabase.urunekle(urun);
        System.out.println(urun.getUrunad() + " Mysql veritabanina kaydedildi.");
    }

    public void odemeKaydet(String odeme, IcacheDatabase cacheDatabase) {
        cacheDatabase.odemeekle(odeme);
        System.out.println(odeme + " Mysql veritabanina kaydedildi.");
    }

    @Override
    public void baglan() {
        System.out.println("Mysql veritabanina baglanildi.");
    }

    @Override
    public void baglantiKes() {
        System.out.println("Mysql veritabanina baglanti kesildi.");
    }
}
