package Gun09;

import java.util.Scanner;

public class _04_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayinin tek mi cift mi oldugunu yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi= oku.nextInt();

        if (sayi%2 != 0) // girilen sayinin 2 ye bolumunden kalan 0 degilse
                         // - veya + farketmeksizin

            System.out.println("tek");

        if (sayi%2 ==0)
            System.out.println("cift");

        // 2.yontem

       /* int sayi= oku.nextInt();
        int kalan= sayi % 2;

        if (kalan==1)
            System.out.println("Girilen sayı tektir");

        if (kalan==0)
            System.out.println("Girilen sayı çifttir");
*/

    }
}
