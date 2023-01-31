package Gun42;

public class _04_StringKarsilastirma {
    public static void main(String[] args) {

        // Stringlerde neden == yerine equal kullanilior?
        String cumle1= "Bugun hava cok guzel";
        String cumle2= "Bugun hava cok guzel";

        // ILKEL tipleri karsilastirdigindan 2 sinde de degerleri karsilastirir.
        // CUNKU baska bir sey yok.

        if ( cumle1 == cumle2 )
            System.out.println("cumle 1 cumle 2 ye esit");
        else
            System.out.println("cumle 1 cumle 2 ye esit DEGIL");

        if ( cumle1.equals(cumle2))
            System.out.println("cumle 1 cumle 2 ye esit");
        else
            System.out.println("cumle 1 cumle 2 ye esit DEGIL");


        // REFERANS TIPLERDE ise DURUM
        // scanf ile ekrandan okutuldugunda asagidaki gibidir

        String cumle3= new String("Bugun hava cok guzel");
        String cumle4= new String("Bugun hava cok guzel");


        if (cumle3 == cumle4 ) // adresleri karsilastiriyor
            System.out.println("cumle 3 cumle 4 e esit");
        else
            System.out.println("cumle 3 cumle 4 e esit DEGIL");

        if ( cumle3.equals(cumle4))
            System.out.println("cumle 3 cumle 4 e esit");
        else
            System.out.println("cumle 3 cumle 4 e esit DEGIL");

    }
}
