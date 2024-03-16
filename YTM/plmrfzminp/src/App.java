public class App {
    public static void main(String[] args) throws Exception {
        sekil sekil = new sekil();

        IMathOperation[] iMathOperation = new IMathOperation[10];
        IsekilAlan alansIsekil[] = new IsekilAlan[5];
        alansIsekil[0] = new kare(5);
        alansIsekil[1] = new dikdortgen(1, 2);
        alansIsekil[2] = new ucgen(1, 2, 3);
        System.out.println("Alan Toplam: " + sekil.alantoplam(alansIsekil));
        iMathOperation[0] = new kare(5);
        iMathOperation[1] = new dikdortgen(1, 2);
        iMathOperation[2] = new ucgen(1, 2, 3);
        System.out.println("Alan Toplam: " + sekil.alantoplam(iMathOperation));

    }

}
