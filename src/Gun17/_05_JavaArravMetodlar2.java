package Gun17;

import java.util.Arrays;
import java.util.Scanner;

public class _05_JavaArravMetodlar2 {
    public static void main(String[] args) {

        // 10 elemanli bir diziyi random( 10 dahıl ) olarak doldurtuktan sonra,
        // kullanicinin girecegi bir rakami arattirniz.
        // bu rakam var ise indexini yazdiriniz


        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {

            array[i] = (int) (Math.random() * 11);

        }

        System.out.println("dizi= " + Arrays.toString(array));

        Scanner oku = new Scanner(System.in);
        System.out.print("0-10 arasinda bir sayi giriniz= ");
        int n = oku.nextInt();

        for (int i = 0; i < array.length; i++) {

            if ( array[i] == n)
                System.out.println("var oda numarasi= " + i + ". indextir");
            }

        // 2.yol

        int[] dizi = new int[10];

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = (int) (Math.random() * 11);
        }

        System.out.println(Arrays.toString(dizi));

        Scanner oku2 = new Scanner(System.in);
        System.out.print("Aranacak sayı(0-10)= ");
        int arananRakam = oku2.nextInt();

        boolean bulundu = false;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] == arananRakam) {
                bulundu = true;
                System.out.println("Bulundu index=" + i);
            }
        }

        if (!bulundu) {
            System.out.println("Bulunamadı");
        }

    }
}
