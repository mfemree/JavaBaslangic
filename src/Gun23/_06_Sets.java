package Gun23;

import java.util.HashSet;

public class _06_Sets {
    public static void main(String[] args) {

        HashSet<Integer> setA= new HashSet<>();

        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);
        setA.add(5);

        HashSet<Integer> setB=new HashSet<>();
        setB.add(4);
        setB.add(5);
        setB.add(6);
        setB.add(7);

        System.out.println("setA = " + setA);                   //  setA = [1, 2, 3, 4, 5]
        System.out.println("setB = " + setB);                   //  setB = [4, 5, 6, 7]


        /*** birleştirme  ***/

        HashSet<Integer> birlesikHali=new HashSet<>();
        birlesikHali.addAll(setA);
        birlesikHali.addAll(setB);
        System.out.println("birlesikHali = " + birlesikHali);   //  [1, 2, 3, 4, 5, 6, 7]


        /*** farkı  ***/

        HashSet<Integer> farki =new HashSet<>();
        farki.addAll(setA);
        farki.removeAll(setB);                                 // A dan B yi çıkardı
        System.out.println("farki = " + farki);                // B de olanlari A dan cikardi     [1, 2, 3]


        /*** ortak elemanlar, kesişim ***/

        HashSet<Integer> ortakElemanlar =new HashSet<>();
        ortakElemanlar.addAll(setA);
        ortakElemanlar.retainAll(setB);
        System.out.println("ortakElemanlar = " + ortakElemanlar);        //  [4, 5]

    }

    }