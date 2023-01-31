package Gun13;

import java.util.Scanner;

public class _04_WhileLoop {
    public static void main(String[] args) {

        // giirlen 20 sayidan sadece pozitif olanlari toplayiniz

        Scanner oku= new Scanner(System.in);


        int sayac=0;
        int toplam=0;

        while (sayac <5 )

        {
            System.out.print( (sayac+1) + ".sayiyi giriniz= ");
            int sayi= oku.nextInt();

            sayac++;

            if (sayi > 0 )
                toplam=toplam+sayi;

        }

        System.out.println("Toplam= " + toplam);

    }
}
