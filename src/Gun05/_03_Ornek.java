package Gun05;

import java.util.Scanner;

public class _03_Ornek {
    public static void main(String[] args) {

        // kullanicidan adini ve soyadini alarak ekrana yazdiriniz

        Scanner okuyucu=new Scanner(System.in);        // okuma islemini yapacak olan degisken tanimlandi
        System.out.print("adiniz ve soyadiniz= ");     // ekrana neyin girilecegini yazdik, bilgilendirme

        String adSoyad= okuyucu.nextLine();             // okuma islemi bu noktada yapiliyor

        System.out.println("adiniz ve soyadiniz= " + adSoyad);  // verinin gercekten okunabildigini tekrar ekrana yazarak kontrol ettim.

        Scanner scan = new Scanner(System.in);
        System.out.print("adinizi soydinizi giriniz= ");
        String adSoyad2 = scan.nextLine();
        System.out.println(adSoyad2);
    }
}
