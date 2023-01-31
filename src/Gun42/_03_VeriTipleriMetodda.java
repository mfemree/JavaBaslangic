package Gun42;

import java.util.Arrays;

public class _03_VeriTipleriMetodda {
    public static void main(String[] args) {

        // ilkel tip
        int sayi=5;

        sayiArtir(sayi);
        System.out.println("sayi = " + sayi);  // 5

        sayi = sayiArtir2(sayi);
        System.out.println("sayi = " + sayi); // 6


        // referans tip
        int[] dizi= {1,2,3};
        diziSifirla(dizi);
        System.out.println("dizi = " + Arrays.toString(dizi)); // 0,0,0


        // nesne tipler
        String kelime="ismet";
        kelimeSifirla(kelime);
        System.out.println("kelime = " + kelime);

    }

    // Özet: Temel fark:
    // 1- İlkel tipler sadece 1 değer saklarlar, bu yüzden metodlara sadece değeri gider.Eşitlendiğinde sadece değer aktarılır.
    // 2- Nesne tipler İlkel tipten tek farkı NULL değeri alabilmeleri, bu yüzden ilkel tip gibi davranırlar
    // 3- Referans tipler metoda gönderildiklerinde kendileri giderler. Eşitlemelerde referanslar eşitlenir.


    private static void sayiArtir(int sayi) {
        sayi++;
    }

    private static int sayiArtir2(int sayi) {
        sayi=sayi+1;
        return sayi;
    }
    private static void diziSifirla(int[] dizi) {
        dizi[0]=0;
        dizi[1]=0;
        dizi[2]=0;
    }
    private static void kelimeSifirla(String kelime) {
        kelime="";
    }





}
