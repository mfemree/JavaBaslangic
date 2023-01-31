package Gun13;

import java.util.Scanner;

public class _06_DoWhile {
    public static void main(String[] args) {

       //  kullanici 0 degeri girine kadar, girdigi sayilarin toplamini bulunuz.

        Scanner oku= new Scanner(System.in);
        int sayi;
        int toplam=0;

        do {
            System.out.print("sayi giriniz= ");
            sayi=oku.nextInt();

            toplam= toplam+sayi;

        } while ( sayi != 0);

        System.out.println("Toplam= " +toplam);


        // 2.yontem

        /*Scanner oku= new Scanner(System.in);
        int sayi;
        int toplam=0;

        System.out.println("sayi giriniz");
        sayi= oku.nextInt();
        toplam= toplam+sayi;

        while ( sayi != 0 )
        {
            System.out.println("sayi giriniz");
            sayi= oku.nextInt();

            toplam= toplam+sayi;
        }

        System.out.println("toplam= " + toplam);*/



    }
}
