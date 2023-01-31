package Gun10;

import java.util.Scanner;

public class _02_IfElse {

    public static void main(String[] args) {

        // Girilen vize(%50) ve final(%50) notunu okuyarak ortalamayı bulunuz
        // ortalama 60 dan büyük-eşit ise geçtiniz, tebrikler yazdırınız, değilse
        // bütünlemeye kaldınız şeklinde yazdırınız.

        Scanner oku= new Scanner(System.in);

        System.out.print("vizeyi giriniz= ");
        int vize= oku.nextInt();

        System.out.print("finali giriniz= ");
        int finall= oku.nextInt();

        double ortalama= (vize + finall) / 2.0;

        System.out.println("ortalama= " + ortalama);

        if (ortalama >= 60) {
            System.out.println("gectiniz");
            System.out.println("tebrikler");
    }
        else {
            System.out.println("butunlemeye kaldiniz");
    }
    }
}
