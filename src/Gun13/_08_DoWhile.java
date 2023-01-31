package Gun13;

import java.util.Scanner;

public class _08_DoWhile {
    public static void main(String[] args) {

        // kullanicidan x girilene kadar ekrana "program calisiyor" yazacak
        // ve x girildiginde ise "program bitti yazacak"

        Scanner oku= new Scanner(System.in);
        String girilen;

        do {
            System.out.print("bir seyler yaziniz= ");
            girilen= oku.nextLine();

            System.out.println("program calisiyor");

        } while (!girilen.equalsIgnoreCase("x"));

        System.out.println("program bitti");

    }
}
