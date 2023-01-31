package Gun23;

import java.util.HashSet;
import java.util.Iterator;

public class _03_Sets {
    public static void main(String[] args) {

        HashSet<String> renkler= new HashSet<>();

        renkler.add ("Red");
        renkler.add ("Green");
        renkler.add ("Blue");
        renkler.add ("Red");
        renkler.add ("RED");


        // Ekrana yazdirma
        System.out.println("renkler = " + renkler);


        // ekrana tek tek yazdirma
        for (String eleman : renkler) {                       //   kafaya gore, ama hizli
            System.out.println("eleman = " + eleman);
        }

//        int [] dizi = {34,5,6,7,8,899};
//        for ( int sayi : dizi ){
//
//            System.out.println("sayi = " + sayi);
//        }


        // set in kendi sirasi hangi set cesidinde gore ise, sirasini ona gore verir.
        Iterator gosterge = renkler.iterator();

        while (gosterge.hasNext());   // siradaki eleman var ise ilerler. yoksa durur.
        {
            System.out.println("gosterge.hasNext() = " + gosterge.hasNext());
            // .next gostergenin gosterdigi elemani temsil ediyor
        }

    }
}
