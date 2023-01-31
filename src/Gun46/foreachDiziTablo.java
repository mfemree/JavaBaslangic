package Gun46;

public class foreachDiziTablo {
    public static void main(String[] args) {

        int[] dizi = new int[]{1, 2, 3, 4, 6};

        int[] dizi1 = {1, 2, 3, 4, 5};

        int[] dizi2 = new int[3];

        System.out.println("dizi1.length = " + dizi1.length);  // 5

        for (int i = 0; i <dizi1.length ; i++) {
            System.out.print(dizi1[i] + " ");
        }
        System.out.println();
        // sira garanti degil, normalde siradan verir.

        for ( int eleman: dizi1  ){
            System.out.println(eleman + " ");
        }


        int[][] tablo1 = new int[2][3];

        System.out.println("tablo1.length = " + tablo1.length);       // 2
        System.out.println("tablo1[0].length = " + tablo1[0].length); // 3

        tablo1[0][0]=4; tablo1[0][1]=5; tablo1[0][2]=6;
        tablo1[1][0]=7; tablo1[1][1]=8; tablo1[1][2]=9;

        int[][] tablo2 = new int[][]{ {1,3,4}, {56,7,8}};

        int[][] tablo3 = {{1,3,6}, {56,7,8} }; // new int[][] yazmadan da ilk tanimlama aninda elemanlarini yazabilriiz

        tablo3[0] = new int[]{2,3,4,5,6};      // her bir satiri ayri ayri yeniden tanimlayabilriiz
        tablo3[1] = new int[]{2,3};
        int tablo4 [][] = new int[2][3];       // koseli parantezler degiskenin adinda da olabilir.


        for (int[] satir: tablo3) {  // tablo3 un elemanlari satirlardan olusuyor ve her biri tek boyutlu dizi

            for ( int eleman : satir ) {
                System.out.print(eleman + " ");
            }
            System.out.println();
        }

    }
}
