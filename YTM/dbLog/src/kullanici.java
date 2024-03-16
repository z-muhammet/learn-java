public class kullanici {

    String isim;
    String mail;
    String ip;
    String telefon;

    public kullanici(String isim, String mail, String ip, String telefon) {
        this.isim = isim;
        this.mail = mail;
        this.ip = ip;
        this.telefon = telefon;
    }

    public String getIsim() {
        return isim;
    }

    public String getMail() {
        return mail;
    }

    public String getIp() {
        return ip;
    }

    public String getTelefon() {
        return telefon;
    }

}