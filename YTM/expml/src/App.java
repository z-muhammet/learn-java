import DB.MysqlVeritabani;
import DB.cacheDatabase;
import DB.mssqlVeritabani;
import urunislem.odeme;
import urunislem.urun;
import users.adres;
import users.musteri;
import users.satici;

public class App {
    public static void main(String[] args) throws Exception {
        cacheDatabase cacheDatabase = new cacheDatabase();
        mssqlVeritabani mssqlVeritabani = new mssqlVeritabani();
        MysqlVeritabani MysqlVeritabani = new MysqlVeritabani();
        odeme odeme = new odeme();
        satici satici = new satici("mailsatici", "sifre", "firmaAdi", new adres("il", "ilce"));
        mssqlVeritabani.kullanicikaydet(satici, cacheDatabase);
        musteri musteri = new musteri("ad", "mail", "sifre", new adres("il", "ilce"), new adres("il", "ilce"));
        MysqlVeritabani.kullanicikaydet(musteri, cacheDatabase);
        giris giris = new giris();
        if (giris.girisYap("mail", "sifre", cacheDatabase)) {
            System.out.println(
                    "Giris basarili. giriş yapan birim: " + giris.girisyapan.getClass().getSimpleName() + " ad: "
                            + giris.girisyapan.getAd());
            satici.urunEkle(new urun("telefon", 1, satici), MysqlVeritabani, cacheDatabase);
            satici.urunEkle(new urun("pc", 2, satici), MysqlVeritabani, cacheDatabase);
            System.out.println("Urunler: ");
            giris.girisyapan.urunlistele(cacheDatabase);
            System.out.println("Sepet: ");
            musteri.getSepet().urunekle(cacheDatabase.getUrunler()[0]);
            musteri.getSepet().sepetlistele();
            odeme.odemeYap(musteri, MysqlVeritabani, cacheDatabase);
        } else {
            System.out.println("Giris basarisiz.");
        }
    }
}
