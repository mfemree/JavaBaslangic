package free.ArrayList;

import java.util.ArrayList;

public class C07_indexOf {
    public static void main(String[] args) {

        int [] arr= {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            sayilar.add(arr[i]);

        }

        System.out.println(sayilar.indexOf(2));          //  bastan baslayarak buldugu ilk 2 nin indexini verir   // 1
        System.out.println(sayilar.lastIndexOf(5));   // en sondan baslayarak buldugu ilk 5 in indexini verir  // 10

    }
}
