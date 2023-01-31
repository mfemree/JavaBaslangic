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

        int ilkBoslukIndex= sayilar.indexOf(" ");
        String sayi1= sayilar.substring(0,ilkBoslukIndex);

        int bosluk2Index= sayilar.lastIndexOf(" ");
        String sayi2= sayilar.substring(ilkBoslukIndex+1,bosluk2Index);

        String sayi3= sayilar.substring(bosluk2Index+1);

        System.out.println(sayi3);

        int sayi1Str= Integer.parseInt(sayi1);
        int sayi2Str= Integer.parseInt(sayi2);
        int sayi3Str= Integer.parseInt(sayi3);

        int toplam= sayi1Str+sayi2Str+sayi3Str;


       if ( toplam % 2 == 0)
            System.out.println("Toplam= " + toplam + " " + "ve sayiniz CIFTTIR");
        else
            System.out.println("Toplam= " + toplam + " " + " ve sayiniz TEKTIR");



    }
}
