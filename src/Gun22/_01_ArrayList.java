package Gun22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class _01_ArrayList {
    public static void main(String[] args) {

        // ArrayList Collection grubunun bir elemanı
        // Array i sıralarken Arrays.sort u kullandığımız gibi,
        // ArrayList i Collection metodlarını kullanacağız.

        ArrayList<Integer> sayilar= new ArrayList<>();

        sayilar.add(50);
        sayilar.add(5);
        sayilar.add(456);
        sayilar.add(45);
        sayilar.add(3);

        System.out.println("sayilar = " + sayilar);            //  [50, 5, 456, 45, 3]

        // siralama islemi
        Collections.sort(sayilar);
        System.out.println("sayilar = " + sayilar);            //  [3, 5, 45, 50, 456]


        // tersten yazdirma
        Collections.reverse(sayilar);
        System.out.println("sayilar = " + sayilar);            //  [456, 50, 45, 5, 3]


        // max ve min eleman bulma
        System.out.println("Collections.max(sayilar) = " + Collections.max(sayilar));
        System.out.println("Collections.min(sayilar) = " + Collections.min(sayilar));


        // butun elemanlari set etme
        Collections.fill(sayilar,0);                      // butun elemanlara 0 atar.
        System.out.println("sayilar = " + sayilar);           // [0, 0, 0, 0, 0]


        //replace
        Collections.replaceAll(sayilar,0,5);     // 0 lara 5 atandi
        System.out.println("sayilar = " + sayilar);           // [5, 5, 5, 5, 5]


        // tanimlarken deger atama
        // diziyi array listin icine atma

        int[] dizi= {2,3,4,5};
        ArrayList<Integer> intList = new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList("ali", "5","#"));
        System.out.println("intList = " + intList);                                   // [3, 4, 5, 6]
        System.out.println("strList = " + strList2);


        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2, 2,3,4,5,6,7);                         // bu sekilde de eklenebilir

        System.out.println("list2 = " + list2);                                  //  [2, 3, 4, 5, 6, 7]


        ArrayList<String> strList = new ArrayList<>(Arrays.asList("ahmet", "mehmet", "busra", "roman"));
        System.out.println("strList = " + strList);                              //   [ahmet, mehmet, busra, roman]


        // diziyi direk ArrayList e nasil atarim?
        // parametreler ayni olmasi gerekiyor
        // Integer a Integer, kucuk int olmaz.

        Integer[] dizi2= { 2,3,4,5};
        ArrayList<Integer> list3= new ArrayList<>(Arrays.asList(dizi2));
        System.out.println("list3 = " + list3);                                  //   [2, 3, 4, 5]





    }
}
