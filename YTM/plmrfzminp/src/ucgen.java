public class ucgen implements IMathOperation, IsekilAlan {
    double a, b, c;

    public ucgen(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double alan() {
        return a * b / 2;
    }

    public double cevre() {
        return a + b + c;
    }
}
