public class sekil {
    private String turu;
    private int kenarsayisi;
    private double baslangicNoktasi;
    // tum kenarlar esit oldugu icin sadece bir kenar uzunlugu tanimladim
    private int kenarUzunlugu;
    // tum kenarlar esit oldugu icin sadece bir kenar kalınlıgı tanimladim
    private int kenarKalinligi;
    private String kenarRengi;
    private String dolguRengi;

    public sekil(String turu) {
        this.turu = turu;
    }

    public void setTuru(String turu) {
        this.turu = turu;
    }

    public void setKenarsayisi(int kenarsayisi) {
        this.kenarsayisi = kenarsayisi;
    }

    public void setBaslangicNoktasi(double baslangicNoktasi) {
        this.baslangicNoktasi = baslangicNoktasi;
    }

    public void setKenarUzunlugu(int kenarUzunlugu) {
        this.kenarUzunlugu = kenarUzunlugu;
    }

    public void setKenarKalinligi(int kenarKalinligi) {
        this.kenarKalinligi = kenarKalinligi;
    }

    public void setKenarRengi(String kenarRengi) {
        this.kenarRengi = kenarRengi;
    }

    public void setDolguRengi(String dolguRengi) {
        this.dolguRengi = dolguRengi;
    }

    @Override 
    public String toString() {
        return "baslangicNoktasi=" + baslangicNoktasi + ", kenarKalinligi="
                + kenarKalinligi + ", kenarRengi=" + kenarRengi+ ", dolguRengi=" + dolguRengi + ", kenarUzunlugu=" + kenarUzunlugu + ", kenarsayisi="
                + kenarsayisi + ", turu=" + turu ;
    }
}
