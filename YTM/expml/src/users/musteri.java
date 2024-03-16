package users;

import DB.IcacheDatabase;
import urunislem.sepet;
import urunislem.urun;

public class musteri extends kullanici {
    private adres kargoAdres;
    private adres faturaAdres;
    private sepet sepet;

    public musteri(String ad, String mail, String sifre, adres kargoAdres, adres faturaAdres) {
        super(ad, mail, sifre);
        this.kargoAdres = kargoAdres;
        this.faturaAdres = faturaAdres;
        this.sepet = new sepet();
    }

    public sepet getSepet() {
        return sepet;
    }

    @Override
    public adres getAdres() {
        return faturaAdres;
    }

    public adres getKargoAdres() {
        return kargoAdres;
    }

    public adres getFaturaAdres() {
        return faturaAdres;
    }

    public void setFaturaAdres(adres faturaAdres) {
        this.faturaAdres = faturaAdres;
    }

    public void setKargoAdres(adres kargoAdres) {
        this.kargoAdres = kargoAdres;
    }

    @Override
    public void urunlistele(IcacheDatabase cacheDatabase) {
        urun[] urunler1 = cacheDatabase.getUrunler();
        for (urun urunler : urunler1) {
            if (urunler != null)
                System.out.println(urunler.getUrunad() + " " + urunler.getUrunfiyat());
        }
    }

}
