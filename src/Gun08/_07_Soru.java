package Gun08;

import java.util.Scanner;

public class _07_Soru {
    public static void main(String[] args) {

        // girilen iki sayinin ayni olup olmadigini karsilastiriniz

        Scanner oku= new Scanner(System.in);

        System.out.print("sayi1 giriniz= " );
        int sayi1= oku.nextInt();

        System.out.print("sayi2 giriniz= ");
        int sayi2= oku.nextInt();

        System.out.println("esit mi? = " + (sayi1 == sayi2));

        // 2.yontem
        boolean esitMi= (sayi1==sayi2);
        System.out.println("esit mi: " + esitMi);







    }
}
