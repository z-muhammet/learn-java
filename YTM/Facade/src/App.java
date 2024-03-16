interface Iplan {
    void planla();
}

/**
 * etkinlikMekani implements Iplan
 */
class etkinlikMekani implements Iplan {
     String mekanIsmi ;
     String mekanAdresi ;
     String mekanTelefonu ;
     float mekanUcreti;
    public etkinlikMekani(String mekanIsmi, String mekanAdresi, String mekanTelefonu, float mekanUcreti) {
        this.mekanIsmi = mekanIsmi;
        this.mekanAdresi = mekanAdresi;
        this.mekanTelefonu = mekanTelefonu;
        this.mekanUcreti = mekanUcreti;
    }
    public void planla() {
        System.out.println("etkinlik "+mekanIsmi+" mekanında planlandı adresi: "+mekanAdresi+" telefonu: "+mekanTelefonu+" ücreti: "+mekanUcreti);
    }

}

/**
 * ulasim implements Iplan
 */
class ulasim implements Iplan {
    String ulasimTipi;
    float ulasimUcreti;
    String ulsasimfirmasi;
    public ulasim(String ulasimTipi, Float ulasimUcreti, String ulsasimfirmasi) {
        this.ulasimTipi = ulasimTipi;
        this.ulasimUcreti = ulasimUcreti;
        this.ulsasimfirmasi = ulsasimfirmasi;
    }

    public void planla() {
        System.out.println("Ulaşım planlandı "+" Ulaşım tipi: "+ulasimTipi+" Ulaşım ücreti: "+ulasimUcreti+" Ulaşım firması: "+ulsasimfirmasi);
    }

}

/**
 * konaklama implements Iplan
 */
class konaklama implements Iplan {
    String konaklamaTipi;
    float konaklamaUcreti;
    String konaklamaAdresi;
    public konaklama(String konaklamaTipi, float konaklamaUcreti, String konaklamaAdresi) {
        this.konaklamaTipi = konaklamaTipi;
        this.konaklamaUcreti = konaklamaUcreti;
        this.konaklamaAdresi = konaklamaAdresi;
    }

    public void planla() {
        System.out.println("Konaklama planlandı "+ " Konaklama tipi: "+konaklamaTipi+" Konaklama ücreti: "+konaklamaUcreti+" Konaklama adresi: "+konaklamaAdresi);
    }

}

/**
 * etkinlikFACADE
 */
 class etkinlikFACADE {
    private etkinlikMekani etkinlikmekani;
    private ulasim ulasim;
    private konaklama konaklama;
    
    public etkinlikFACADE() {
    }
    public void dugunplanla(String mekanIsmi, String mekanAdresi, String mekanTelefonu, float mekanUcreti, String ulasimTipi, Float ulasimUcreti, String ulsasimfirmasi, String konaklamaTipi, float konaklamaUcreti, String konaklamaAdresi) {
        etkinlikmekani = new etkinlikMekani(mekanIsmi, mekanAdresi, mekanTelefonu, mekanUcreti);
        ulasim = new ulasim(ulasimTipi, ulasimUcreti, ulsasimfirmasi);
        konaklama = new konaklama(konaklamaTipi, konaklamaUcreti, konaklamaAdresi);
        etkinlikmekani.planla();
        ulasim.planla();
        konaklama.planla();
        System.out.println("toplam ücret: "+(mekanUcreti+ulasimUcreti+konaklamaUcreti));
    }

    public void basitEtkinlikPlanla(String mekanIsmi, String mekanAdresi, String mekanTelefonu, float mekanUcreti) {
        etkinlikmekani = new etkinlikMekani(mekanIsmi, mekanAdresi, mekanTelefonu, mekanUcreti);
        etkinlikmekani.planla();
        System.out.println("toplam ücret: "+mekanUcreti);
    }
    public void ulasimlieglence(String mekanIsmi, String mekanAdresi, String mekanTelefonu, float mekanUcreti, String ulasimTipi, Float ulasimUcreti, String ulsasimfirmasi) {
        etkinlikmekani = new etkinlikMekani(mekanIsmi, mekanAdresi, mekanTelefonu, mekanUcreti);
        ulasim = new ulasim(ulasimTipi, ulasimUcreti, ulsasimfirmasi);
        etkinlikmekani.planla();
        ulasim.planla();
        System.out.println("toplam ücret: "+(mekanUcreti+ulasimUcreti));
    }

    public void konaklamaliEtkinlik(String mekanIsmi, String mekanAdresi, String mekanTelefonu, float mekanUcreti, String konaklamaTipi, float konaklamaUcreti, String konaklamaAdresi) {
        etkinlikmekani = new etkinlikMekani(mekanIsmi, mekanAdresi, mekanTelefonu, mekanUcreti);
        konaklama = new konaklama(konaklamaTipi, konaklamaUcreti, konaklamaAdresi);
        etkinlikmekani.planla();
        konaklama.planla();
        System.out.println("toplam ücret: "+(mekanUcreti+konaklamaUcreti));
    }
    
}


public class App {
   
    public static void main(String[] args) {
        etkinlikFACADE facadeetk = new etkinlikFACADE();
        facadeetk.dugunplanla("düğün salonu", "istanbul", "0212",1000.0f, "otobüs", 100.0f, "otobüs firması", "otel", 500.0f, "istanbul");
        facadeetk.basitEtkinlikPlanla("düğün salonu", "istanbul", "0212",1000.0f);
        facadeetk.ulasimlieglence("düğün salonu", "istanbul", "0212",1000.0f, "otobüs", 100.0f, "otobüs firması");
        facadeetk.konaklamaliEtkinlik("düğün salonu", "istanbul", "0212",1000.0f, "otel", 500.0f, "istanbul");
    }
}
