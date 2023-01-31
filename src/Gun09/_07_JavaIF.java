package Gun09;

import java.util.Scanner;

public class _07_JavaIF {

    public static void main(String[] args) {

        // girilen bir cumledeki kucuk veya buyuk a harfinin olup olmadigini yazdiriniz
        // var ve yok seklinde

        Scanner oku= new Scanner(System.in);
        System.out.print("bir cumle giriniz: ");
        String cumle= oku.nextLine();

        cumle= cumle.toLowerCase(); // butun buyuk harfler kucuk oldu

        if (cumle.contains("a"))
            System.out.println("EVET");

        if (!cumle.contains("a")) // ! degilse, ya da if (cumle.contains("a")==false)
            System.out.println("HAYIR");

        // 2.yol

        if (cumle.indexOf("a") !=-1) // a var ise index pozitif bir index degeri verir.
            // a yok ise index -1 degerini verir.
            // yani a esit degildir -1 ise demek istiyor burda
            System.out.println("EVET");

        if (cumle.indexOf("a") ==-1)  //
            System.out.println("HAYIR");

        // 3. yol

        boolean varMi= cumle.contains("a");
        if (varMi == true)     // if (varMi)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");


    }
}
