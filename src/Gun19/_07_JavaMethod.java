package Gun19;

import java.util.Scanner;

public class _07_JavaMethod {
    public static void main(String[] args) {


        tekMiCiftMi(55);
        tekMiCiftMi(60);

        // kullnicidan sayi alarak onu tek mi cift mi yazdiralaim

        tekMiCiftMiOku();

    }

    public static void tekMiCiftMi ( int sayi ){

        if ( sayi %2 != 0 )
            System.out.println("girdiginiz sayi: tek");
        else
            System.out.println("girdiginiz sayi: cift");

    }

    public static void tekMiCiftMiOku() {

        Scanner oku= new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int girilenSayi= oku.nextInt();

        tekMiCiftMi(girilenSayi);

    }


}
