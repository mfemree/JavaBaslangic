package Gun12;

import java.util.Scanner;

public class _05_Switch {
    public static void main(String[] args) {

        // Daha önce çözdüğünüz hesap makinesi sorusunu,
        // switch ile çözünüz.

        // Girilen 2 tam sayıyı kullanıcıdan aldıktan sonra,
        // Toplama için T, Çıkarma için Ç, çarpma için P, bölme için B
        // harflerini alarak isteğe uygun olan işlemi yaptırıp
        // sonucu yazdırınız.

        Scanner oku= new Scanner(System.in);
        System.out.print("sayi1 giriniz= ");
        int s1= oku.nextInt();

        System.out.print("sayi2 giriniz= ");
        int s2= oku.nextInt();

        System.out.println("Toplama icin T");
        System.out.println("Cikarma icin C");
        System.out.println("Carpma icin P");
        System.out.println("Bolme icin B");
        System.out.print("Seciminizi giriniz= ");

        Scanner okuStr = new Scanner(System.in);
        String secim= okuStr.next();

        switch (secim.toUpperCase())
        {
            case "T": System.out.println("toplam= " + (s1 + s2)); break;
            case "C": System.out.println("toplam= " + (s1 - s2)); break;
            case "P": System.out.println("toplam= " + (s1 * s2)); break;
            case "B": System.out.println("toplam= " + ((double) s1 / s2)); break;
            default : System.out.println("hatali deger");

        }

    }
}
