package ODEVLER.odev_11_12_2022_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class odev_soru_6 {
    public static void main(String[] args) {


        //        6- getSum() isminde bir method oluşturun.
        //           Parametresi ArrayList olmalı
        //           Return tipi int olmalı.
        //           ArrayList teki tüm sayıları birbiri ile toplayın.
        //           return olarak toplam sonucu döndürün
        //           Örneğin;
        //           Arraylist = 1,2,3,4,5
        //           return 15 olmalı


        // 1.yol
        ArrayList<Integer> NumList = new ArrayList<>();

        NumList.add(1);
        NumList.add(2);
        NumList.add(3);
        NumList.add(4);
        NumList.add(5);

        System.out.println("getSum(NumList) = " + getSum(NumList));


        // 2. yol
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1,2,3,4,5);

        System.out.println("toplam= " + getSum2(list));


    }

    public static int getSum (ArrayList < Integer > sayilarList) {

        int toplam = 0;

        for (int i = 0; i < sayilarList.size(); i++) {

            toplam += sayilarList.get(i);

        }

        return toplam;
    }


    // 2.yol

    public static int getSum2 ( ArrayList<Integer> list ) {

        int toplam=0;

        for ( Integer intNumList : list   ) {
            toplam += intNumList;

        }
        return toplam;
    }





}
