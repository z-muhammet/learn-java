public class MainUser {
    private String name;
    private String kimlik;
    private double tl;
    private double toplamVarlik;

    public double getToplamVarlik() {
        return this.toplamVarlik;
    }

    public void setToplamVarlik(double toplamVarlik) {
        this.toplamVarlik = toplamVarlik;
    }

    public MainUser() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKimlik() {
        return kimlik;
    }

    public void setKimlik(String kimlik) {
        this.kimlik = kimlik;
    }

    public double getTl() {
        return tl;
    }

    public void setTl(Double tl) {
        this.tl = tl;
    }

}