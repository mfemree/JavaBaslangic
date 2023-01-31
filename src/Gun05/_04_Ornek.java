package Gun05;

import java.util.Scanner;

public class _04_Ornek {

    public static void main(String[] args) {

        // kullaniciya once adini ve soyadini yazdirip sonra da birlikte yan yana yazdiriniz.

        Scanner oku=new Scanner(System.in);
        System.out.print("adiniz= ");
        String ad= oku.nextLine();

        Scanner okuyucu1=new Scanner(System.in);
        System.out.print("soyadiniz= ");
        String soyad= oku.next();

        System.out.println("ad = " + ad);
        System.out.println("soyad = " + soyad);
        System.out.println("adiniz soyadiniz = " + ad +" "+ soyad);
    }
}
