package ODEVLER.hw_11_12_2022_Metodlar;

import java.util.ArrayList;
import java.util.Arrays;

public class hw_11_12_2022_soru8 {
    public static void main(String[] args) {

//        8- `append adında bir method oluşturun.`
//           `Parametre olarak iki int array  oluşturun.`
//           ve ikinci array'in değerlerini ilk array'in sonuna ekleme sonucunu içeren yeni bir array döndürün.
//           Örneğin, ilk array {2, 4, 6}  ve ikinci array {1, 2, 3, 4, 5} elemanlarına sahip ise,
//           Bunu döndürmelidir:
//           {2, 4, 6, 1, 2, 3, 4, 5}.


        int [] arr1 = {2,4,6};
        int [] arr2 = {1,2,3,4,5 };

        append(arr1,arr2);

        // 2.yontem arrayliste cevirmeden
        // dizi yontemi ile yapma

        int[] dizi1={2,4,6};
        int[] dizi2={1,2,3,4,5};
        System.out.println(Arrays.toString(append2(dizi1,dizi2)));

    }

    public static ArrayList <Integer>  append ( int [] arr1 , int [] arr2 ){

        ArrayList <Integer> yeniList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            yeniList.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {

            yeniList.add(arr2[i]);
        }

        System.out.println(yeniList);
        return yeniList;
    }

    // arrayliste cevirmeden yapma
    // dizi ile yapma

    public static int[] append2 (int[] dizi1, int[] dizi2) {
        int[] diziBirlesik = new int[dizi1.length + dizi2.length];
        for (int i = 0; i < dizi1.length; i++) {
            diziBirlesik[i] = dizi1[i];
        }

        int index = 0;
        for (int i = dizi1.length; i < diziBirlesik.length; i++) {
            diziBirlesik[i] = dizi2[index];
            index++;
        }
        return diziBirlesik;
    }
}



