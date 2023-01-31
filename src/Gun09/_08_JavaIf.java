package Gun09;

import java.util.Scanner;

public class _08_JavaIf {
    public static void main(String[] args) {

        // kullanicinin 2 kez girecegi sifresinin ayni olup olmadigini
        // AYNI veya DEGIL diye yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("confirm password: ");
        String password1 = oku.nextLine();

        System.out.print("confirm password again: ");
        String password2 = oku.nextLine();

        // STRINGLI KARSILASTIRMALARDA HER ZAMAN EQUALS KODUNU KULLAN

        boolean ayniMi= password1.equals(password2);

        if (ayniMi == true)
            System.out.println("AYNI");

        if (ayniMi == false)
            System.out.println("DEGIL");













    }
}
