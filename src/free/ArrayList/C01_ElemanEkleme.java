package free.ArrayList;

import java.util.ArrayList;

public class C01_ElemanEkleme {
    public static void main(String[] args) {


        ArrayList <Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar);            // []

        System.out.println(sayilar.add(10));   // true

        System.out.println(sayilar);          // [10]

        sayilar.add(20);

        System.out.println(sayilar);  // [10,20] tersi soylenmedikce elementi sona ekler

        sayilar.add(1,15);
        System.out.println(sayilar);           //  [10, 15, 20]


        // listenin basina 40 ekleyelim

        sayilar.add(0,40);
        System.out.println(sayilar);           //  [40, 10, 15, 20]



        ArrayList <Integer> eklenecekListe = new ArrayList<>();

        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar listesinin sonuna eklenecekListeyi ekleyin

        sayilar.addAll(eklenecekListe);

        System.out.println(sayilar);    //   [40, 10, 15, 20, 3, 5]

        // sayilar listesinin basindaki 44 den sonraya eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);

        System.out.println(sayilar);     //  [40, 3, 5, 10, 15, 20, 3, 5]

    }
}
