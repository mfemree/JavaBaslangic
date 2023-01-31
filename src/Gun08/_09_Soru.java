package Gun08;

import java.util.Scanner;

public class _09_Soru {

    public static void main(String[] args) {

        // girilen bir cumledeki ilk kelimeyi yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.println("Bir cumle giriniz= ");
        String cumle= oku.nextLine();

        // bugun hava sicak;

        int boslukIndex=cumle.indexOf(" ");
        String ilkKelime=cumle.substring(0, boslukIndex);
        System.out.println("cumlenizin ilk kelimesi= " + ilkKelime );

        String ikinciKelimedenSonrasi= cumle.substring( boslukIndex+1 );
        System.out.println("Ikinci Kelime = " + ikinciKelimedenSonrasi);

    }
}
