package Gun13;

import java.util.Scanner;

public class _03_WhileLoop {
    public static void main(String[] args) {

        // girilen 20 sayinin toplamini giriniz

        Scanner oku= new Scanner(System.in);

        int sayac=0;
        int toplam=0;

        while (sayac <20 )

        {
            System.out.print( (sayac+1) + ".sayiyi giriniz= ");
            int sayi= oku.nextInt();

            sayac++;

            toplam=toplam+sayi;

        }

        System.out.println("Toplam= " + toplam);

    }
}
