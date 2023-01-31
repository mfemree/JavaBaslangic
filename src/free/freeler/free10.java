package free.freeler;

import java.util.Scanner;

public class free10 {
    public static void main(String[] args) {

        // girilen bir ay numarasina gore ayin kac gun cektigini bulunuz

      /*  Scanner oku= new Scanner(System.in);
        System.out.print("Ay no giriniz= ");
        int ayNo= oku.nextInt();
*/

       /* switch (ayNo){

            case 1: System.out.println("31"); break;
            case 2: System.out.println("28"); break;
            case 3: System.out.println("31"); break;
            case 4: System.out.println("30"); break;
            case 5: System.out.println("31"); break;
            case 6: System.out.println("30"); break;
            case 7: System.out.println("31"); break;
            case 8: System.out.println("31"); break;
            case 9: System.out.println("30"); break;
            case 10: System.out.println("31"); break;
            case 11: System.out.println("30"); break;
            case 12: System.out.println("30"); break;

            default: System.out.println("yanlis secim girdiniz");
                }*/

        // ya da

                /*switch (ayNo) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10: System.out.println("31"); break;

            case 2: System.out.println("28"); break;

            case 4:
            case 6:
            case 9:
            case 11:
            case 12: System.out.println("30"); break;

            default: System.out.println("yanlis secim girdiniz");
            }*/

        /* --------------------------------------------------------------------- */

        // ekrana 5 kez merhaba yazdiriniz

       /* int sayac = 1;

        while (sayac < 6) {

            System.out.println(sayac + ".merhaba yemliha");

            sayac++;
        }

        System.out.println("program bitti");

    }*/


        /* --------------------------------------------------------------------- */

        // girirlen 20 sayininn toplaminin sonucunu yazdiriniz

       /* Scanner oku = new Scanner(System.in);

        int sayac=1;
        int toplam=0;


        while ( sayac <= 5) {

            System.out.print(sayac + ". sayiyi giriniz= ");
            int sayi= oku.nextInt();

            toplam= toplam + sayi;

            sayac++;
        }

        System.out.println("toplam= " + (toplam));*/

        /* --------------------------------------------------------------------- */

        // girilen 20 sayidan sadece pozitif olanlarin toplamini bulunuz.


       /* Scanner oku = new Scanner(System.in);


        int sayac=1;
        int toplam=0;


        while (sayac <= 5){

            System.out.print(sayac + " .sayi giriniz= ");
            int sayi= oku.nextInt();

            if ( sayi > 0)
                toplam= toplam+sayi;

            sayac++;
        }

        System.out.println("toplam= " +toplam);*/

        /* --------------------------------------------------------------------- */

        // 100 e kadar olan sayilarin toplamini bulunuz


        /*int sayac=1;
        int toplam=0;

        while (sayac<=100){

            toplam=toplam+sayac;

            sayac++;

        }

        System.out.println("toplam= " +toplam);

        */

        /* --------------------------------------------------------------------- */

        // kullanici 0 degeri girine kadar, girdigi sayilarin toplamini bulunuz.

        /*Scanner oku = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        System.out.print("bir sayi giriniz= ");
        sayi = oku.nextInt();
        toplam = toplam + sayi;

        while (sayi != 0) {

            System.out.print("bir sayi giriniz= ");
            sayi = oku.nextInt();

            toplam = toplam + sayi;
        }

        System.out.println("toplam= " + toplam);*/

                // ya da

       /* Scanner oku= new Scanner(System.in);

        int sayi;
        int toplam= 0;


        do {
            System.out.print("sayi giirniz= ");
            sayi= oku.nextInt();

            toplam= toplam + sayi;
        }while ( sayi != 0 );

        System.out.println("toplam= " + toplam);*/

        /* --------------------------------------------------------------------- */

        // kullanici x girene kadar ekrana "program calisiyor" yazdiriniz
        // x girildiginde ise ""program bitti yaziniz.


        Scanner oku= new Scanner(System.in);
        String giris;

        do {

            System.out.print("bir seyler yaziniz= ");
            giris= oku.nextLine();

            if (!giris.equalsIgnoreCase("x"))
            System.out.println("program calisiyor");


        }while( !giris.equalsIgnoreCase("x") );


        System.out.println("program bitti");






    }

    }



