package Gun16;

import java.util.Scanner;

public class _04_JavaArray {
    public static void main(String[] args) {

        // kullanicidan alacaginiz 7 sayiyi aldiktan sonra
        // kac tanesinin ortalamadan buyuk oldugunu bulunuz

        Scanner oku= new Scanner(System.in);

        int[] sayilar= new int[6];

        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {

            System.out.print( i +1 + ".sayiyi giriniz= ");
            sayilar[i]= oku.nextInt();

            toplam= toplam + sayilar[i];

        }
        int ort= toplam/ sayilar.length;
        int miktar=0;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] >ort && sayilar[i]%2 != 0)
                miktar++;

        }
        System.out.println("ort = " + ort);
        System.out.println("ortalamadan buyuk ve tek olan sayilarin miktari = " + miktar);


    }
}
