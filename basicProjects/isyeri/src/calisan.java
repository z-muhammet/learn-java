public class calisan {
    private int saatlikMaas;
    private String ad;
    private int aylikCalisma;

    public calisan() {

    }

    public calisan(isci isciOgesi) {
        isciOgesi.setSaatlikMaas(isciOgesi.getSaatlikMaas());
        isciOgesi.setAd(isciOgesi.getAd());
        isciOgesi.setAylikCalisma(getAylikCalisma());
    }

    public calisan(muhendis muhendisOgesi) {
        muhendisOgesi.setAd(muhendisOgesi.getAd());
        muhendisOgesi.setAylikCalisma(getAylikCalisma());
        muhendisOgesi.setSaatlikMaas(muhendisOgesi.getSaatlikMaas());
    }

    public int getSaatlikMaas() {
        return saatlikMaas;
    }

    public void setSaatlikMaas(int saatlikMaas) {
        this.saatlikMaas = saatlikMaas;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setAylikCalisma(int aylikCalisma) {
        this.aylikCalisma = aylikCalisma;
    }

    public String getAd() {
        return ad;
    }

    public int getAylikCalisma() {
        return aylikCalisma;
    }

}