package Gun13;

import java.util.Scanner;

public class _05_WhileLoop {
    public static void main(String[] args) {

        // 100 e kadar olan sayilarin toplaminiz bulunuz

        int sayac=1;
        int toplam=0;

        while (sayac <= 100 )

        {
            toplam= toplam+sayac;
            sayac++;

        }

        System.out.println("Toplam= " + toplam);


    }
}
