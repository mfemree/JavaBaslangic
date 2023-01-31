package Gun20;

import java.util.Scanner;

public class _02_JavaMethodReturn {
    public static void main(String[] args) {

        // kullanciinin girecegi 2 sayidan buyuk olanini bulma islemini bir methodda
        // yaptiktan sonra main de yazdiriniz

        Scanner oku= new Scanner(System.in);

        System.out.print("1. sayiyi giriniz= ");
        int sayi1= oku.nextInt();

        System.out.print("2. sayiyi giriniz= ");
        int sayi2= oku.nextInt();

        int enb= enbBul( sayi1, sayi2);
        System.out.print("enb= " + enb);

    }

    public static int enbBul ( int s1, int s2 ) {


        // 1.yontem

//        int buyukSayi;
//
//        if (s1 > s2)
//            buyukSayi = s1;
//        else
//            buyukSayi = s2;
//
//        return buyukSayi;

        // 2.yontem

//        return s1 > s2 ? s1 : s2;

        // 3. yontem

        if ( s1 > s2)
            return s1;
        else
            return s2;

    }

}
