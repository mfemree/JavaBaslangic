package Gun11;

import java.util.Scanner;

public class _09_JavaRAndom {

    public static void main(String[] args) {

        // Girilen bir sayıya kadar random sayı üreterek tahmin etmeye çalışnız
        // kullanıcı bilirse tebrikler yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("uretilecek sayi sinirini girin= ");
        int sinir= oku.nextInt();

        int tutulanSayi= (int)(Math.random()*sinir);

        System.out.print("simdi bir tahminde bulunun= ");
        int tahmin= oku.nextInt();

        if (tahmin == tutulanSayi)
        {
            System.out.println("tutulan sayi= " + tutulanSayi + " " + "idi");
            System.out.println("bildiniz, tebrikler");
        }
        else {
            System.out.println("bilemedin kiii, bilemedin kiii");
            System.out.println("tuttugum sayi= " + tutulanSayi + " " + "idi");
        }

    }
}
