import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        pano cevrepano = new cevrepano();
        pano alanpano = new alanpano();
        ArrayList<Isekil> sekiller = new ArrayList<Isekil>();
        sekiller.add(new kare(0));
        sekiller.add(new daire(2));
        sekiller.add(new cember(3));
        sekiller.add(new ucgen(3, 4, 5));
        System.out.println("Çevre Pano: " + cevrepano.hesapla(sekiller));
        System.out.println("Alan Pano: " + alanpano.hesapla(sekiller));

    }
}
