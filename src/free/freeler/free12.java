package free.freeler;

import java.util.Scanner;

public class free12 {
    public static void main(String[] args) {

        // 0 dan 10 a kadar (10 dahil) sayilari ekrana yazdirin.
        // 10 dan 0 a kadar da yazdiriniz.


        /*for ( int i=0; i <=10; i++)
            System.out.println(i);

        System.out.println();

        for ( int sayac=10; sayac >=0; sayac--)
            System.out.println(sayac);
*/


        // kullanicinin girecegi bir sayiya kadar olan sayilarin toplamini bulunuz

       /* Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sinir = oku.nextInt();

        int toplam = 0;
        System.out.print("sayilar= ");

        for ( int i= 0; i <= sinir; i++) {

            System.out.print(+i + ", ");

            toplam = toplam + i;

        }
        System.out.println("\n" + "toplam= " + toplam);*/


        // giirlen bir sayiya kadar olan sayilarin carpimini bulunuz
        // carpimin degeri 10 bini gectiginde islem sonlansin

       /* Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sinir = oku.nextInt();

        boolean sinirAsildiMi = false;

        int carpim = 1;

        for (int i = 1; i <= sinir; i++) {

            carpim = carpim * i;

            if (carpim >= 10000000)
            {
                    sinirAsildiMi = true;
                    System.out.println("sinir asildi" );
                    break;
            }

        }
        if ( sinirAsildiMi == false)
        System.out.println("carpim= " + carpim);
*/

        // 2 ler carpim tablosunu asagidaki sekilde yazdiriniz

        /*int i=1;
        int carpim=1;

        for (i=1; i <=10; i++) {

            carpim = 2 * i;

            System.out.println("2x" + i + "= " + carpim);

        }*/


        // kullanicidan 5 sayi iste
        // bu sayilarin 6 ile 10 arasindakiler haric digerlerini topla

        /*Scanner oku = new Scanner(System.in);

        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print(i + ". sayiyi giriniz= ");
            int sayi = oku.nextInt();

            if (sayi >= 6 && sayi <= 10)
                continue;

            toplam = toplam + sayi;
            System.out.println("toplam= " + toplam);
        }*/

        // girilen bir stringin harflerini teker teker ekrana alt alta olacak seklinden yazdiriniz.
        // ama bosluklari yazmasin

        Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String cumle = oku.nextLine();

        for (int i = 0; i < cumle.length(); i++) {

            if (cumle.charAt(i) == ' ')
                continue;
            System.out.println(cumle.charAt(i));
        }
    }
}
