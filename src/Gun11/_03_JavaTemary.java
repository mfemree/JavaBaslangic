package Gun11;

import java.util.Scanner;

public class _03_JavaTemary {

    public static void main(String[] args) {

        // kullaninin girecegi sayinin tem ki cift mi oldugunu yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("Saat giriniz= ");
        int sayi= oku.nextInt();

        if ( sayi % 2 == 0)
            System.out.println("cift");
        else
            System.out.println("tek");


        String sonuc= ( sayi%2==0) ? "cift" : "tek";      // ? -> if     : -> else

        System.out.println("sonuc= " +sonuc);

        // ya da

        System.out.println(((sayi % 2 == 0 ) ? "cift" : "tek"));






    }
}
