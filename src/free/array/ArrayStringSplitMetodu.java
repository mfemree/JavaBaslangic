package free.array;

import java.util.Arrays;

public class ArrayStringSplitMetodu {
    public static void main(String[] args) {

        String str= "Java gercekten cok guzel";

        // normal bir stringi array sekline cevirir
        String [] strArray = str.split(" ");
        System.out.println(Arrays.toString(strArray));


        // verilen string de kac tane e harfi oldugunu bulunuz


        String [] eArrayi= str.split("e");
        // ya da
        System.out.println(Arrays.toString(str.split("e")));      //  [Java g, rc, kt, n cok guz, l]

        System.out.println(Arrays.toString(eArrayi));                    //  [Java g, rc, kt, n cok guz, l]
        System.out.println(eArrayi.length);                              //  5 ,  5-1 = 4


        // 2,yontem
        //  Stringi "" ile sprit yaparak karakter;erine ayiririz
        String [] tumKarakterlerArr= str.split("");
        System.out.print(Arrays.toString(tumKarakterlerArr));

        // [J, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , g, u, z, e, l]

        // aranan karakterleri, harfleri, sayilari virgul ile ayirir.

        int sayac=0;

        for (int i = 0; i < tumKarakterlerArr.length; i++) {


            if ( tumKarakterlerArr[i].equals("e"))
                sayac++;

        }
        System.out.println("\n" + "e harfi sayisi= " + sayac);

    }
}
