package Gun39._01_OOP_Soru;

public class Kartal extends Hayvan{

    public Kartal(String isim, boolean vahsi, String dogumTarihi) {
        super(isim, vahsi, dogumTarihi);
    }

    @Override
    void yiyecek() {
        System.out.println("et");

    }

    @Override
    void yemekMiktari() {
        System.out.println("gunluk 1 kilo");

    }

    @Override
    void gunlukUykuSuresi() {
        System.out.println("gunde 8 saat");

    }

    @Override
    void sesi() {
        System.out.println("ciyak fiyuuu");

    }
}
