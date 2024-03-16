public class kare implements IMathOperation, IsekilAlan {
    double x;

    public kare(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double alan() {
        return x * x;
    }

    @Override
    public double cevre() {
        return 4 * x;
    }
}
