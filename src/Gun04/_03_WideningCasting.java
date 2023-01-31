package Gun04;

public class _03_WideningCasting {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        // sayi=5 burdan aklimiza gelsin
        // 5 i sayinin icine atamis oluyoruz
        // yani sayiya 5 atamis oluyoruz

        int sayi = 9;
        long toplam = 6700;
        double oran = 3.2;

        oran = sayi; // oran=9 kayip yok   // anlami= sayiyi oran olarak yazmak istiyoruz
                                           // yani int i double olarak yazmak istiyoruz
                                           // int < double oldugu icin de veri kaybi olmaz
        System.out.println("oran= " + oran);

        toplam = sayi; // kayip yok , toplam=9 // anlami= sayiyi toplam olarak yazmak istiyoruz
                                               // yani int i long olarak yazmak istiyoruz
                                                // int < long oldugu icin de veri kaybi olmaz
        System.out.println("toplam= " + toplam);

        oran = toplam; // kayip yok, oran=9     // anlami= toplami oran olarak yazmak istiyoruz
                                                // yani long u double olarak yazmak istiyoruz
                                                // long < double oldugu icin de veri kaybi olmaz
        System.out.println("oran= " + oran);


    }
}
