package free.array;

import java.util.Arrays;
import java.util.Scanner;

public class KullanicidanDegerAlarakArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar sayi alip bir array olusturun
        // kullanici eleman girisni bitirmek icin 0 a bassin.


        Scanner scan= new Scanner(System.in);
        int [] arr={0};
        int girilensayi=0;

        System.out.println("ilk basta sifir girmeyin");
        System.out.println("bitirmek icin 0'a basin");

        do {

            System.out.print("ve array'e eklemek icin bir tam sayi girin= ");
            girilensayi= scan.nextInt();

            if ( arr[0] == 0) {
                 arr[0] = girilensayi;
            }else if
            ( girilensayi != 0) {
               arr =  ArrayeElemanEklemeMetodu.arrayeElemanEkle(arr, girilensayi);
            }

        } while (girilensayi!=0);

        System.out.println(Arrays.toString(arr));












    }
}
