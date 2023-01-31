package Gun18;

import java.util.Arrays;
import java.util.Scanner;

public class _04_Java2DArrays {
    public static void main(String[] args) {

        // 2 ye 3 luk tabloyu kullanicidan sayi olarak doldurunuz
        // daha sonra ayri bir dongu de en buyuk sayiyi bulunuz


        Scanner oku = new Scanner(System.in);
        int[][] array = new int[2][3];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("bir sayi giriniz= ");
                array[i][j] = oku.nextInt();
            }

        }
        System.out.println();

        // burasi okuma islemi

//        for (int i = 0; i < 2; i++) {
//
//            for (int j = 0; j < 3; j++) {
//                System.out.println("array = " + array[i][j] + "\t");
//            }
//            System.out.println();
//        }

        // burasi yazma islemi

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.println("array = " + (array[i][j]) + "\t");

            }
            System.out.println();
        }

        // en buyuk bulma islemi

        int theBiggest = array[0][0];

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                if (array[i][j] > theBiggest)
                    theBiggest = array[i][j];
            }
        }
        System.out.println("theBiggest = " + theBiggest);

    }
}

