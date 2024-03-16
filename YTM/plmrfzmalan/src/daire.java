public class daire implements IalanHesap, IcevreHesap {
    private double yaricap;

    public daire(double yaricap) {
        this.yaricap = yaricap;
    }

    public double cevreHesap() {
        return 2 * Math.PI * yaricap;
    }

    public double alanHesap() {
        return Math.PI * yaricap * yaricap;
    }
}
