package Gun24;

import java.util.HashMap;

public class _01_JavaMap {
    public static void main(String[] args) {

        // Set -> HashSet, LinkedHashSet, TreeSet
        // Map -> HashMap, LinkedHashMap, TreeMap
        // Map = Anahtar(Key) + (Value) -> Anahtarlı Set

        // anahtarın tipi Integer, değerinin tipi String olsun


        HashMap<Integer,String> hm = new HashMap<>();


        hm.put(1001, "Ismet Temur");
        hm.put(1002, "Cihat Yilmaz");
        hm.put(2001, "Talip Yildiz");
        hm.put(5001, "Eyupcan Bildin");
        hm.put(1002, "Hatice Bayrak");

        System.out.println("hm = " + hm);
        System.out.println("hm.get(2001) = " + hm.get(2001));   //  Talip Yildiz
        System.out.println("hm.get(5001) = " + hm.get(5001));   //  Eyupcan Bildin

        System.out.println("hm.containsKey(2001) = " + hm.containsKey(2001));   //  true
        System.out.println("hm.containsKey(12) = " + hm.containsKey(12));       //  false


        System.out.println("hm.keySet() = " + hm.keySet());   //  tum indexleri/keyleri yazdirmak istersek
                                                              //  [2001, 1001, 5001, 1002]

        System.out.println("hm.values() = " + hm.values());   //  [Talip Yildiz, Ismet Temur, Eyupcan Bildin, Hatice Bayrak]

        hm.remove(5001);
        System.out.println("hm = " + hm);                 //   {2001=Talip Yildiz, 1001=Ismet Temur, 1002=Hatice Bayrak}

        System.out.println("hm.size() = " + hm.size());   //  hm.size() = 3

        hm.clear();
        System.out.println("hm = " + hm);                 //  hm = {}



    }
}
