package free.ArrayList;

import java.util.ArrayList;

public class C02_TopluElemanEkleme {
    public static void main(String[] args) {

        ArrayList <String> harfler = new ArrayList<>();

        // tum sesli harfleri listeye ekleyin.
        // eklenecek tum elementleri bir array olrak yazip sonra for loop ile list e ekleyebiliriz.

        String[] arr= {"a", "e", "i", "o", "u" };

        for (int i = 0; i <arr.length; i++) {

            harfler.add(arr[i]);

        }
        System.out.println(harfler);    //  [a, e, i, o, u]
    }
}
