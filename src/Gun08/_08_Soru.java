package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");

        int sayi= oku.nextInt();

        int kalan = (sayi % 2);
        System.out.println("kalan = " + kalan);  // yazilan sayiya gore kalan = 0 veya kalan = 1 olacak

        System.out.println("Tek mi degil mi? = " + (kalan==1));

        // 2. yontem

        System.out.println("Tek mi degil mi? = " + (sayi%2==1));
    }
}
