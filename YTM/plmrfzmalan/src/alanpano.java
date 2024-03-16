import java.util.ArrayList;

public class alanpano implements pano {

    @Override
    public double hesapla(ArrayList<Isekil> sekiller) {
        double toplam = 0;
        for (Isekil sekil : sekiller) {
            if (sekil instanceof IalanHesap) {
                toplam += ((IalanHesap) sekil).alanHesap();
            }
        }
        return toplam;
    }

}
