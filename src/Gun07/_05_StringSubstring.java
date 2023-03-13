package Gun07;

public class _05_StringSubstring {

    public static void main(String[] args) {

    // stringin belli bir bolumunu alma islemini yapar.

    //           0123456789
    String s1 = "Merhaba arkadaslar";

        String parca1= s1.substring(3,9);           // 3 nolu indexten 9 nolu indexe kadar alir, 9 nolu index dahil degil.
        System.out.println("parca1 = " + parca1);   // haba a

        String parca2= s1.substring(8,15);          // 3 nolu indexten 9 nolu indexe kadar alir, 9 nolu index dahil degil.
        System.out.println("parca2 = " + parca2);   // arkadas

        String parca3 = s1.substring(8);  // verilen rakamdan baslayip sonuna kadar alir.
        System.out.println("parca3 = " + parca3);  // arkadaslar

    }
}
