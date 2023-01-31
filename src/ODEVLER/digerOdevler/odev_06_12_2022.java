package ODEVLER.digerOdevler;

public class odev_06_12_2022 {
    public static void main(String[] args) {

        // ODEVLER

//        1- 0 ile 100 arasındaki bütün çift sayıları yazdırabileceğiniz bir kod yazınız. _Not: 0 ve 100 dahildir._

       /*System.out.print("cift sayilar= ");
        for (int i=0; i <=100; i=i+2) {
            System.out.print(i + "-");

            if (i == 100) {
                System.out.println("\b");
            }
        }*/

        // 2.yol

//        for (int i = 0; i <=100 ; i++) {
//
//            if ( i % 2 == 0 )
//                System.out.print(i + ",");
//        }


//        2- 0 ile 100 arasındaki bütün tek sayıları yazdırabileceğiniz bir kod yazınız.

//        System.out.print("tek sayilar= ");
//        for (int i = 1; i <= 100; i = i + 2) {
//            System.out.print(i + "-");
//
//            if (i == 99) {
//                System.out.println("\b");
//            }
//        }


//        3- # 100'den 0'a kadar bütün tek sayıları yazdırınız
//        99-98-97-96....
//        `100 ve 0 dahil değildir.

       /* System.out.print("tek sayilar= ");

        for (int i=99; i >=1; i=i-2) {
            System.out.print(i + "-");

            if (i == 1) {
                System.out.println("\b");
            }
        }*/

        // 2.yol

//        for (int i = 100; i > 0 ; i--) {
//            if (i % 2 != 0){
//                System.out.print(i + ",");
//            }
//        }
//        System.out.println("\b");


//        4- #  İlk 10 doğal sayının toplamını hesaplamak için bir kod yazın.
//        `İlk 10 doğal sayı: 1,2,3,4,5,6,7,8,9,10`

        /*int toplam = 0;

        System.out.print("sayilar= ");

        for (int i = 1; i <= 10; i++) {

            System.out.print(i + ",");
            toplam = toplam + i;
        }
        System.out.println();
        System.out.println("Toplami= " + toplam);
    }
}*/

//      5- **0 ile 100** arasındaki sayıları kapsayan bir kod yazınız.
//        Bu kod bu sayıların tek mi çift mi olduğunu belirleyebilecek bir kod olmalı.
//        Eğer sayı çift sayıysa;
//        **This number is even and the number is: 0**
//        This number is odd and the number is: 1
//        This number is even the and number is: 2
//        This number is odd and the number is: 3
//        Eğer sayı tek sayıysa;
//        **This number is odd and the number is: 1**
//        yazdırmalıdır.
//        Sonuç böyle olmalıdır.`

        /*for ( int i=0; i<=100; i++) {

            if (i % 2 == 0)
                System.out.println("this number is even and the number is: " + i);
            else
                System.out.println("this number is odd and the number is: " + i);

        }*/

//        6- # 0 ile 100 arasındaki hem 5'e, hem de 4'e bölünebilen bütün sayıları yazdırınız.
//        `Sonuç bu şekilde olmalıdır.`
//        ```
//        0
//        20
//        40
//        60
//        80
//        100

        /*for ( int i=0; i<=100; i++ ) {

            if (i % 20 == 0)
                System.out.println(i);
        }*/

        // 2.yol

//        for (int i = 0; i <= 100; i++) {
//            if (i % 4 == 0 && i % 5 == 0) {
//                System.out.println(i);
//            }
//        }


//        7- #  Uzunluk ve genişliğini yazan kişinin belirlediği # bütünü oluşturabileceğiniz bir kod yazınız.
//                _örn:
//        _length(uzunluk): 7_
//        _width(genişlik): 5_
//        _Output:_
//        #####
//        #####
//        #####
//        #####
//        #####
//        #####
//        #####

       /* Scanner oku= new Scanner(System.in);
        System.out.print("olusturmak istediginiz seklin uzunlugunu yaziniz= ");
        int length= oku.nextInt();
        System.out.print("simdi genisligini yaziniz= ");
        int width= oku.nextInt();

   for (int i=1; i <= length; i++) {

       for (int j =1; j <= width; j++)
            System.out.print("#");
            System.out.println();
            System.out.println();       // arada bosluk var gibi gozukuyordu odevde, o yuzden boyle yaptim.
                                        // eger bosluk yoksa birini siledebiliriz.
   }*/

//        8- # _Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
//        Sonuç böyle olmalıdır.
//                *
//              * *
//            * * *
//          * * * *
//        * * * * *

        // hocam bu soruyu kendim degil internet yardimiyla cozdum
        // farkli bir ucgen

//        for (int i=1; i <= 5; i++) {
//
//            for (int j=i; j<5; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j=1; j<=i; j++) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }
//
//        // 2.yol
//
//        for (int i = 1; i <= 5; i++) {
//
//            for (int j = 0; j <5-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j < i ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


//        9-  Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız._
//            Sonuç böyle olmalıdır;
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *

        // bu sekli de tamamen sans eseri buldum hocam.
        // yildizin yanina bir de bosluk ekeldim oldu.

        /*for (int i=1; i <= 5; i++) {

            for (int j=i; j<5; j++) {
                System.out.print(" ");
            }

            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }*/

//        10 - # do while loop kullanınız.
//        > 0 ile 30 arasındaki bütün çift sayıları yazdırınız.


//        int i = 0;
//
//        do {
//                i=i+2;
//                System.out.print(i+ ",");
//
//            } while (i < 30) ;
//
//            System.out.print("\b");

        // 2. yol
//
//        for (int i=0; i<=30; i+=2) {
//
//            System.out.print(i + ",");
//
//            if ( i==30)
//                System.out.println("\b");
//    }
    }
}
