package free.array;

import java.util.Arrays;

public class ArrayeYeniDegerAtama {
    public static void main(String[] args) {

        String str= "java";

        str= "hava";




        // var olan bir array in uzunlugu degistirilemez
        // ama var olan bir arraye yeni bir array degeri atanabilir
        // 1- var olan bir arrayi yeni deger olarak atayabiliriz

        String [] arr1= {"ali", "veli"};
        String [] arr2= {"A", "B", "C"};

        arr1=arr2;

        System.out.println(Arrays.toString(arr1));    //  [A, B, C]

        // 2- istedigimiz uzunlukta yeni bos bor array degeri atayabilriiz.

        arr1= new String[6];
        System.out.println(Arrays.toString(arr1));   //   [null, null, null, null, null, null]

        // 3- yeni olusturuulan bir arraye {} icinde deger yazarak atama yapabliriz.
        // ancak var olan bir arraye yeni deger atamasi icin {} kullanilamaz
        // arr1= {"g", "h"} olmaz.

        int[] arr3= {1,2,3 };
        // arr3 = {1,2,3,4};  olmazzz
















    }
}
