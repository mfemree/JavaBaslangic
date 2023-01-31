package Gun04;

public class _04_NarrowingCasting {
    public static void main(String[] args) {

        // double -> float -> long -> int -> char -> short -> byte

        double oran = 3.2;
        int sayi = 5;

        sayi = (int) oran;

        // orani sayinin icinde yazmak istiyorsun
        // yani double olan bir degeri integer oraninin icinde yazmaya calisiyorsun
        // yani tehlikeli islem yapiyorsun, degerlere bak, eger veri kaybini kabul ediyorsan bunu bilerek
        // yaptigini goster diyor

        System.out.println("sayi = " + sayi);


        //////////////////////////////////////////////////////////////////////////////////

        byte kisaKenar=50;
        byte uzunKenar=70;
        byte cevre= (byte)(kisaKenar+uzunKenar+kisaKenar+uzunKenar);

        // bu sekilde yazarsak yani int i byte nin icinde yazmaya kalkarsan,
        // rakamlar 128 i gectiginde, deger yanlis cikar, yani patlar.

        //sen eşitliğin 2.tarafı rakamlar toplandı, benim toplam burada INT durumunda
        // byte cevre = 5+7+5+7;   // int i -> byte atmaya çalışıyorsun.
        // eğer veri kaybı olmayacağından eminsen, veya veri kaybı önemli değilse
        // bana bunu yazarak göster.

        System.out.println("cevre= "+ cevre);

        int cevre2= kisaKenar+uzunKenar+kisaKenar+uzunKenar;

        // ama burda cevre2 yi int olarak yazmak istedigimiz icin sikinti olmuyor ve sonuc dogru cikiyor

        System.out.println("cevre2 = " + cevre2);


    }
}
