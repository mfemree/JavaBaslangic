package Gun10;

import java.util.Scanner;

public class _03_IfElse {

    public static void main(String[] args) {

        // Girilen bir sayının tek mi çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = oku.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("sayiniz cifttir"); }
        else {  System.out.println("sayiniz tektir"); }

        // 2. yontem

        int kalan= sayi % 2;            // 0,1 veya -1 degil ise
        if ( kalan == 0 )
            System.out.println("cift");
        else                            // !=0 yani yukaridakiler degil ise
            System.out.println("tek");


    }


    }
