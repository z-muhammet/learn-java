public class cember implements IcevreHesap {
    private double yaricap;

    public cember(double yaricap) {
        this.yaricap = yaricap;
    }

    public double cevreHesap() {
        return 2 * Math.PI * yaricap;
    }
}