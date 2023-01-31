package Gun26._04_Ornek;

public class ElektrikHesabi {


    int toplamTuketim=0;
    double birimFiyat=0.7;
    double fatura=0;


    public void TuketimEkle (int aylikTuketim) {

        toplamTuketim+= aylikTuketim;

}
    public void ToplamTuketimYaz(){

        System.out.println("toplamTuketim = " + toplamTuketim);
    }

    public void FaturaYaz(String isim){

        fatura= toplamTuketim*birimFiyat;
        System.out.println("**********************");
        System.out.println("   Faturaniz");
        System.out.println("**********************");
        System.out.println("Musteri = " + isim);
        System.out.println("toplamTuketim = " + toplamTuketim);
        System.out.println("Toplam tutar= " + Math.round(fatura));
        System.out.println("**********************");

    }

}
