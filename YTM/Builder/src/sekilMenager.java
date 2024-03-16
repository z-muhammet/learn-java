public class sekilMenager {
    private IsekilCreator isekilCreator;

    public sekilMenager(IsekilCreator isekilCreator) {
        this.isekilCreator = isekilCreator;
    }

    public void sekilOlustur() {
        isekilCreator.turuOlustur();
        isekilCreator.kenarSayisiOlustur();
        isekilCreator.baslangicNoktasiOlustur();
        isekilCreator.kenarUzunluguOlustur();
        isekilCreator.kenarKalinligiOlustur();
        isekilCreator.kenarRengiOlustur();
        isekilCreator.dolguRengiOlustur();
    }

    public sekil getSekil() {
        return isekilCreator.getSekil();
    }

}
