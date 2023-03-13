package Gun11;

import java.util.Scanner;

public class _07_JavaMath {
    public static void main(String[] args) {

        // Math.max yontemi ile giirlen 3 sayidan buyuk olanini yaziniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("1. sayiyi giriniz= ");
        int a= oku.nextInt();

        System.out.print("2. sayiyi giriniz= ");
        int b= oku.nextInt();

        System.out.print("3. sayiyi giriniz= ");
        int c= oku.nextInt();

        // 1.yontem

        int enBuyuk= Math.max(a,b);
        enBuyuk= Math.max(enBuyuk,c);
        System.out.println("enBuyuk = " + enBuyuk);

        // 2. yontem

        int enBuyuk2= Math.max(a, Math.max(b,c));
        System.out.println("enBuyuk2 = " + enBuyuk2);

    }
}
