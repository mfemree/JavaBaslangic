package Gun10;

import java.awt.*;
import java.util.Scanner;

public class _06_IfElse {

    public static void main(String[] args) {

        // Girilen yeni bir password un kurallara uygunluğunu kontrol ediniz.
        // kurallar :
        // 1) en az 8 karakter olmalı
        // 2) içinde pass kelimesi olmamalı
        // 3) en fazla 12 karakter olmalı.

        Scanner oku= new Scanner(System.in);
        System.out.print("enter passaword= ");
        String passoword= oku.nextLine();

        int uzunluk= passoword.length();
        boolean varMi= passoword.toLowerCase().contains("pass");

        if (uzunluk >= 8 && uzunluk <=12 && varMi!=true)  // !varMi
            System.out.println("uygun");
        else System.out.println("uygun degil");


        // 2. yontem

        if (passoword.length() >= 8 && passoword.length() <=12 && passoword.toLowerCase().contains("pass")==false)
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");


        // 3. Yöntem
        if (passoword.length() >= 8 && passoword.length() <=12 && !passoword.toLowerCase().contains("pass"))
            System.out.println("uygun");
        else
            System.out.println("uygun DEĞİL");



    }
}
