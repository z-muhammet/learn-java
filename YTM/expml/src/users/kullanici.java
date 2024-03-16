package users;

import DB.IcacheDatabase;

public abstract class kullanici {

    private String mail;
    private String sifre;
    private String ad;

    public kullanici(String ad, String mail, String sifre) {
        this.ad = ad;
        this.mail = mail;
        this.sifre = sifre;
    }

    public abstract adres getAdres();

    public abstract void urunlistele(IcacheDatabase cacheDatabase);

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}