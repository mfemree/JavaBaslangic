package free.array;

import java.util.Arrays;

public class ArrayElementleriniArttirma {
    public static void main(String[] args) {

        // verilen bir int arrayin tum elelmanlarini 2 arttirip bize donduren bir method olusturun.
        // eski arrayi yeni haliyle kaydedin
        // ve bunu method haline getirin


        int [] arr= {2,4,6,8};

        System.out.println("normal hali= " + Arrays.toString(arr));       // [2, 4, 6, 8]

        for (int i = 0; i <arr.length; i++) {

            arr[i]= arr[i] +2;

        }

        System.out.println("2 arttirilmis hali= " + Arrays.toString(arr));     // [4, 6, 8, 10]

        arr = elementleri2Artir(arr);                     // method seklinde yazdiriyoruz
        System.out.println(Arrays.toString(arr));         // 2 arttirilmis sekli


    }

    public static int [] elementleri2Artir( int[] arr  ){

        for (int i = 0; i < arr.length; i++) {

            arr[i] = arr[i]+2;
        }

        return arr;
    }
}
