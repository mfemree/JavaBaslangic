package Gun34.Ornek_03;

public class Ogrenci {

    private final int id;
    private String isim;
    private OgrTip tipi;


    public Ogrenci( String isim, OgrTip tipi, int id) {
      setIsim(isim);
      setTipi(tipi);
      this.id=id;

    }

    // set ID ye gerek kalmadi. cunku kendimiz ekliyoruz

    public int getId() {
        return id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public OgrTip getTipi() {
        return tipi;
    }

    public void setTipi(OgrTip tipi) {
        this.tipi = tipi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                '}';
    }
}
