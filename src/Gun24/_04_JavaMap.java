package Gun24;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class _04_JavaMap {
    public static void main(String[] args) {

        Map<Integer, String> hm = new HashMap<>();    //  MAP lerden HashMap

        hm.put(9, "tilki");
        hm.put(2, "kedi");
        hm.put(30, "kopek");
        hm.put(11, "kus");
        hm.put(4, "kurt");
        System.out.println("hm = " + hm);            // hizli calismak icin, kafasina gore siralar


        Map<Integer, String> lhm = new LinkedHashMap<>();  // MAP lerden LinkedHashMap

        lhm.put(9, "tilki");
        lhm.put(2, "kedi");
        lhm.put(30, "kopek");
        lhm.put(11, "kus");
        lhm.put(4, "kurt");
        System.out.println("lhm = " + lhm);            // ekelndigi siraya gore siralar



        Map<Integer, String> trm= new TreeMap<>();

        trm.put(9, "tilki");
        trm.put(2, "kedi");
        trm.put(30, "kopek");
        trm.put(11, "kus");
        trm.put(4, "kurt");
        System.out.println("trm = " + trm);            // Her zaman sirali KEYe gore, kendinden sortlu




    }
}
