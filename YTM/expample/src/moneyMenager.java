
public class moneyMenager {
    public moneyMenager() {

    }

    public void havale(Double gonderilecekTutar, MainUser user) {
        if (user.getToplamVarlik() >= gonderilecekTutar) {
            user.setToplamVarlik(user.getToplamVarlik() - gonderilecekTutar);
            System.out.println("Havale işlemi gerçekleşti.");
        } else {
            System.out.println("Havale işlemi gerçekleşmedi. yetersiz bakiye");
        }
    }

}