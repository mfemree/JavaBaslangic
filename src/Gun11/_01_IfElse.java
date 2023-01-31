package Gun11;

import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {

        // girilen bir tam sayinin pozitif, negatif veya 0 oldugunu yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir tam sayi giriniz= ");
        int sayi= oku.nextInt();

        /*if (sayi > 0 )
            System.out.println("pozitif");

        if ( sayi < 0 )
                System.out.println( "negatif");

        if ( sayi == 0)
            System.out.println("sifir");
*/
        // 2.yontem

       if (sayi > 0 )
            System.out.println("pozitif");

           else
        if ( sayi < 0 )
            System.out.println("negatif");

        else
            System.out.println("sifir");



    }
}
