package Gun24;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _05_Soru {
    public static void main(String[] args) {

        // Canlı Sözlük yapılmak isteniyor.
        // Kullanıcıya aşağıdaki gibi bir menü çıkarınız.
        // 1- Ekleme (Bu secekte kelimenin kendisini  ve manasını aliniz)
        // 2- Düzeltme (Bu secenkte kullanıcının kelimenin manasını düzelttiriniz.)
        // 3- Listeleme
        // 4- Arama (Bu secekte verilen bir kelimeyle başlayan tüm kelimelerin manaları)
        // 5- Silme
        // 6- Çıkış


        Map <String,String> sozluk = new TreeMap<>();

        Scanner okuInt= new Scanner(System.in);
        Scanner okuStr= new Scanner(System.in);

        int secim=0;


        do {

            System.out.println("MENU: \n\n1-EKLEME\n2-Duzeltme\n3-Listeleme\n4-Arama\n5-Silme\n6-Cikis\n");
            System.out.print("Lutfen seciminizi giriniz= ");

            secim=okuInt.nextInt();
            String aranacakKelime;

            // secime gore islem yapilacak
            switch ( secim ) {

                case 1:  // 1 i secti ise ekleme islemini yap,
                    // kelimeyi giriniz
                    System.out.print("Kelime giriniz= ");
                    String kelime = okuStr.nextLine();

                    //manasini giriniz
                    System.out.print("Manasini yaziniz= ");
                    String manasi = okuStr.nextLine();

                    // buna uygun degisken ekle
                    sozluk.put(kelime, manasi);
                    break;

                case 2: // 2 yi secti ise duzeltme islemini yap
                    System.out.println("duzeltme secildi");
                    break;

                case 3:
                    System.out.println("eklediginiz kelime ve manasi: " + sozluk.entrySet());

                case 4:
                    if (secim == 4) {
                        System.out.print("aramak istediginiz kelimeyi giriniz= ");
                        aranacakKelime = okuStr.nextLine();

                        if (sozluk.entrySet().equals(aranacakKelime)) {

                            System.out.println("aradiginiz kelimenin manalari:");  // burda kaldin, kelimenin manasi

                        }
                    }

            }

        }while ( secim !=6 );   // cikis olmadigi surece devam

            // TODO: geri kalan menu islemleri yapilacak
            // TODO: 2.asama menulerde yapialcak islemleri METOD ile yapiniz.
    }
}
