package free.ArrayList;

import java.util.ArrayList;

public class C09_clear {
    public static void main(String[] args) {

        int [] arr= {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            sayilar.add(arr[i]);

        }
        sayilar.clear();
        System.out.println(sayilar);       //  []
                                           // her seyi siler
    }
}
