package Gun46;

import java.util.Arrays;

public class S17 {
    public static void main(String[] args) {

        int [][] arr = new int [2][4];  // 2 satirli 4 sutunlu bir array
                                        // sutun sayisi burda 4 ama asagida yeniden boyutlandirilmis.

        System.out.println("Arrays.toString(arr) = " + Arrays.deepToString(arr)); // [[0, 0, 0, 0], [0, 0, 0, 0]]

        arr[0] = new int[] {1,3,5,7};  // indexi 0 olan 1. satir
        arr[1] = new int[] {1,3};      //  indexi 1 olan 2. satir


        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }
    }
}
