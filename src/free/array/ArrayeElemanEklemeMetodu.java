package free.array;

import java.util.Arrays;

public class ArrayeElemanEklemeMetodu {
    public static void main(String[] args) {


        // verilen bir int arraye istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olustuturun


        int[] abc= {3,5,8,9,10,11};
        int eklenecekSayi=3;

        abc= arrayeElemanEkle(abc,eklenecekSayi);

        System.out.println(Arrays.toString(abc));

    }

    public static int [] arrayeElemanEkle ( int[] eklenecekArr, int eklenecekSayi){


        int [] yeniArr = new int[eklenecekArr.length+1];

        for (int i = 0; i <eklenecekArr.length ; i++) {

            yeniArr[i] = eklenecekArr[i];

        }

            yeniArr[yeniArr.length-1]=eklenecekSayi;
            return yeniArr;
    }


}
