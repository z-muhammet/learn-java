interface Kullanici {
    public boolean HesapOku();

    public boolean HesapTip();
}

interface Ivisitor {
    public Kullanici visit(String no);
}

class Yetkili implements Kullanici {
    private String no;

    Yetkili(String No) {
        No = no;
    }

    public boolean HesapTip() {
        // Hesap Tipi Okundu
        return true;
    }

    public boolean HesapOku() {
        // Hesap bilgileri Okundu
        return true;
    }

}

class DigerEleman implements Kullanici {
    private String no;

    DigerEleman(String No) {
        no = No;
    }

    @Override
    public boolean HesapTip() {
        return false;
    }

    public boolean HesapOku() {
        // Hesap bilgileri okundu
        return true;
    }
}

public class App {
    public static void main(String[] args) {
        Yetkili y1 = new Yetkili("1234");
        DigerEleman dE1 = new DigerEleman("1234");
        y1.HesapOku();
        dE1.HesapOku();
    }
}
