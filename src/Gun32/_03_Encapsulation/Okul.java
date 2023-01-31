package Gun32._03_Encapsulation;

import java.util.ArrayList;

public class Okul {
    private String okulAd;
    private int kontejyan;
    private ArrayList <Ogrenci> ogrenciler = new ArrayList<>();

    public Okul(String okulAd, int kontejyan) {
        setOkulAd(okulAd);
        setKontejyan(kontejyan);
    }

    public String getOkulAd() {return okulAd; }
    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }
    public int getKontejyan() {
        return kontejyan;
    }
    public void setKontejyan(int kontejyan) {
        this.kontejyan = kontejyan;
    }

    public ArrayList<Ogrenci> getOgrenciler() {return ogrenciler;}

    public void setOgrenciler(ArrayList<Ogrenci> ogrenciler) { this.ogrenciler = ogrenciler; }

    @Override
    public String toString() {
        return "Okul{" +
                "okulAd='" + okulAd + '\'' +
                ", kontejyan=" + kontejyan +
                ", ogrenciler=" + ogrenciler +
                '}';
    }
}

