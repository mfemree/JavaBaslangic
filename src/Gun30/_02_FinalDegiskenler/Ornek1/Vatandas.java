package Gun30._02_FinalDegiskenler.Ornek1;

public class Vatandas {

    String isim;
    final int tcNo;

    static int tcNoSayac=1;


    public Vatandas(String isim) {
        this.isim = isim;
        this.tcNo = tcNoSayac;
        // final degiskenlerine sadece 1 kez veri atanabilir.
        // o da ya tanimlanirken, ya da constructor'da.
    }

    @Override
    public String toString() {
        return "Vatandas{" +
                "isim='" + isim + '\'' +
                ", tcNo=" + tcNo +
                '}';
    }
}


