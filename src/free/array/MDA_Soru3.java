package free.array;

import java.util.Arrays;

public class MDA_Soru3 {
    public static void main(String[] args) {

        // verilen 2 katli arrayde
        // her bir ic arraydeki elementleri toplayip
        // yeni olustuuracagimiz tek katli bir arreye bu toplamlari atayin
        // input:        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        // output:                      [10,3,12,10,9 ]


        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        int [] output = new int[arr.length];

        int innerArrToplam=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {

                innerArrToplam += arr[i][j];

            }
            output[i]= innerArrToplam;

        }
        System.out.println(Arrays.toString(output));

    }
}
