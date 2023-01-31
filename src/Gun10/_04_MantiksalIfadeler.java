package Gun10;

import java.util.Scanner;

public class _04_MantiksalIfadeler {

    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi = oku.nextInt();

        if ( sayi%2==1 && sayi>0)
            System.out.println("uygun sayi girildi");

else {
            System.out.println("uygun sayi girilmedi");
        }



    }

        }
