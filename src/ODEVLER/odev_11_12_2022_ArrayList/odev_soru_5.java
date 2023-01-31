package ODEVLER.odev_11_12_2022_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class odev_soru_5 {
    public static void main(String[] args) {

        //        5- ismi getCount() olan bir method oluşturun.
        //        Parametre olarak bir String ArayList  ve  bir tane String
        //        Return tipi int olmalı.
        //        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        //        Örneğin;
        //        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        //        String Orange:
        //        Count = 2 olmalı. (Orange 2 kez yazılmış)

        String[] arr3 = {"orange", "kiwi", "peach", "banana", "kiwi", "peach", "kiwi", "orange", "kiwi", "peach"};


        // farkli bir yolun yazdirilisi
        System.out.println(getCount(arr3));


        ArrayList<String> arr3List = new ArrayList<>();
       // ArrayList<String> arr3List = new ArrayList<>(Arrays.asList(arr3));  // 2.yontem


        for (int i = 0; i < arr3.length; i++) {
            arr3List.add(arr3[i]);
        }

        System.out.println("kelimenin tekrar sayisi= " + tekrarSayisiniBul(arr3List, "kiwi"));

        // ya da

        int a = tekrarSayisiniBul(arr3List, "kiwi");
        System.out.println(a);


        // uzun yol-metodsuz

//        String[] arr3 = {"orange", "kiwi", "peach", "banana", "kiwi", "peach", "kiwi", "orange", "kiwi", "peach"};
//
//        ArrayList<String> arr3List = new ArrayList<>();
//
//        int orangeSayac = 0;
//        int kiwiSayac = 0;
//        int peachSayac = 0;
//        int bananaSayac = 0;
//
//        for (int i = 0; i < arr3.length; i++) {
//
//            arr3List.add(arr3[i]);
//        }
//        System.out.println("arr3List = " + arr3List);
//
//        for (int i = 0; i < arr3List.size(); i++) {
//
//            if (arr3List.get(i).equals("orange")) {
//                orangeSayac++;
//            }
//            if
//            (arr3List.get(i).equals("kiwi")) {
//                kiwiSayac++;
//            }
//            if (arr3List.get(i).equals("peach")) {
//                peachSayac++;
//            }
//            if (arr3List.get(i).equals("banana")) {
//                bananaSayac++;
//            }
//        }
//        System.out.println("bananaSayac = " + bananaSayac);
//        System.out.println("peachSayac = " + peachSayac);
//        System.out.println("kiwiSayac = " + kiwiSayac);
//        System.out.println("orangeSayac = " + orangeSayac);

    }

    public static int tekrarSayisiniBul (ArrayList<String> strArr, String str ){

        int sayac=0;

        for (int i = 0; i < strArr.size(); i++) {

            if (strArr.get(i).equals(str)) {
                sayac++;
            }
        }

        return sayac;
    }


    // farkli bir yol

    public static String getCount(String[] arr)
    {
        int count=1;
        String tekrar="";
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])){
                count++;
                tekrar=arr[i];
            }
        }
        return tekrar+" "+count+" kez yazılmış";
    }




}

