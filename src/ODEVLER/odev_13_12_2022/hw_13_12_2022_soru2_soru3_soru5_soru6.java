package ODEVLER.odev_13_12_2022;

import java.util.*;

public class hw_13_12_2022_soru2_soru3_soru5_soru6 {
    public static void main(String[] args) {

//        2- changeSet() isminde bir method oluşturun.
//        Parametre olarak bir String HashSet   ve  iki String
//        return hashset olmalı
//        Eğer HashSet String 1 e sahipse, String 1 ile String 2 yi değiştirin.
//        **ÖRNEK:**
//        hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
//        String 1 = **banana**
//        String 2 = **peach**
//        **CEVAP:** "peach" , "strawberry" , "kiwi" , "pineapple"


        String str1 = "banana";
        String str2 = "peach";

        System.out.println("changeSet(str1,str2 ) = " + changeSet(str1, str2));


//        3- commonValues() isminde bir method oluşturun ve parametresi  2 tane hashset olmalı.
//        return tipi arraylist olmalı.
//        **ÖRNEĞİN:**
//        İlk Hashset : **"Germany"** , "England" , "South Africa" , **"Brazil" , "USA"**
//        İkinci  hashset  : **"Germany"** , "China" , **"Brazil"** , "France" ,  **"USA"**
//        Ortak değerleri ArrayListe ekleyiniz.
//        çıktı:  "Germany" , "Brazil" ,"USA"
//        ArrayListi yazdırınız.

        HashSet<String> hsBir = new HashSet<>(Arrays.asList("Germany", "England", "South Africa", "Brazil", "USA"));
        HashSet<String> hsIki = new HashSet<>(Arrays.asList("Germany", "China", "Brazil", "France", "USA"));

        System.out.println(commonValues(hsBir, hsIki));


//        5- 2D ArrayList
//        Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
//        Store all the elements in one arraylist and print the arraylist
//        Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//        **Örnek:**
//        ```
//        **Girdi:**
//        [
//        [ 1, 2, 3 ],
//        [ 4, 5, 6 ],
//        [ 7, 8, 9 ]
//        ]
//        **Çıktı:** [1,2,3,4,5,6,7,8,9]
//        ```

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        ArrayList<Integer> arrList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                arrList.add(arr[i][j]);
            }
        }

        // ya da

//        for (int[] ints : arr) {
//
//            for (int j = 0; j < arr.length; j++) {
//                arrList.add(ints[j]);
//            }
//        }


        System.out.println("arrList = " + arrList);

        //  Özel Soru:
        //  6- Bir HashSet i mainde tanımlayınız. Daha Sonra bir fonksiyonda
        //  random olarak toplamı 10 tane olacak şekilde 1 den 20 e kadar olan
        //  sayılarla doldurunuz. Set i main de yazdırınız.

        HashSet<Integer> hs = new HashSet<>();
        System.out.println("setFunct(hs) = " + setFunct(hs));

    }




    // 2.sorunun methodu
    public static HashSet<String> changeSet ( String str1, String str2 ){

        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs,"banana","strawberry" , "kiwi" , "pineapple" );

            if ( hs.contains(str1) ) {
                hs.remove(str1);

                str1 = str2;
                hs.add(str1);
            }

            // ya da

//        if (hs.contains(str1))
//        {
//            hs.remove(str1);
//            hs.add(str2);
//        }

       return hs;
    }

        // 3.sorunun methodu

    public static ArrayList commonValues(HashSet<String> hs1, HashSet<String> hs2 ) {

        ArrayList <String> ortakKelimeler= new ArrayList<>();

        ortakKelimeler.addAll(hs1);
        ortakKelimeler.retainAll(hs2);

        // ya da ( mentorun yaptigi )

//        ArrayList <String> ortakKelimeler= new ArrayList<>(hs1);
//        ortakKelimeler.retainAll(hs2);
//        return  new ArrayList<>(ortakKelimeler);

        return ortakKelimeler;
    }

    // 6.sorunun methodu

    public static HashSet<Integer> setFunct ( HashSet<Integer> hs ){

        do {
            hs.add( (int)(Math.random()*20)  );

        } while ( hs.size() < 10 );

        return hs;

            //  ya da

//            while (hs.size()<10){
//            int random=1+(int)(Math.random()*20);
//            if (!hs.contains(random))
//                hs.add(random);
//            else{
//                int random2=1+(int)(Math.random()*20);
//                hs.add(random2);
//            }
//        }
//        return hs;





    }

    }




