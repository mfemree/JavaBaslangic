package Gun18;

import java.util.Arrays;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[] dizi= new int[10];                // bos default 0 olan
        int[] dizi2= { 2,3,4,5,6,7,56,67,77 };

        int [][] tablo= new int[2][3];          // 2 satir row, 3 satur column
                                                // bos default deger 0  2*3 kadar 6 adet sayi
        int[][] tablo2= {
                {2, 3, 4},    // 0.satir
                {34, 45, 5}   // 1.satir
        };

        System.out.println("tablo2 = " + Arrays.deepToString(tablo2));   //  2D arrayleri bu sekilde yaziyoruz


        for (int satir = 0; satir < 2 ; satir++) {

            for (int sutun = 0; sutun < 3; sutun++) {
                System.out.print(tablo2[satir][sutun] + " ");
            }
            System.out.println();

        }

        }


    }
