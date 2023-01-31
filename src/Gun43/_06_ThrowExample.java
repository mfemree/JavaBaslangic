package Gun43;

import java.util.Scanner;

public class _06_ThrowExample {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("yeni sifre olusturma");

        System.out.print("yeni sifreniz= ");
        String newPassword = oku.nextLine();

        if ( newPassword.length() <8 ){

            System.out.println("Lutfen Dikkat!");
            System.out.println("sifre en az 8 karakterden olusmali");
            // log tutma
        }

        if ( newPassword.length() >5)
        {
            System.out.println("Lutfen Dikkat!");
            System.out.println("sifre en fazla 15 karakterden olusmali");
            // log tutma
        }
    }
}
