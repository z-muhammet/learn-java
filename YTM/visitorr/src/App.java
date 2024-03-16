import java.util.ArrayList;
import java.util.List;

interface Observer {
    public void update(Observable o);
}

abstract class Observable {
    public List<Observer> observerList;

    public Observable() {
        this.observerList = new ArrayList<Observer>();
    }

    public void addObserver(Observer o) {
        observerList.add(o);
    };

    public void removeObserver(Observer o) {
        observerList.remove(o);
    };

    public void notifyObservers(int yeniFiyat) {
        for (Observer o : observerList) {
            if (((Kullanici) o).getTeklif() < yeniFiyat)
            o.update(this);
        }
    };
}

class Kullanici implements Observer {
    private String isim;
    private String mail;
    private int Teklif;

    public Kullanici(String isim, String mail) {
        this.isim = isim;
        this.mail = mail;
    }

    public String getIsim() {
        return isim;
    }

    public int getTeklif() {
        return Teklif;
    }

    public void setTeklif(int teklif) {
        Teklif = teklif;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public void update(Observable o) {
        Urun urun = (Urun) o;
        System.out.println(this.isim + " kullanicisina fiyat degisimi " + urun.getFiyat() + " mail olarak bildirildi");
    }
}

class Urun extends Observable {
    private String ad;
    private int fiyat;

    public Urun(String ad, int fiyat) {
        this.ad = ad;
        this.fiyat = fiyat;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public void teklifVer(Observer o, int yeniFiyat) {
        ((Kullanici) o).setTeklif(yeniFiyat);
        if (this.fiyat < yeniFiyat) {
            this.fiyat = yeniFiyat;
            notifyObservers(yeniFiyat);
            if (observerList.contains(o) == false) {
                addObserver(o);
            } 
        }
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        Kullanici sefa = new Kullanici("Sefa Aras", "sefa@ktu.edu");
        Kullanici hakan = new Kullanici("Hakan Bozkurt", "hakan@ktu.edu");

        Urun bilgisayar = new Urun("Bilgisayar", 100);

        System.out.println("1. Teklif");
        bilgisayar.teklifVer(sefa, 50);
        System.out.println("2. Teklif");
        bilgisayar.teklifVer(hakan, 150);
        System.out.println("3. Teklif");
        bilgisayar.teklifVer(sefa, 200);
        System.out.println("4. Teklif");
        bilgisayar.teklifVer(hakan, 250);
        System.out.println("5. Teklif");
        bilgisayar.teklifVer(sefa, 350);
        System.out.println("6. Teklif");
        bilgisayar.teklifVer(hakan, 300);
    }
}