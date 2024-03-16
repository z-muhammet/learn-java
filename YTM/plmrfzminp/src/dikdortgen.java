public class dikdortgen implements IMathOperation, IsekilAlan {
    double a, b;

    public dikdortgen(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double alan() {
        return a * b;
    }

    public double cevre() {
        return 2 * (a + b);
    }

}
