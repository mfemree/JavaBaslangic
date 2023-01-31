package Gun06;

import java.util.Scanner;

public class _06_Soru {
    public static void main(String[] args) {

        // Girilen bir af soyadi "Ismet Temur"
        // I.T seklinde yazdiriniz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Adinizi ve soyadinizi giriniz: ");
        String adSoyad= oku.nextLine(); // adSoyad veri olarak alindi.

        // Ismet Temur// Ismet Temur -> I.T.  -> I -> charAt(0) I.
        // indexOf(" ")-> boşluğun indexini veriyor, bunun 1 fazlası charAt() -> T yi verir

        char ilkHarf = adSoyad.charAt(0);

        int boslukIndex= adSoyad.indexOf(" ");
        char soyadIlkHarf= adSoyad.charAt(boslukIndex+1);

        System.out.println(ilkHarf+ "." + soyadIlkHarf+".");

    }
}
