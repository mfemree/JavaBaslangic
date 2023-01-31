package Gun30._02_FinalDegiskenler.Ornek2;

import java.util.Scanner;

public class Soru {

    // Sabitler isimli bir Class da sabit bir şekilde
    // bir gündeki saat sayısı, bir saatdaki dakika sayısı ve
    // bir dakikadaki saniye sayısını tanımlayınız.
    // mainde kullanıcıdan gun, saat, dakika alarak toplam
    // saniyeyi bulunuz.

    public static void main(String[] args) {

        int gun;
        int saat;
        int dak;

        Scanner oku = new Scanner(System.in);
        System.out.print("gun = " );  gun = oku.nextInt();
        System.out.print("saat = " ); saat = oku.nextInt();
        System.out.print("dak = " );   dak = oku.nextInt();

        // 1.yontem
        int toplamSaniye=

                gun
                * Sabitler.birGundekiSaatSayisi
                * Sabitler.birSaatdekiDakSayisi
                * Sabitler.birDakikadakiSanSayisi
                +
                saat
                * Sabitler.birSaatdekiDakSayisi
                * Sabitler.birDakikadakiSanSayisi
                +
                dak
                * Sabitler.birDakikadakiSanSayisi;

        System.out.println("toplam Saniye = " + toplamSaniye);


        // 2. Yontem
        System.out.println("Toplam Saniye= " + Sabitler.hesapla(gun, saat, dak));

    }

}
