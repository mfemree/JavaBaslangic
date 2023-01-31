package Gun37._02_Soru;

public class Animal {

    private String cinsi;
    private String neredeYasar;

    public Animal(String cinsi, String neredeYasar) {
       setCinsi(cinsi);
       setNeredeYasar(neredeYasar);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    public String getNeredeYasar() {
        return neredeYasar;
    }

    public void setNeredeYasar(String neredeYasar) {
        this.neredeYasar = neredeYasar;
    }
}
