package Gun34.Ornek_03;

public class IlkOgrencisi extends Ogrenci {

    private String klup;
    private static int IlkIdSayac=1;


    public IlkOgrencisi(String isim, OgrTip tipi, String klup ) {
        super(isim, tipi, IlkIdSayac++);
        setKlup(klup);
    }

    public String getKlup() {
        return klup;
    }

    public void setKlup(String klup) {
        this.klup = klup;
    }


}
