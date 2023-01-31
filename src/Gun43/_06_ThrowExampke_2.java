package Gun43;

import java.util.Scanner;

public class _06_ThrowExampke_2 {
    public static void main(String[] args) {

        Scanner oku = new Scanner(System.in);
        System.out.println("yeni sifre olusturma");

        System.out.print("yeni sifreniz= ");
        String newPassword = oku.nextLine();


        try{
            if ( newPassword.length() < 8)
                throw new Exception("Sifre en az 8 karakterden olusmali");
            if ( newPassword.length()>15)
                throw new Exception("sifre en fazla 15 karakterden olusmali");

        }
        catch (Exception ex)
        {
            // hatalar bir yerde toplanip, hepsi icin yapilmasi gereken islemler
            // bir arada burada yapilabilir. mesela log tutma gibi
            System.out.println("Lutfen Dikkat!");
            System.out.println(ex.getMessage());
            // log tutma

        }
    }
}
