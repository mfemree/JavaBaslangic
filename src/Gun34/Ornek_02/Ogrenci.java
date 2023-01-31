package Gun34.Ornek_02;

public class Ogrenci {

    private final int id;   // sonradan degistirilemesin diye final yaptik
    private String isim;
    private OgrTip tipi;
    private static int idSayac=1;

    public Ogrenci( String isim, OgrTip tipi) {
      setIsim(isim);
      setTipi(tipi);
      this.id = idSayac++;  // final yaptigimiz icin burayi da bu sekilde yazdik. yani set id ye ihtiyacimiz kalmadi.
                            // yoksa setIdSayac(idSayac) seklinde de yazabilirdik.
                            // set ID ye gerek kalmadi. cunku kendimiz elle/sayacla ayarliyoruz.
    }

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

    public static int getIdSayac() {
        return idSayac;
    }

    public static void setIdSayac(int idSayac) {
        Ogrenci.idSayac = idSayac;
    }

    @Override
    public String toString() {
        return "Ogrenci{ " +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", tipi=" + tipi +
                " }";
    }
}
