package ODEVLER.odev_11_12_2022_ArrayList;

import java.util.Arrays;

public class odev_soru_1_2_3_4 {
    public static void main(String[] args) {

//        1- Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
//        Bütün 2'leri 6'yla değiştirin.
//        Array'i yazdırınız.


        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (array[i][j] == 2)
                    array[i][j] = 6;

                System.out.print("[" + array[i][j] + "]" +  " " );
                // ya da
                System.out.println(Arrays.deepToString(array));

            }

        }

//        2- Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
//        2D array'de olan elemanları toplayınız.
//        toplamı yazdırınız.
//        Sonuç 32 olmalıdır.

        int[][] arr1 = {{5,2,1} , {10,2,3,6} , {1,2}};
        int toplam=0;

        for (int i = 0; i <arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {

                toplam += arr1[i][j];
            }
        }
        System.out.println("\n" + "toplam= " + toplam);



//      3- Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
//
//        [{"new jersey","atlanta","ohio"} , {"Pittsburgh" ,"ohio","new york","ohio"} , {"ohio","new york"}]
//
//        Bütün ohio'ları Florida'yla değiştiriniz.
//        Array'i yazdırınız.

        String[][] arr2 = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "new york", "ohio"}, {"ohio", "new york"}};

      //  ArrayList<String> arr2list = new ArrayList<>();


        for (int i = 0; i < arr2.length; i++) {

            for (int j = 0; j < arr2[i].length; j++) {

                if (arr2[i][j].equals("ohio"))
                    arr2[i][j] = "Florida";

            }
        }

        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));


//        4-
//            Bir tane 2d array [][] oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]

//            Store all the elements in one arraylist and print the arraylist
//            Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
//            **Örnek:**
//            ```
//            **Girdi:**
//            [
//            [ 1, 2, 3 ],
//            [ 4, 5, 6 ],
//            [ 7, 8, 9 ]
//            ]
//            **Çıktı:** [1,2,3,4,5,6,7,8,9]

//        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//
//        ArrayList<Integer> arrNumList = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//
//            for (int j = 0; j < arr[i].length; j++) {
//
//                arrNumList.add(arr[i][j]);
//            }
//        }
//        System.out.println(arrNumList);


    }

    }




