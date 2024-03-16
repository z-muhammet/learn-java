public class kare implements IalanHesap, IcevreHesap {
    private double kenar;

    public kare(double kenar) {
        this.kenar = kenar;
    }

    public double cevreHesap() {
        return 4 * kenar;
    }

    public double alanHesap() {
        return kenar * kenar;
    }
}
