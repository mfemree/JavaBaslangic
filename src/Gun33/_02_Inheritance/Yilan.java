package Gun33._02_Inheritance;

public class Yilan extends Hayvan {

    private double uzunluk;

    public Yilan (String renk, int kilo, String cinsi, double uzunluk) {
        super(renk, kilo, cinsi);
        setUzunluk(uzunluk);
    }

    @Override
    public void konustu() {
        konustu();
        System.out.println("ssssssssss");
    }

    public double getUzunluk() {
        return uzunluk;
    }

    public void setUzunluk(double uzunluk) {
        this.uzunluk = uzunluk;
    }
}
