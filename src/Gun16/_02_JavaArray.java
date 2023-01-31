package Gun16;

import java.util.Scanner;

public class _02_JavaArray {
    public static void main(String[] args) {

        // 50 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk
        // kac not oldugunu bulunuz ve bunlari yazdiirniz.

        Scanner oku = new Scanner(System.in);
        int[] notlar = new int[5];

        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {

            System.out.print("notu giriniz= ");
            notlar[i] = oku.nextInt();
            toplam = toplam + notlar[i];
        }

        int ortalama = toplam / notlar.length;
        int gecenler = 0;

        for (int i = 0; i < notlar.length; i++) {


            if (notlar[i] > ortalama) {

                System.out.println("ortalamayi gecen ogrenci notlari= " + notlar[i]);
                gecenler++;
            }

        }
        System.out.println("ortalama= " + ortalama);
        System.out.println("ortalamayi gecen ogrenci sayisi= " + gecenler);
    }
}