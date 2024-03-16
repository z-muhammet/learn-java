public class maashesap {
    public maashesap(isci isciOgesi) {
        System.out.println("Maas: " + isciOgesi.getAylikCalisma() * isciOgesi.getSaatlikMaas());
    }

    public maashesap(muhendis muhendisOgesi) {
        System.out.println("Maas: " + muhendisOgesi.getAylikCalisma() * muhendisOgesi.getSaatlikMaas());
    }

}
