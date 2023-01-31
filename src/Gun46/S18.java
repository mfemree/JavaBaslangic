package Gun46;

import java.util.Arrays;

public class S18 {
    public static void main(String[] args) {

        String[][] chs = new String[5][2];

        System.out.println(Arrays.deepToString(chs));
        // [[null, null], [null, null], [null, null], [null, null], [null, null]]

        chs[0] = new String[2];
        chs[1] = new String[5];
        int i =97;

        System.out.println(Arrays.deepToString(chs));

        // [[null, null], [null, null, null, null, null], [null, null], [null, null], [null, null]]

        System.out.println("chs.length = " + chs.length);
        System.out.println("chs[0].length = " + chs[0].length);  //  0. satirin uzunlugu
        System.out.println("chs[1].length = " + chs[1].length);  //  1. satirin uzunlugu
        System.out.println("chs[2].length = " + chs[2].length);  //  2. satirin uzunlugu
        System.out.println("chs[3].length = " + chs[3].length);  //  3. satirin uzunlugu
        System.out.println("chs[4].length = " + chs[4].length);  //  4. satirin uzunlugu

        for (int j = 0; j < chs.length ; j++) {    //  5
            for ( int k=0; k< chs[k].length; k++ ){   //  5
                chs[j][k]="" +i;                   //  00 -> 44 // 0. satirin 4. elemani yok
                i++;
            }
        }

        for ( String [] ca: chs ) {
            for ( String c:ca ) {
                System.out.println(c + " ");
            }
            System.out.println();
        }
    }
}
