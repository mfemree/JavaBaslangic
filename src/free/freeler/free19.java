package free.freeler;

import java.util.Arrays;
import java.util.Scanner;

public class free19 {
    public static void main(String[] args) {

        // int [][] array = new int[2][3];

//        int [][] array = {
//                { 3, 4, 55 },
//                { 234, 55, 230 }
//
//        };  //  2 satir 3 sutun
//
//
//        System.out.println(array.length);      // toplam satir uzunlugu                     //  2
//        System.out.println(array[0].length);   // indexi sifir olan 1. satirin uzunlugu     //  3
//        System.out.println(array[1].length);   // indexi 1 olan 2. satirin uzunlugu         //  3
//
//        System.out.println();
//
//
//        for (int i = 0; i < array.length; i++) {
//
//            for (int j = 0; j < array[i].length; j++) {
//
//                System.out.print(array[i][j] + "\t");
//
//            }
//            System.out.println();
//        }

//        int [][] tablo2= {             //  yani new int [5][]  gibi dusuneceksin
//
//                {4, 44},
//                {3, 45, 67},
//                {4, 65, 765, 43, 56, 70},
//                {45, 78, 41},
//                {5}
//        };
//
//        System.out.println(" toplam satir miktari = " + tablo2.length);
//        System.out.println("indexi 0 olan 1. satirin uzunlugu= " + tablo2[0].length);
//        System.out.println("indexi 1 olan 2. satirin uzunlugu = " + tablo2[1].length);
//        System.out.println("indexi 2 olan 3. satirin uzunlugu = " + tablo2[2].length);
//        System.out.println("indexi 3 olan 4. satirin uzunlugu = " + tablo2[3].length);
//        System.out.println("indexi 4 olan 5. satirin uzunlugu = " + tablo2[4].length);
//
//
//        for (int i = 0; i < tablo2.length; i++) {
//
//            for (int j = 0; j < tablo2[i].length ; j++) {
//
//                System.out.print(tablo2[i][j] + "\t");
//            }
//            System.out.println();
//
//        }


        // Günün Sorusu :  3x2 lik bir diziyi kullanıcıdan sayı alarak
        // doldurduktan sonra sadece tek elemenlarını tek boyutlu bir
        // diziye atayınız.


        int[][] array= new int[3][2];

        Scanner oku = new Scanner(System.in);

        int tekMik=0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                System.out.print("bir sayi giriniz= ");
                array[i][j] = oku.nextInt();


                if ( array[i][j] %2 != 0)
                    tekMik++;

            }

        }

        int [] teklerDizisi = new int[tekMik];    //  tek sayilarin miktari uzunlugunda bir dizi tanimladik

        tekMik=0;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length ; j++) {

                if ( array[i][j] % 2 != 0 ){

                    teklerDizisi[tekMik]  = array[i][j];
                    tekMik++;

                }

            }

        }
        System.out.println(Arrays.toString(teklerDizisi));

    }
}
