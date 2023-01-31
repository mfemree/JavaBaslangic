package free.array;

import java.util.Arrays;

public class Array_int {
    public static void main(String[] args) {

        // 50 elemanlı bir dizi tanımlayınız, 10 a kadar olan sayılardan Random atayarak
        // doldurunuz. Sonrasında ayrı bir döngü ile tek olanlar 1,
        // çift olanlara 0 atayınız yazdırınız.

        /*int[] array= new int[10];


        for (int i = 0; i < array.length ; i++) {

            array[i]= (int) (Math.random() * 10);

        }

        for (int i = 0; i < array.length; i++) {
            System.out.println("dizi once= " + array[i]);

        }
        for (int i = 0; i < array.length ; i++) {

            if ( array[i] % 2 == 1)
                array[i] = 1;
            else
                array[i] = 0;

        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println("diziden sonra= " + array[i]);

        }*/

        // kullanicinin girecegi bir cumlede kac kelime oldugunu bulunuz
        // for dongusu ile yapalim
        // bu gun hava cok guzel  -> 5


        /*Scanner scan= new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String phrase= scan.nextLine();

        int boslukSayisi=0;

        for (int i = 0; i < phrase.length() ; i++) {

            if ( phrase.charAt(i) == ' ')
                boslukSayisi++;
        }
        System.out.println("cumleniz= " + phrase);
        System.out.print("kelime sayisi = " + (boslukSayisi+1));*/


        int [] arr = new int [5];
        System.out.println(Arrays.toString(arr));   //   [0, 0, 0, 0, 0]
                                                    // defailt degerini yazar



        // int array
        int [] arr1 = {2, 4, 6, 8, 10 };

        System.out.println("arr1 tum elementler= " + Arrays.toString(arr1));      // tum elementleri dizi halinde yazma
                                                                                  // yani biz arrayi yazdirmis olduk
                                                                                  // [2, 4, 6, 8, 10]

        System.out.println("arr1[2]= " + arr1[2]);                                // 6

        System.out.println("arr1.length= " + arr1.length);                        // 5

        // son elementi yazdirmak istersek                                        // lenght-1 ile bulunur
        System.out.println( "arr1.length= "  + arr1[arr1.length-1]);              // 10

        //tum elemanlarini yazdirmak istersek
        for (int i = 0; i <arr1.length ; i++) {
                                                                                   // burda ise elementleri yazdirmis oluyoruz
            System.out.print(arr1[i] + " ");                                       // 2 4 6 8 10
        }

        




    }
}
