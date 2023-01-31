package Gun11;

import java.util.Scanner;

public class _05_JavaTemary {

    public static void main(String[] args) {

        // Soru : Girilen bir sayının sıfır mı, negatif mi, pozitif mi
        //        olduğunu Ternary operatör ile yazdırınız.


        Scanner oku= new Scanner(System.in);
        System.out.print("sayi giriniz= ");
        int sayi= oku.nextInt();

        String sonuc= ( sayi == 0 ? "sifir" : (sayi>0 ? "pozitif" : "negatif"));
        System.out.println("sayiniz = " + sonuc);

        // ya da

        System.out.println( sayi == 0 ? "sifir" : (sayi>0 ? "pozitif" : "negatif"));


    }
}
