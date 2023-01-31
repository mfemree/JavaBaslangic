package Gun39._01_OOP_Soru;

public abstract class Hayvan {

    private final int id;
    private String isim;
    private boolean vahsi;
    private String dogumTarihi;

    abstract void yiyecek();
    abstract void yemekMiktari();
    abstract void gunlukUykuSuresi();
    abstract void sesi();
    private static  int idSayac=1;


    public Hayvan(String isim, boolean vahsi, String dogumTarihi) {

        setIsim(isim);
        setVahsi(vahsi);
        setDogumTarihi(dogumTarihi);
        this.id= idSayac++;
    }


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public boolean isVahsi() {
        return vahsi;
    }
    public void setVahsi (boolean vahsi) {
        this.vahsi = vahsi;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        System.out.println("yiyecegi="); yiyecek();
        System.out.println("yemek mik="); yemekMiktari();
        System.out.println("uykus suresi="); gunlukUykuSuresi();
        System.out.println("sesi="); sesi();

        return "Hayvan{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", vahsi=" + vahsi +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                "}\n";
    }
}