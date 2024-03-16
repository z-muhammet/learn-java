public class ucgen implements IalanHesap, IcevreHesap {
    private double kenar1;
    private double kenar2;
    private double kenar3;

    public ucgen(double kenar1, double kenar2, double kenar3) {
        this.kenar1 = kenar1;
        this.kenar2 = kenar2;
        this.kenar3 = kenar3;
    }

    public double cevreHesap() {
        return kenar1 + kenar2 + kenar3;
    }

    public double alanHesap() {
        double u = (kenar1 + kenar2 + kenar3) / 2;
        return Math.sqrt(u * (u - kenar1) * (u - kenar2) * (u - kenar3));
    }
}
