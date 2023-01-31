package Gun14;

import java.util.Scanner;

public class _05_forLoop {
    public static void main(String[] args) {

        // girilen bir sayiya kadar (dahil) olan sayilarin carpimini bulunuz/
        // carpimin degeri 100 u gectiginde islem sonlansin.

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = oku.nextInt();

        int i = 1;
        long carpim = 1;

        for (i = 1; i <= sayi; i++) {

            carpim = carpim * i;

            if (carpim > 10000) {

                System.out.println("islem sonlandirildi"); break;
            }
        }
        System.out.println("sonuc= " + carpim);
    }
}
