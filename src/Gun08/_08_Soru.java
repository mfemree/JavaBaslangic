package Gun08;

import java.util.Scanner;

public class _08_Soru {
    public static void main(String[] args) {

        // girilen bir sayinin tek sayi olup olmadigini yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");

        int sayi= oku.nextInt();

        int kalan = (sayi % 2); // kalan 1 e esitse tektir.

        System.out.print("Tek mi degil mi? = " + (kalan==1));

        // 2. yontem

        System.out.print("Tek mi degil mi? = " + (sayi%2==1));

    }
}
