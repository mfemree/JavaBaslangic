package free.array;

import java.util.Arrays;

public class Ornek {
    public static void main(String[] args) {

        int[] dizi1 = new int[] {2, 5, 6, 7};  // normalde boyle yazilir

        int[] dizi = {2, 5, 6, 7};             // ama bu sekilde 2 kisimda da yapilabilinir.
        dizi = new int[]{1, 2, 3, 4, 5, 6, 7, 77};

        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi)); //  [1, 2, 3, 4, 5, 6, 7, 77]    }
    }
}
