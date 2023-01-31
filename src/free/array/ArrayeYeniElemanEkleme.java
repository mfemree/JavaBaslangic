package free.array;

import java.util.Arrays;

public class ArrayeYeniElemanEkleme {
    public static void main(String[] args) {

        int [] arr = {2,4,6 };

        // bu array e 4.bir element olarak 8 ekleyelim


        // var olan bir arraye yeni eleman eklenemez
        // ama yeni deger atanabilir

        // once int [] arr2= [2,4,6,8] seklinde yeni bir array olusturup
        // sonra arr2 degerini arr'ye atayabilirim


        // yeni array olusturalim
        // arr2 ye konulacak datalarin turu
        // uzunlugu ise eski arrayin uzunlugunun 1 fazlasi


        int[] arr2= new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {

            arr2[i]= arr[i];

        }

        System.out.println(Arrays.toString(arr2));   // [2, 4, 6, 0]

        arr2[ arr2.length-1]=8;
        System.out.println(Arrays.toString(arr2));   // [2, 4, 6, 8]

        // son olarak da arr array iyeni deger olrak olusturdugumuz arr2 yi atayacagiz
        arr= arr2;

        System.out.println("arr nin son hali= " + Arrays.toString(arr));    //  [2, 4, 6, 8]


    }
}


//        ya da

//        int [] arrYeni= {2,4,6,8 };
//
//        arr= arrYeni;
//
//        System.out.println(Arrays.toString(arr));    //  [2, 4, 6, 8]