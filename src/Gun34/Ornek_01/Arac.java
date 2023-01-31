package Gun34.Ornek_01;

public class Arac {

    private String renk;
    private int motorHacmi;
    private String marka;


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
    public double getMotorHacmi() {
        return motorHacmi;
    }
    public void setMotorHacmi(int motorHacmi) {
        this.motorHacmi = motorHacmi;
    }
    public String getMarka() {
        return marka;
    }
    public void setMarka(String marka) {
        this.marka = marka;
    }
    public Arac (String renk, int motorHacmi, String marka) {
        setMarka(marka);
        setRenk(renk);
        setMotorHacmi(motorHacmi);
    }

    @Override
    public String toString() {
        return "Arac{" +
                "renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", marka='" + marka + '\'' +
                '}';
    }
}
