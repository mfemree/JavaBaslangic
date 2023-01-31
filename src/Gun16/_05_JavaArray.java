package Gun16;

import java.util.Scanner;

public class _05_JavaArray {
    public static void main(String[] args) {

        // 5 tv kanalı ismini bir diziye doldurunuz.
        // Daha sonra random olarak bir tanesini seçip ekrana seçileni yazıdırnız.


        String[] kanallar= {"trt" , "atv" , "kanald" , "fox" , "haberturk"};  // 01234


                int rastgele= (int) (Math.random() * kanallar.length); // 5 kadar 5 dahil

                String ilkKanal= kanallar[rastgele];

                System.out.println("secilen ilk kanal= " + ilkKanal);


        for (int i =0; i<kanallar.length; i++) {

            if ( ilkKanal.length() == kanallar[i].length() ) {
                continue;
            }

        }
       }

         // devami
         // TODO : gunun sorusu : bir döngü ile 5 tane buldurunuz
         // fakat bir buldunu tekrar bulmasın





    }
