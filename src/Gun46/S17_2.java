package Gun46;

import java.util.Arrays;

public class S17_2 {
    public static void main(String[] args) {

        int [][] arr = new int [2][4];  // sutun sayisi burda 4 ama asagida yeniden boyutlandirilmis.

        arr[0] = new int[] {1,3,5,7};   // indexi 0 olan 1. satir
        arr[1] = new int[] {1,3};       // indexi 1 olan 2. satir

        for ( int[] a  : arr ) {     // a burda satirlari temsil ediyor
            for ( int i   : a  ){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
