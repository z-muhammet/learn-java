import DB.IcacheDatabase;
import users.kullanici;

public class giris {
    kullanici girisyapan;

    public boolean girisYap(String mail, String sifre, IcacheDatabase cacheDatabase) {
        kullanici[] kullanicilar = cacheDatabase.getKullanicilar();
        for (kullanici kullanici : kullanicilar) {
            if (kullanici.getMail().equals(mail) && kullanici.getSifre().equals(sifre)) {
                this.girisyapan = kullanici;
                return true;
            }
        }
        System.out.println("Kullanici bulunamadi.");
        return false;

    }
}
