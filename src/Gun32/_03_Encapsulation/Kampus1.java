package Gun32._03_Encapsulation;

import java.util.Scanner;

public class Kampus1 {

    public static void main(String[] args) {

        Scanner okuInt = new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);

     Okul yeniOkul = new Okul("Kabatas Okulu", 3);  // maxDeg 3

     do {

         System.out.println("Ogrenci adi= "); String ad = okuStr.nextLine();
         System.out.println("Ogrenci soyadi= "); String soyad = okuStr.nextLine();
         System.out.println("Ogrenci adi= "); int yas = okuInt.nextInt();

         if ( yas < 15 ) {

             Ogrenci ogr = new Ogrenci(ad, soyad, yas);
             yeniOkul.getOgrenciler().add(ogr);
         }
         else{
             System.out.println("ogrenci yasi okul icin uygun degil");
         }

     } while ( yeniOkul.getOgrenciler().size() < yeniOkul.getKontejyan() );

        System.out.println("ogrenciler= " + yeniOkul.getOgrenciler());

    }
}
