package free.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class C10_Fibonacci {
    public static void main(String[] args) {

        // kullanicidan bir pozitif tam sayi alip
        // o tam sayilari kucuk fbonacci sayilarini bir liste olarak yazdirin

        Scanner scan= new Scanner(System.in);

        System.out.print("lutfen pozitif ir tam sayi giriniz= ");
        int girilenSayi= scan.nextInt();

        if ( girilenSayi<0){

            System.out.println("Fibonacci serisi icin 0 dan  buyuk sayi girmelisin");

        } else if ( girilenSayi == 0 ) {

            System.out.println("0 dan kucuk fibonacci sayisi yoktur");
        } else if (girilenSayi == 1 ) {
            System.out.println("1 den kucuk tek fibonacci saisi vardir: 0");
        } else {
            fibonacciSayilariniYazdir(girilenSayi);

        }
    }

    private static void fibonacciSayilariniYazdir(int girilenSayi) {

     // buraya geldiyse sayi 1 den buyuktur

        ArrayList<Integer> fibonacciListesi = new ArrayList<>();

        fibonacciListesi.add(0);
        fibonacciListesi.add(1);
        fibonacciListesi.add(1);

        int yeniFibonacciSayisi=0;
        int index=3;                   // ilk 3 eleman 0 1 1 oldugu icin n3.index'e geldik


        while ( yeniFibonacciSayisi< girilenSayi){

            yeniFibonacciSayisi = fibonacciListesi.get(index-2) + fibonacciListesi.get(index-1);

            if ( yeniFibonacciSayisi<girilenSayi ){
                fibonacciListesi.add(yeniFibonacciSayisi);
        }

            index++;
        }

        System.out.println("fibonacciListesi = " + fibonacciListesi);
    }
}
