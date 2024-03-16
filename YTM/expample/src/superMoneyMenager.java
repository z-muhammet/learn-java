public class superMoneyMenager extends moneyMenager {

    public void eft(double gonderilecekTutar, superUser user) {
        if (user.getToplamVarlik() >= gonderilecekTutar + 20) {
            user.setToplamVarlik(user.getToplamVarlik() - gonderilecekTutar + 20);
            System.out.println("Eft işlemi gerçekleşti.");
        } else {
            System.out.println("Eft işlemi gerçekleşmedi. yetersiz bakiye");
        }
    }

    public void swift(double gonderilecekTutar, superUser user) {
        if (user.getToplamVarlik() >= gonderilecekTutar + 500) {
            user.setToplamVarlik(user.getToplamVarlik() - gonderilecekTutar + 500);
            System.out.println("Swift işlemi gerçekleşti.");
        } else {
            System.out.println("Swift işlemi gerçekleşmedi. yetersiz bakiye");
        }

    }

}
