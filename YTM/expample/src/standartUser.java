
public class standartUser extends MainUser {

    public standartUser(String name, String kimlik) {
        super.setName(name);
        super.setKimlik(kimlik);
    }

    public void setToplamVarlik(double toplamVarlik) {
        
        super.setToplamVarlik(toplamVarlik);
    }
    public double getToplamVarlik() {
        return super.getToplamVarlik();
    }

}