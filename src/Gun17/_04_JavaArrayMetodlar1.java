package Gun17;

import java.util.Arrays;

public class _04_JavaArrayMetodlar1 {
    public static void main(String[] args) {

        String[] isimler={"ahmet", "zeynep", "roman", "yasin", "cihan"};

        // diziyi string olarak yazdirir.

        System.out.println("isimler= " + Arrays.toString(isimler));        //  [ahmet, zeynep, roman, yasin, cihan]

        // dizi siralama
        // a dan z ye

        Arrays.sort(isimler);                                              // naturel ordar a gore siralar
        System.out.println("isimler= " + Arrays.toString(isimler));        // [ahmet, cihan, roman, yasin, zeynep]

        // Diziler esit mi?

        int[] a= {1,8,3,54};          // indexler her zaman 0 dan baslar
        int[] b= {1,8,3,54};
        int[] c= {1,8,3,54,45};

        System.out.println("Arrays.equals(a,b) = " + Arrays.equals(a,b));     // true
        System.out.println("Arrays.equals(a,c) = " + Arrays.equals(c,a));     // false

        Arrays.sort(c);                                                       // sayi bazli dizi siralamasi
        System.out.println("Arrays.toString(c) = " + Arrays.toString(c));     // [1, 3, 8, 45, 54]





        System.out.println("b = " + Arrays.toString(b));                                    //  [1, 8, 3, 54]
        System.out.println("Arrays.binarySearch(b) = " + Arrays.binarySearch(b,3));     // -2
                                                                                            // siralamadigimiz icin -2 verdi

        Arrays.sort(b);
        System.out.println("b = " + Arrays.toString(b));                                    // [1, 3, 8, 54]
        System.out.println("Arrays.binarySearch(b) = " + Arrays.binarySearch(b,3));    //  1
                                                                                           // siraladik ve 1 verdi


        // contains gibi calisir, var ise pozitif bir deger dondurur. yok ise negatif
        // sadece sirali ise calisir ve siralanmis dizilerde dogru sonuc verir. yani sortta.
        // ayni harften/karakterden vs birden fazla varsa rastgele bir siradakini verir.


    }
}