public class besgenCreator implements IsekilCreator{
    sekil sekil;

    public besgenCreator(){
        this.sekil=new sekil("besgen");
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
    public void kenarRengiOlustur(){
        sekil.setKenarRengi("mavi");
    }
    @Override
    public void dolguRengiOlustur(){
        sekil.setDolguRengi("sari");
    }
    public void kenarSayisiOlustur(){
        sekil.setKenarsayisi(5);
    }
    public void baslangicNoktasiOlustur(){
        sekil.setBaslangicNoktasi(0);
    }
    public void turuOlustur(){
        sekil.setTuru("besgen");
    }
    @Override
    public sekil getSekil() {
        return sekil;
    }

}
