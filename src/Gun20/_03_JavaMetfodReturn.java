package Gun20;

import java.util.Scanner;

public class _03_JavaMetfodReturn {
    public static void main(String[] args) {

        // kullanıcının gireceği bir sayıya kadar olan sayıların çarpımını (faktöryel)
        // bir fonksiyonda buldurup, bunun sonucunu main de tek mi çift mi olduğunu yazdırınız.

        Scanner oku = new Scanner(System.in);
        System.out.print("bir sayi giriniz= ");
        int sayi= oku.nextInt();

        int carpim = faktoryel(sayi);

        System.out.println( sayi + "! faktoriyelin sonucu= " + carpim );

        if ( carpim %2 == 0)
            System.out.println("sonuc cifttir");
        else
            System.out.println("sonuc tektir");
        }

        public static int faktoryel ( int sayi) {

        int carpim=1;

            for (int i =1; i <= sayi; i++) {
                carpim= carpim*i;
        }
            return carpim;


    }
}
