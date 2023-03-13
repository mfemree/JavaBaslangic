package Gun12;

import java.util.Scanner;

public class _01_JavaRandom {
    public static void main(String[] args) {

        // 0-5 arası gibi sayılar ürettik, hep sıfırdan başladı
        // 4-9 arası nasıl ürettirirdim?
        // Yöntem şu : önce aralık arasindaki fark kadar uretirdik yani (9-4) den, 0-5 arasi uretiyor.
        // sonra uretilmis sayıya min sayıyı ekleriz, uretimis sayi + 4
        //  (int)(Math.Random()*(max-min))+min

        // Girilen max ve min aralığında random sayı ürettiririniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("min= ");
        int min= oku.nextInt();

        System.out.print("max= ");
        int max= oku.nextInt();

        int rdnSayi=(int) (Math.random()*(max-min)+min);
        System.out.println("rdnSayi = " + rdnSayi);


    }
}
