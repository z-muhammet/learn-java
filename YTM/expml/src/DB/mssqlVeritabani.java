
package DB;

import urunislem.urun;
import users.kullanici;

public class mssqlVeritabani implements Iveritabani {

    @Override

    public void kullanicikaydet(kullanici kullanici, IcacheDatabase cacheDatabase) {
        cacheDatabase.kullaniciekle(kullanici);

        System.out.println(kullanici.getAd() + " Mssql veritabanina kaydedildi.");
    }

    public void urunKaydet(urun urun, IcacheDatabase cacheDatabase) {
        cacheDatabase.urunekle(urun);
        System.out.println(urun.getUrunad() + " Mssql veritabanina kaydedildi.");
    }

    @Override
    public void odemeKaydet(String odeme, IcacheDatabase cacheDatabase) {
        cacheDatabase.odemeekle(odeme);
        System.out.println(odeme + " Mssql veritabanina kaydedildi.");
    }

    @Override
    public void baglan() {
        System.out.println("Mssql veritabanina baglanildi.");
    }

    @Override
    public void baglantiKes() {
        System.out.println("Mssql veritabanina baglanti kesildi.");
    }

}
