package Gun17;

import java.util.Scanner;

public class _03_JavaSplitMetodu {
    public static void main(String[] args) {

        // Split: bir Stringi parcalara ayirmak demek
        // kullanicidan alacaginiz cumleyi kelimelerine gore alt alta yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("bir cumle giriniz = " );
        String cumle= oku.nextLine();

        String[] kelimeler=cumle.split(" ");

        for (int i = 0; i < kelimeler.length ; i++) {
            System.out.println("kelimeler = " + kelimeler[i]);


        }


    }
}
