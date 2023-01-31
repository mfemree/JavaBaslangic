package Gun06;

public class _10_CharVeSayi {
    public static void main(String[] args) {

        // harf ve rakam eslestirme tablosuna ascii tablosu


        int sayi=65;

        System.out.println("sayi = " + sayi);

        char harf= (char)sayi;
        System.out.println("harf = " + harf);

        sayi=97;
        harf=(char)sayi;

        System.out.println("harf = " + harf);
        System.out.println((char)97);

        for (int i=0; i<=255; i++){

            harf= (char)i;
            System.out.println( i+ ".harf = " + harf);

   }




    }
}
