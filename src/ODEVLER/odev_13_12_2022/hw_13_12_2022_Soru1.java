package ODEVLER.odev_13_12_2022;

import java.util.Arrays;
import java.util.HashSet;

public class hw_13_12_2022_Soru1 {
    public static void main(String[] args) {

//        1- Create a method totalCount()
//        totalCount() isminde bir method oluşturun.
//        Parametresi  'Integer Hashset' olmalı
//        HashSetteki eleman sayısını alın.
//        totalCount'u döndürün.
//        _**Örnek:**_
//                hashset ; 4,2,3,1,7
//        cevap: 5

        HashSet<Integer> hs = new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("totalCount(hs) = " + totalCount(hs));

    }

    public static Integer totalCount (HashSet<Integer> hs ) { return hs.size(); }

}
