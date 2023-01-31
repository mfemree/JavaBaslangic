package free.array;

import java.util.Arrays;

public class ArrayElemanlariSagaKaydirma {
    public static void main(String[] args) {


        // verilen bir arraydeki tum elementleri bir saga kaydirip
        // sondaki elementi basa tasiyacak bir method olustuurn, arrayi yeni haliyle kaydedin

        int [] arr = { 4,5,6,7 };

        arr= sagaKaydir(arr);

        System.out.println("kaydirilmis hali= " + Arrays.toString(arr));

    }

    public static int [] sagaKaydir ( int [] arr ){


        int temp = arr[arr.length-1];    //  son elementi bos kovaya koymus olduk

        for (int i =arr.length-2; i >=0 ; i--) {

            arr[i+1]= arr[i];
        }
        arr [0] = temp;

        return arr;
    }
}
