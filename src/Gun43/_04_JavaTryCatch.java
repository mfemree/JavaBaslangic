package Gun43;

import java.util.InputMismatchException;
import java.util.Scanner;

public class _04_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program basladi");


            try {
                Scanner oku = new Scanner(System.in);

                System.out.print("sayi1= ");
                int sayi1= oku.nextInt();

                System.out.print("sayi2= ");
                int sayi2= oku.nextInt();

                int bolum = sayi1/sayi2;
                System.out.println("bolum = " + bolum);

            }
            catch (InputMismatchException ex) // belirli bir hata
            {
                System.out.println();
            }
                // String kelime="";  // genel hataya dusmesi icin yapildi
                // kelime.charAt(3);





        }

    }
