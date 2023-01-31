package free.ArrayList;

import java.util.ArrayList;

public class C05_set {
    public static void main(String[] args) {

        int [] arr= {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set (index, yeniDeger) methodu
        // istenen indexteki eski degerleri silip bize dondurur
        // ve o indexteki degeri verdigimiz yeni deger ile degistirir

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println("sayilar = " + sayilar);

        // Javada set() u update icin kullanilir
        // add() ile set() farklidir

        System.out.println(sayilar.set(0, 8));             // 0. indexteki elemani 8 yap

        int eskiDeger = sayilar.set(1,9);                 // 1. indexteki elemani 9 yap
                                                          // ama eski degerlerini de goster


        System.out.println(eskiDeger);     //  1  2
        System.out.println(sayilar);      //  [8, 9, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]







    }
}
