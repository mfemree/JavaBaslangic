package Gun14;

import java.util.Scanner;

public class _04_forLoop {
    public static void main(String[] args) {

        // kullanicinin girecegi bir sayiya kadar (sayi dahil )
        // olan sayilarin toplamini bulunuz

        Scanner oku= new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi= oku.nextInt();

        int toplam=0;

        for (int i=1; i<=sayi; i++ ){

            System.out.println("sayilar= " + i );
            toplam= toplam+i;

        }
        System.out.println();
        System.out.print("toplami= " + toplam);

    }
}
