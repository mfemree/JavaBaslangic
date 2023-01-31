package Gun19;

public class _01_Java2DArrays {
    public static void main(String[] args) {

        int [][] tablo= {
                { 3,   4, 55},
                {234, 22, 33 }
        };

        // 2 satir, 3 sutun

        System.out.println("satir uzunlugu= " + tablo.length);
        System.out.println("0. satirin sutun uzunlug= " + tablo[0].length ) ;     // 3, sutun uzunlugu
        System.out.println("1. satirin sutun uzunlug= " + tablo[1].length ) ;     // 3, sutun uzunlugu


        for (int i = 0; i < tablo.length ; i++) {   //  satir sayisi


            // ilgili satirdaki sutun sayisi

            for (int j = 0; j <tablo[i].length ; j++) {
                System.out.print(tablo[i][j] + "\t");

            }

            System.out.println();
        }

    }
}
