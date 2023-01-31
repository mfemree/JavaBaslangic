package Gun21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class  _02_ArrayList_Soru {
    public static void main(String[] args) {

        // Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        // sadece tek sayı olan elemanlarını ayrı diziye atayarak
        // yazdırınız.


        Scanner oku= new Scanner(System.in);

        int dizi[] = new int[6];

        for (int i = 0; i < dizi.length; i++) {

            System.out.print( (i+1) + ".sayiyi giriniz= ");
            dizi[i] = oku.nextInt();

        }
        System.out.println("dizi= " + Arrays.toString(dizi));

        ArrayList<Integer> tekler= new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++) {

            if ( dizi[i] % 2 != 0 )
                tekler.add(dizi[i]);

        }

        System.out.println("tekler= " + tekler);



        // 2. yontem

//        for (int i = 0; i < dizi.length; i++) {
//
//            System.out.print("sayi= ");
//            dizi[i] = oku.nextInt();
//
//            if ( dizi[i] % 2 != 0 )
//                tekler.add(dizi[i]);

    }
}


