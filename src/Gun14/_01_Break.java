package Gun14;

import java.util.Scanner;

public class _01_Break {
    public static void main(String[] args) {

        // girilen bir sayinin tam kare olup olmadigina bakiniz

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = oku.nextInt();
        int arananRakam=0;

        int sayac = 0;

        while (sayac < sayi) {

            System.out.println("sayac= " + sayac);

            if (sayac * sayac == sayi) {
                System.out.println(sayi + " tam karedir");
                arananRakam=sayac;
                break; // calistiginda dinguden cikar

            }

            sayac++;
        }

        if ( arananRakam == 0 )
        System.out.println("tam kare degildir");

        // 2.yontem

        /*Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi = oku.nextInt();


        int sayac = 0;
        boolean tamKare= false;

        while (sayac < sayi) {

            System.out.println("sayac= " + sayac);

            if (sayac * sayac == sayi) {

                tamKare=true;
                System.out.println(sayi + " tam karedir");

                break; // calistiginda dinguden cikar
            }

            sayac++;
        }

        if ( tamKare == false )

            System.out.println("tam kare degildir ");
*/


    }
}