package Gun23;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class _02_Sets {
    public static void main(String[] args) {

        // SETS
        // HashSet       : Hızlı, bunun için kendine göre algoritmik sırada tutar
        // LinkedHashSet : EKLEME SIRASI na göre sıralı tutar.
        // TreeSet       : herzaman içinde SIRALI şekilde tutar, kendinden sortlu
        //                 Hızlı, bunun için kendine göre algoritmik sırada tutar

        HashSet <String> hs = new HashSet<>();
        hs.add("bir");
        hs.add("iki");
        hs.add("uc");
        hs.add("dort");
        hs.add("bes");
        System.out.println("hs = " + hs);


        LinkedHashSet<String> lhs = new LinkedHashSet<>();         // null verilere izin verir
        lhs.add("bir");
        lhs.add("iki");
        lhs.add("uc");
        lhs.add("dort");
        lhs.add("bes");
        lhs.add((null));
        System.out.println("lhs = " + lhs);


        TreeSet<String> ts = new TreeSet<>();                     // null verilere izin vermez
        ts.add("bir");
        ts.add("iki");
        ts.add("uc");
        ts.add("dort");
        ts.add("bes");
        ts.add(null);                                              // CTE vermez ama calistiginda hata verir
        System.out.println("ts = " + ts);



    }
}
