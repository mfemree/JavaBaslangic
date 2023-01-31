package Gun43;

import java.util.Scanner;

public class _02_JavaRunTimeException {
    public static void main(String[] args) {

        System.out.println("program basladi");


        for (int i = 0; i <3 ; i++) {

            try {  // hata bolgesinin try kodunun icine aldik
                Scanner oku = new Scanner(System.in);

                System.out.print("sayi1= ");
                int sayi1= oku.nextInt();

                System.out.print("sayi2= ");
                int sayi2= oku.nextInt();

                int bolum = sayi1/sayi2;
                System.out.println("bolum = " + bolum);
            }
            catch (Exception hata ){
                // hata mesajlarini, hata isimli EXception cinsinden degiskene atadik

                System.out.println("hata = " + hata.getMessage());
                System.out.println("lutfen tekrar deneyiniz");
                i--;
            }
        }

        System.out.println("program bitti");
    }
}
