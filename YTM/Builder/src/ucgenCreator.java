
public class ucgenCreator implements IsekilCreator {

    public sekil sekil;

    public ucgenCreator() {
        this.sekil = new sekil("ucgen");
    }
    @Override
    public void kenarUzunluguOlustur() {
        sekil.setKenarUzunlugu(0);
    }

    @Override
    public void kenarKalinligiOlustur() {
        sekil.setKenarKalinligi(0);
    }

    @Override
    public void kenarRengiOlustur() {
        sekil.setKenarRengi("kirmizi");
    }

    @Override
    public void kenarSayisiOlustur() {
        sekil.setKenarsayisi(3);
    }

    @Override
    public void baslangicNoktasiOlustur() {
        sekil.setBaslangicNoktasi(0);
    }

    @Override
    public void turuOlustur() {
        sekil.setTuru("ucgen");
    }

    @Override
    public void dolguRengiOlustur() {
        sekil.setDolguRengi("siyah");
    }

    @Override
    public sekil getSekil() {
        return sekil;
    }
}
