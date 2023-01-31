package ODEVLER.odev_13_12_2022;

import java.util.Collections;
import java.util.LinkedHashSet;

import static ODEVLER.odev_13_12_2022.hw_13_12_2022_soru4.removing;

public class hw_13_12_2022_soru4 {
    public static void main(String[] args) {


//        4- removing() isminde bir method oluşturun.
//        Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
//        Eğer Stringler LinkedHashset 'in içinde varsa, sil.
//        Return tipi linkedhashset
//         Örneğin,
//        linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
//        String 1= Germany
//        String 2 = USA
//         **Germany ve USA 'i sil.**
//        Set'i döndür.


        LinkedHashSet <String> lhs = new LinkedHashSet<>();
        Collections.addAll(lhs,"Germany" , "France" , "USA" , "Canada" , "Mexico" , "Brazil" );

        String str1= "France";
        String str2 = "Canada";

        System.out.println("removing(lhs,a,b) = " + removing(lhs, str1, str2));

    }

    public static LinkedHashSet<String> removing(LinkedHashSet<String> lhs, String str1, String str2 ) {

        if ( lhs.contains(str1) )
            lhs.remove(str1);

        if ( lhs.contains(str2) )
             lhs.remove(str2);

        return lhs;
     }

}
