package free.ArrayList;

import java.util.ArrayList;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5};


        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            sayilar.add(arr[i]);

        }

        sayilar.remove(2);        // 2. indexte olan sayiyi kaldirir
        System.out.println(sayilar);   //   [1, 2, 3, 5, 3, 5, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        sayilar.remove(5);        // en sonki guncel sayilar listesinden baslayarak 5.indexteki sayiyi kaldiirr
        System.out.println(sayilar);   //   [1, 2, 3, 5, 3, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        // listemiz integer lardan lusuyorsa
        // ve biz int bir deger yazdigimizda hep index kabul ettiginden
        // istedigimiz elementi obje olarak girip sildirmek icin
        // onceden tanimlamammiz gerekir.

        Integer silinecekObje = 4;
        sayilar.remove(silinecekObje);
        System.out.println(sayilar);      //  [1, 2, 3, 5, 3, 2, 5, 1, 2, 5, 3, 4, 5]
        // soldan basladi ve ilk 4 u sildi

        // tum 3 leri sildirin

        silinecekObje = 3;


        while (sayilar.contains(silinecekObje)) {
            sayilar.remove(silinecekObje);
        }

        System.out.println(sayilar);  //  [1, 2, 5, 2, 5, 1, 2, 5, 4, 5]

        silinecekObje=10;                                    // silinecek eleman listede olmadigi icin false doner
        System.out.println(sayilar.remove(silinecekObje));   // false

        sayilar.remove(20);                            //  IndexOutOfBoundsException  // 20. index yok ki


    }
}
