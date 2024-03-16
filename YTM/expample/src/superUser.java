public class superUser extends MainUser {
    double doviz;

    public superUser(String name, String kimlik) {
        super.setName(name);
        super.setKimlik(kimlik);
    }

    public double getToplamVarlik() {
        super.setToplamVarlik(super.getTl() + this.getDoviz() * 30);
        return super.getTl() + this.getDoviz() * 30;
    }

    public double getDoviz() {
        return doviz;
    }

    public void setDoviz(double doviz) {
        this.doviz = doviz;
    }

}