package Gun10;

import java.util.Scanner;

public class _08_IfElse {
    public static void main(String[] args) {

        // yan yana aralarında bir boslukla girilen 3 int sayının
        // toplamlarının sonucunun tek mi çift mi olduğunu bulunuz
        // 45 67 123

        Scanner oku= new Scanner(System.in);
        System.out.print("yan yana aralarinda bosluk birakarak 3 sayi giriniz= ");
        String sayilar= oku.nextLine();

        int ilkBoslukIndex= sayilar.indexOf(" ");            // ılk bosluk
        String sayi1Str= sayilar.substring(0,ilkBoslukIndex);

        int bosluk2Index= sayilar.lastIndexOf(" ");      // 2.bosluk ( yani sonuncu bosluk )
        String sayi2Str= sayilar.substring(ilkBoslukIndex+1,bosluk2Index);

        String sayi3Str= sayilar.substring(bosluk2Index+1);

        int sayi1int= Integer.parseInt(sayi1Str);
        int sayi2int= Integer.parseInt(sayi2Str);
        int sayi3int= Integer.parseInt(sayi3Str);

        int toplam= sayi1int+sayi2int+sayi3int;


       if ( toplam % 2 == 0)
            System.out.println("Toplam= " + toplam + " " + "ve sayiniz CIFTTIR");
        else
            System.out.println("Toplam= " + toplam + " " + " ve sayiniz TEKTIR");

    }
}
