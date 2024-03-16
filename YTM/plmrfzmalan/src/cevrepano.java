import java.util.ArrayList;

public class cevrepano implements pano {

    @Override
    public double hesapla(ArrayList<Isekil> sekiller) {
        double toplam = 0;
        for (Isekil sekil : sekiller) {
            if (sekil instanceof IcevreHesap) {
                toplam += ((IcevreHesap) sekil).cevreHesap();
            }
        }
        return toplam;
    }
}