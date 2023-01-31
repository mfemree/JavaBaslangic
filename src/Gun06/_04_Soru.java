package Gun06;

import java.util.Scanner;

public class _04_Soru {
    public static void main(String[] args) {

        // girilen bir stringin son harfini yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir cumle giriniz: " );
        String cumle= oku.nextLine();


        // 01234
        // bugun -> son harfin oda numarasi uzunlugun nesi? 1 eksigi

        int uzunluk= cumle.length();
        char sonHarf = cumle.charAt(uzunluk - 1);

        System.out.println("son harf: " + sonHarf);

        // 2. yontem

      /*  System.out.println("son harf=" + cumle.charAt( cumle.length() -1);*/

    }
}
