package free.array;

import java.util.Arrays;

public class MDA_MultiDimensionalArray {
    public static void main(String[] args) {

        int [][] arr= {{4,3,1}, {1,2}, {5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length);      // 5

        System.out.println(arr[2].length);   // 3

        System.out.println(arr[1]);                        // direkt yazdirmaz, java referansini yazdirir.
        System.out.println(Arrays.toString(arr[1]));       // [1, 2]

        // tum arrayi ayzdirmak istersek

        System.out.println(Arrays.deepToString(arr));      // [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

       // System.out.println(arr[3][0]);    // ArrayIndexOutOfBoundsException

        System.out.println(arr[3].length);  // 0


    }
}
