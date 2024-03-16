public class sekil {

    public double alan(IMathOperation iMathOperation) {
        return iMathOperation.alan();
    }

    public double cevre(IMathOperation iMathOperation) {
        return iMathOperation.cevre();
    }

    public double alantoplam(IMathOperation[] iMathOperation) {

        double toplam = 0;

        for (IMathOperation iMathOperation2 : iMathOperation) {
            if (iMathOperation2 != null)
                toplam += iMathOperation2.alan();
        }

        return toplam;
    }

    public double alantoplam(IsekilAlan[] isekilAlans) {

        double toplam = 0;

        for (IsekilAlan iMathOperation2 : isekilAlans) {
            if (iMathOperation2 != null)
                toplam += iMathOperation2.alan();
        }

        return toplam;
    }

}