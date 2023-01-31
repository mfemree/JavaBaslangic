package Gun16;

import java.util.Scanner;

public class _01_JavaDiziNedir {
    public static void main(String[] args) {

        int ogrNot; // 1 tane not saklar

        // 50 kişi var
        int ogr1Not;
        int ogr2Not;
        int ogr3Not;
        //....
        //....
        //....
        int ogr50Not;

        // bana bir tanımlamada BIRDEN FAZLA değer tutabilen bir değişkene ihtiyacım var;

        // ÇÖZÜM :

        int[] notlar  =new int[3];          // 50 tane int saklayabilen notlar isimli değişken

        notlar [0] = 75;
        notlar [1] = 88;
//        //...
//        //...
        //notlar[49] = 95;

        System.out.println("notlar[0]= " + notlar[0]);

        System.out.println("notlar.lenght = " + notlar.length); // 50 yani toplam eleman sayisini verir.
                                                                // dizinin elelman sayisini verir

        // dizi nasil okutulur

        Scanner oku= new Scanner(System.in);

        for ( int i=0; i<notlar.length; i++) {

            System.out.print("Notu giriniz= ");
            notlar[i]= oku.nextInt();

        }
        for (int i=0; i<notlar.length; i++){

            System.out.println(notlar[i]);
        }



    }
}
