package Gun09;

import java.util.Scanner;

public class _06_JavaIf {
    public static void main(String[] args) {

        // girilen bir cumlede a harfinin gecip gecmedigini bulunuz
        // geciyor ise EVET, gecmiyor ise HAYIR yazdiriniz

        Scanner oku= new Scanner(System.in);
        System.out.print("bir cumle giriniz: ");
        String cumle= oku.nextLine();

        if (cumle.contains("a"))               // ya da  if (cumle.contains("a")==true)
                System.out.println("EVET");

        if (!cumle.contains("a"))              // ! degilse demek, ya da if (cumle.contains("a")==false)
            System.out.println("HAYIR");

        // 2.yol

        if (cumle.indexOf("a") !=-1)  // cumlede gecen a harfinin indeksi -1 degilse demek, demek ki cumlede a harfi var demektir.
                                        // cunku cumlede bir a harfi varsa index pozitif bir index degeri verir.
                                       //  cumlede istenilen harf yok ise, index her zaman -1 degerini verir.
            System.out.println("EVET");

        if (cumle.indexOf("a") ==-1)  //
            System.out.println("HAYIR");

        // 3. yol

        boolean varMi= cumle.contains("a");
        if (varMi == true)
            System.out.println("EVET");

        if (varMi == false)
            System.out.println("HAYIR");



    }
}
