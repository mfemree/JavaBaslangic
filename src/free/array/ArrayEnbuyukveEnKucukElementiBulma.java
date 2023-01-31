package free.array;

import java.util.Arrays;

public class ArrayEnbuyukveEnKucukElementiBulma {
    public static void main(String[] args) {

        // verilen bir int array de en buyuk ve en kucuk sayilari yazdiran bir method olusturun

        int[] arr = {3, 8, 1, 5, 2, 9};

        enBuyukEnkucukElementYazdir(arr);


    }

    public static void enBuyukEnkucukElementYazdir(int [] arr){

        Arrays.sort(arr);

        System.out.println("en buyuk eleman= " + arr[arr.length-1]);
        System.out.println("en kucuk eleman= " + arr[0]);

    }

}
