package Gun05;

import java.util.Scanner;

public class _02_Ornek {

    public static void main(String[] args) {

        // girilen bir adi ekrana yazdiriniz

        Scanner okuyucu=new Scanner(System.in);
        System.out.print("adinizi giriniz=");
        String ad= okuyucu.next(); // next bir kelime okur.
        System.out.println("ad = " + ad);

        /*
          okuyucu.next();     -> bir kelime okur
          okuyucu.nextLine(); -> satırın tümünü oku

          okuyucu.nextInt();  -> int değeri okumak için
          okuyucu.nextShort();  -> short değeri okuma için
          okuyucu.nextByte();   -> byte değeri okumak için
          okuyucu.nextLong();   -> long değeri okuma için

          okuyucu.nextFloat();  -> float değeri okuma için
          okuyucu.nextDouble(); -> doublem değeri okuma için
        */


    }
}
