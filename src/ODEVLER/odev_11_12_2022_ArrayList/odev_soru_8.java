package ODEVLER.odev_11_12_2022_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class odev_soru_8 {
    public static void main(String[] args) {

        //        8- İsmi changelnArraylist() olan bir method oluşturun.
        //        Parametre olarak String ArrayList, String s1, String s2
        //        Arraylist'te s1'i s2 olarak değiştirin
        //        Return String arrayList
        //        Örneğin;
        //        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        //        s1 = blue
        //        s2 = yellow
        //        Tüm blue 'ları yellow'a dönüştürün.
        //        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"

        ArrayList<String> str = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        // ya da
        // Collections.addAll(str,  "yellow" , "red" , "blue" , "red" , "blue" );


        String s1="blue";
        String s2="yellow";

        System.out.println("ilk str = " + str);

        str = changelnArraylist(str, s1, s2);
        System.out.println("degistirilmis hali= " +str);


        // 2.yontem
        ArrayList<String> str2 = new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));

        for ( String s : changeArrayList(str2) ){
            System.out.print(s + " ");
        }



    }

    public static ArrayList<String> changelnArraylist (ArrayList<String> strList, String str1, String str2   ) {


        for (int i = 0; i < strList.size(); i++) {

            if (strList.get(i).equals(str1))
                strList.set(i, str2);
        }
        return strList;
    }

    // 2.yol

    public static ArrayList<String> changeArrayList ( ArrayList<String> list ){

        ArrayList<String> changedList = new ArrayList<>();

        for ( String s : list    ){

            if ( s.equals("blue"))
                s= "yellow";
            changedList.add(s);
        }
        return  changedList;
    }




}
