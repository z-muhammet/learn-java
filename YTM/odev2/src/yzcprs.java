public class yzcprs {

    fonkyzc FK;

    public yzcprs(fonkyzc yazici) {
        FK = yazici;
    }

    public void Yazdir() {
        ((yazdirfonk) FK).yazdir();
    }

    public void Tara() {
        if (!(FK instanceof yazici2))

            ((tarafonk) FK).tara();
    }
}