package urunislem;

import users.kullanici;

public class urun {
    private String urunad;
    private int urunfiyat;
    private kullanici ekleyenKullanici;

    public urun(String urunad, int urunfiyat, kullanici ekleyenKullanici) {
        this.urunad = urunad;
        this.urunfiyat = urunfiyat;
        this.ekleyenKullanici = ekleyenKullanici;
    }

    public kullanici getEkleyenKullanici() {
        return ekleyenKullanici;
    }

    public void setEkleyenKullanici(kullanici ekleyenKullanici) {
        this.ekleyenKullanici = ekleyenKullanici;
    }

    public String getUrunad() {
        return urunad;
    }

    public int getUrunfiyat() {
        return urunfiyat;
    }

    public void setUrunad(String urunad) {
        this.urunad = urunad;
    }

    public void setUrunfiyat(int urunfiyat) {
        this.urunfiyat = urunfiyat;
    }
}
