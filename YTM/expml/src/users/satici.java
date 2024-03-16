package users;

import DB.IcacheDatabase;
import DB.Iveritabani;
import urunislem.urun;

public class satici extends kullanici {
    private String firmaAdi;
    private adres firmaAdres;

    public satici(String mail, String sifre, String firmaAdi, adres firmaAdres) {
        super(firmaAdi, mail, sifre);
        this.firmaAdi = firmaAdi;
        this.firmaAdres = firmaAdres;
    }

    public String getFirmaAdi() {
        return firmaAdi;
    }

    public adres getAdres() {
        return firmaAdres;
    }

    public void setAdres(adres adres) {
        this.firmaAdres = adres;
    }

    public adres getFirmaAdres() {
        return firmaAdres;
    }

    public void setFirmaAdi(String firmaAdi) {
        super.setAd(firmaAdi);
        this.firmaAdi = firmaAdi;
    }

    public void urunEkle(urun urun, Iveritabani iveritabani, IcacheDatabase icacheDatabase) {
        iveritabani.urunKaydet(urun, icacheDatabase);
    }

    @Override
    public void urunlistele(IcacheDatabase cacheDatabase) {
        urun[] urunler1 = cacheDatabase.getUrunler();
        for (urun urunler : urunler1) {
            if (urunler != null) {
                System.out.println(urunler.getUrunad() + " " + urunler.getUrunfiyat() + " "
                        + urunler.getEkleyenKullanici().getAd() + " " + urunler.getEkleyenKullanici().getAdres().getIl()
                        + "/" + urunler.getEkleyenKullanici().getAdres().getIlce());
            }
        }
    }
}
