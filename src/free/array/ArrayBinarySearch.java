package free.array;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static void main(String[] args) {


        int[] arr= { 1,8,3,7,2,5,8,1,9};


        System.out.println(Arrays.binarySearch(arr,8));   //  6
        System.out.println(Arrays.binarySearch(arr, 5));  //  5
        System.out.println(Arrays.binarySearch(arr, 1));  //  0


        //  aramaya ortadan baslar
        // senin siraladigini siralamadigini bilmez
        // bu methodun dogru sonuc vermesi icin once sort methodu kullanilmalidir
        // ama bu yine de dogru sonuc verecegi anlamina gelmez

        Arrays.sort(arr);
        System.out.println(   (Arrays.toString(arr))  );      //   [1, 1, 2, 3, 5, 7, 8, 8]

        System.out.println(Arrays.binarySearch(arr,8));   //  6
        System.out.println(Arrays.binarySearch(arr, 5));  //  4
        System.out.println(Arrays.binarySearch(arr, 1));  //  1



        // ya olmayan bir urun aratirsak
        // aradigi sayi yoksa biraz daha geri gider
        // java once o sayi, eger bu sayi arrayde olsaydi nerede olurdu diye dusunur ve en yakin olanini secer
        // sonra sectigi bu sirayi - isareti ile bize verir

        System.out.println(Arrays.binarySearch(arr,-3));     // -1
        System.out.println(Arrays.binarySearch(arr, 4));     // -5
        System.out.println(Arrays.binarySearch(arr, 6));     // -6
        System.out.println(Arrays.binarySearch(arr, 10));    // -10
        System.out.println(Arrays.binarySearch(arr, 100));   // -10



    }
}
