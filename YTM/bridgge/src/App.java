interface Iuret {
    public void uret();
}

class kirmizi implements Iuret {
    public void uret() {
        System.out.print("kirmizi");
    }
}
class mavi implements Iuret {
    public void uret() {
        System.out.print("mavi");
    }
}


class uret {
    public Iuret uret;

    public uret(Iuret uret) {
        this.uret = uret;
    }

    public void uret() {
        this.uret.uret();
    }
}

class a4uret extends uret {
    public a4uret(Iuret uret) {
        super.uret=uret;
        
    }

    public void uret() {
        super.uret();
        System.out.println(" a4 class");
    }
}

class a5uret extends uret {
    public a5uret(Iuret uret) {
        super(uret);
    }

    public void uret() {
        super.uret();
                System.out.println(" a5 class");
    }
}


public class App {
    public static void main(String[] args) {

        uret a4k = new a4uret(new kirmizi());
        uret a4m = new a4uret(new mavi());
        uret a5m = new a5uret(new mavi());
        uret a5k = new a5uret(new kirmizi());

        a4k.uret();
        a4m.uret();
        a5m.uret();
        a5k.uret();

    }
    
}