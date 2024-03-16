
package DB;

import urunislem.urun;
import users.kullanici;

public interface IcacheDatabase {
    public void kullaniciekle(kullanici kullanici);

    public void urunekle(urun urun);

    public urun[] getUrunler();

    public kullanici[] getKullanicilar();

    public void odemeekle(String odeme);
}
