package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _02_JavaMap {
    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<>();

        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yilmaz");
        hm.put(2001, "Talip Yildiz");
        hm.put(5001, "Eyupcan Bildin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm.keySet() = " + hm.keySet());      //  [2001, 1001, 5001, 1002]
        System.out.println("hm.values() = " + hm.values());      //  [Talip Yildiz, Ismet Temur, Eyupcan Bildin, Hatice Bayrak]

        for ( Integer k : hm.keySet() )
            System.out.print(k + "\t");                         //  2001	1001	5001	1002

        System.out.println();

        for ( String v : hm.values() )
            System.out.print(v + "\t");                         //  Talip Yildiz	Ismet Temur	Eyupcan Bildin	Hatice Bayrak

        System.out.println();
        for (Map.Entry<Integer, String> kv: hm.entrySet() )
            System.out.println(kv.getKey() + " - " + kv.getValue());     //   2001 - Talip Yildiz
                                                                         //   1001 - Ismet Temur
                                                                         //   5001 - Eyupcan Bildin
                                                                         //  1002 - Hatice Bayrak


    }
}
