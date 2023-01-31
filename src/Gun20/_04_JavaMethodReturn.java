package Gun20;

import java.util.Scanner;

public class _04_JavaMethodReturn {
    public static void main(String[] args) {

        // kullanicinin girecegi 2 sayinin toplamini
        // bir fonksoyonda buldurup, bunun sonucunu mainde yazdiriniz.


        Scanner oku= new Scanner(System.in);

        System.out.print("1.Sayi= ");
        int s1= oku.nextInt();

        System.out.print("2.Sayi= ");
        int s2= oku.nextInt();

        int toplam= toplamBul(s1,s2);
        System.out.println("toplam= " +toplam);
    }


    // 1. yol

//    public static int toplamBul ( int sayi1, int sayi2 ){
//
//        int toplam= sayi1 + sayi2;
//
//        return toplam;
//    }
//
//}

    // 2.yol

    public static int toplamBul ( int sayi1, int sayi2 ){


        return ( sayi1+sayi2 );
    }

}
