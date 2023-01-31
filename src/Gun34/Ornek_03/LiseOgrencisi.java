package Gun34.Ornek_03;

public class LiseOgrencisi extends Ogrenci {

    private String brans;
    private static int LiseIdSayac=1;

    public LiseOgrencisi(String isim, OgrTip tipi, String brans) {
        super(isim, tipi, LiseIdSayac++);
        setBrans(brans);
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
