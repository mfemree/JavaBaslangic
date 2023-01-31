package free.array;

import java.util.Arrays;

public class MDA_Soru2 {
    public static void main(String[] args) {

        // verilen 2 katli bir array de ayni index e sahip elelmentleri toplayip
        // yeni olusturacagimiz tek katli arraye bu toplamlari atayalim
        // input:    int [][] arr= {{3,4,5}, {2,3,6,7}};
        // output;                   [5,7,11]

    int [][] arr = {{3,4,5}, {2,3,6,7}};

    // inner 2 array oalcagini ama bunlarin uzunluklarinin degisebilecegini kabul ettik

        int ortakIndexSayisi= arr[0].length < arr[1].length ? arr[0].length : arr[1].length;

        System.out.println(ortakIndexSayisi);  // gormek icin  // kisa olanin indexi


        int [] ortakIndexToplamlariArr = new int [ortakIndexSayisi];

        for (int i = 0; i <ortakIndexToplamlariArr.length; i++) {

            ortakIndexToplamlariArr[i] = arr[0][i] + arr[1][i];

        }

        System.out.println(Arrays.toString(ortakIndexToplamlariArr));

    }
}
