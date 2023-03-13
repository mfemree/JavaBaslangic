package Gun09;

import java.util.Scanner;

public class _03_JavaIf {
    public static void main(String[] args) {

        // giirlen iki sayidan buyuk olanini ekrana yazdiriniz
        // esit ise esit yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("1. sayiyi giriniz= ");
        int sayi1= oku.nextInt();

        System.out.print("2.sayiyi giriniz= ");
        int sayi2= oku.nextInt();

        if (sayi1>sayi2)
            System.out.print("sayi1 buyuktur" + sayi1);

        if (sayi2>sayi1)
            System.out.print("sayi2 buyuktur= " + sayi2);

        if (sayi1==sayi2)
            System.out.print("sayi1 sayi2 esittir");
    }
}
