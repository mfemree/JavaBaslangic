package ODEVLER.hw_abstract._2_Soru;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("1. sayiyi giriniz= ");
        int sayi1= scan.nextInt();

        System.out.print("2. sayiyi giriniz= ");
        int sayi2= scan.nextInt();

        Sum toplam = new Sum();
        System.out.println("toplam = " + toplam.calculating(sayi1, sayi2));

        Substract fark = new Substract();
        System.out.println("fark = " + fark.calculating(sayi1, sayi2));

        Multiply carpim = new Multiply();
        System.out.println("carpim = " + carpim.calculating(sayi1, sayi2));

        Divide bolum = new Divide();
        System.out.println("bolum = " + bolum.calculating(sayi1, sayi2));

    }
}
