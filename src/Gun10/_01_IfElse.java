package Gun10;

import java.util.Scanner;

public class _01_IfElse {

    public static void main(String[] args) {

        // girilen bir ogrenci notuna gore 50 den buyuk ve esit ise gectiniz
        // kucuk ise kaldiniz yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("Notu giriniz= ");
        int ogrNot= oku.nextInt();

        // 1.Yontem

        if (ogrNot >= 50)
        System.out.println("Gectiniz");

        if (ogrNot < 50)
        System.out.println("Kaldiniz");

        // 2.Yontem

        if (ogrNot >= 50) {

            System.out.println("Gectiniz");
            System.out.println("Tebrikler");
        }
        else {
            System.out.println("Kaldiniz");
        }



        }
}
