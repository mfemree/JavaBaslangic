package Gun19;

import java.util.Arrays;
import java.util.Scanner;

public class _09_JavaMethod {
    public static void main(String[] args) {

        // Kullanıcıdan 5 elemanlı bir diziyi doldurduktan sonra,
        // dizinin en küçük, en büyük elemanını ve
        // ortalamasını ayrı fonksiyonlarda bulup yazdırınız


        Scanner oku= new Scanner ( System.in);

        int [] dizi= new int[5];


        for (int i = 0; i < dizi.length; i++) {

            System.out.print( i + ".sayiyi giriniz= ");
            dizi[i] = oku.nextInt();
        }
        System.out.println(Arrays.toString(dizi));


        enKucukYaz(dizi);
        enBuyukYaz(dizi);
        ortalamaYaz(dizi);

    }

public static void enKucukYaz(int [] sayilar ){

    Arrays.sort(sayilar);
    System.out.println("en kucuk= " + sayilar[0]);

    }

    public static void enBuyukYaz( int [] sayilar ){

        Arrays.sort(sayilar);
        System.out.println("en buyuk= " + sayilar[sayilar.length-1]);


    }

    public static void ortalamaYaz ( int [] sayilar ) {

        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            toplam = toplam + sayilar[i];

        }

        System.out.println("ortalama= " + toplam / sayilar.length);

    }
}





