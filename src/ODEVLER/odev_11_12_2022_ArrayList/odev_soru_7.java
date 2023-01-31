package ODEVLER.odev_11_12_2022_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class odev_soru_7 {
    public static void main(String[] args) {


        //        7- getLength() isminde bir method oluşturun.
        //        Parametre olarak String ArrayList
        //        Return tipi Integer ArrayList

        //        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
        //        Tüm elementlerin uzunluğunu döndürün
        //        Örneğin;
        //        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        //        Tüm Stringlerin uzunluklarını yazdırın;
        //        cevap: 10 ,  8 , 4 , 7 , 6 olmalı


        //1.yol
        ArrayList<String> arrList = new ArrayList<>();

        arrList.add("New jersey");
        arrList.add("New york");
        arrList.add("Ohio");
        arrList.add("Florida");
        arrList.add("Boston");

       System.out.println("arrList = " + arrList);

        ArrayList<Integer> newArr= new ArrayList<>();

       newArr= getLenght(arrList);

       System.out.println("uzunluklari= " + newArr);


       //2.yol
        ArrayList<String> arrList2 = new ArrayList<>();
        Collections.addAll(arrList2, "New Jersey", "New york", "Ohio", "Florida", "Boston");
        for ( Integer i  : getLength2(arrList2)){
            System.out.print(i + " ");
        }







        }

    public static ArrayList<Integer> getLenght (ArrayList<String> arrList) {

        ArrayList<Integer> intE = new ArrayList<>();

        for (int i = 0; i <arrList.size(); i++) {

           intE.add(arrList.get(i).length());

        }
        return intE;
    }

    // 2.yol

    public static ArrayList<Integer> getLength2(ArrayList<String> list) {

        ArrayList<Integer> listInt = new ArrayList<>();

        for ( String sizeList: list  ){
            listInt.add(sizeList.length());
        }
        return listInt;
    }




}
