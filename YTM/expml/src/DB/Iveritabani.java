package DB;

import urunislem.urun;
import users.kullanici;

public interface Iveritabani {

    void kullanicikaydet(kullanici kullanici, IcacheDatabase cacheDatabase);

    void urunKaydet(urun urun, IcacheDatabase cacheDatabase);

    void odemeKaydet(String odeme, IcacheDatabase cacheDatabase);

    void baglan();

    void baglantiKes();
}
