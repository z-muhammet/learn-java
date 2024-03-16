public class standartMoneyMenager extends moneyMenager {

    public void eft(double gonderilecekTutar, standartUser user) {
        if (user.getToplamVarlik() >= gonderilecekTutar + (20 + (gonderilecekTutar * 5) / 100)) {
            user.setToplamVarlik(user.getToplamVarlik() - gonderilecekTutar + (20 + (gonderilecekTutar * 5) / 100));
            System.out.println("Eft işlemi gerçekleşti.");
        } else {
            System.out.println("Eft işlemi gerçekleşmedi. yetersiz bakiye");
        }
    }

}
