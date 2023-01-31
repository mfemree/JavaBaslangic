package Gun18;

import java.util.Scanner;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        // Multi Dimensional Arrays

        int sayi=0;

        int[] dizi= new int[100];

        int[] ders1Notlari= new int[50];   // 50 kisilik sinifin 1. dersin notlari
        int[] ders2Notlari= new int[50];
        int[] ders3Notlari= new int[50];   // 0-49 arasi index degisiyor

        int[][] tumDersNotlari= new int[3][50];   // 3 tane ders 50 tane ogrenci, 150 tane sayi
                                                  // 3 satir 50 sutun
                                                  // her satir 50 tane sayi, 50 sutun
                                                 // 0.satir, 1.satir, 2.satir
                                                 // satir: 0-1-2 , sutun; 0-1-2-3-.....-49

        ders1Notlari[0]=80;         //  tek boyutlu dizinin ilk(0) elemanina 80 deger atadim
        tumDersNotlari[0][0]=80;    //  2 boyutlu dizide 0.satirin, 0. sutununa 80 deger atandi

        System.out.println("tumDersNotlari = " + tumDersNotlari[0][0]);



    }
}
