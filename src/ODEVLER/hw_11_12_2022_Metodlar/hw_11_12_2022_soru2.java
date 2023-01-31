package ODEVLER.hw_11_12_2022_Metodlar;

import java.util.Scanner;

public class hw_11_12_2022_soru2 {
    public static void main(String[] args) {



//       2-      "OrtaKelime" isminden bir method oluşturun.
//                 Bu method String'i parametre olarak almalı.
//                Cümle veya dizelerde ortada bulunan kelimeleri bulmalı.
//                Ortadaki kelimeyi return yapınız.
//                Örnek: Ben Java'yı seviyorum.
//                print : Java'yı
//                 Örnek2:
//                Java'yı kolayca öğreniyorum.
//                print: kolayca

        String orta;
        orta = ortaKelime("ali ata bak");
        System.out.println("middle word= " + orta);

        // ya da scannerla yaparsak
        Scanner scan = new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String cumle = scan.nextLine();

        System.out.println("ortaKelime = " + ortaKelime(cumle));


    }

        public static String ortaKelime ( String cumle){

            int ilkBoslukIndex= cumle.indexOf(" ");
            int sonBoslukIndex= cumle.lastIndexOf(" ");
            String middeleWord= cumle.substring(ilkBoslukIndex+1, sonBoslukIndex);

            return middeleWord;

        }
    }
