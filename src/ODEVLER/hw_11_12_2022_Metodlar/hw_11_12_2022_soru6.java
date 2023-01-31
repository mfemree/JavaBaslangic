package ODEVLER.hw_11_12_2022_Metodlar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class  hw_11_12_2022_soru6 {
    public static void main(String[] args) {

        //6- Girilen bir diziyi tersten yazdıran bir metod yazınız.

        String[] dizi = {"Mustafa", "Emre", "US"};
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(dizi));
        terstenYazdirArrayListi(arr);


        // 3.yontem
        String[] dizi2 = {"m", "a", "l", "e", "s"};
        reverseArr2(dizi);


    }

    public static void terstenYazdirArrayListi(ArrayList<String> strList) {


        // 1.yol
        Collections.reverse(strList);
        System.out.println("strDizi = " + strList);

        // 2.yol
        ArrayList<String> tersi = new ArrayList<>();

        for (int i = strList.size() - 1; i >= 0; i--) {

            tersi.add(strList.get(i));

        }
        System.out.print("tersi = " + tersi);


    }
            // 3. yol
            // dizi ile cozme

        public static void reverseArr2 (String[]dizi)
        {
            for (int i = dizi.length - 1; i >= 0; i--) {
                System.out.print(dizi[i]);
            }
        }
    }



