package Gun19;

public class _02_Java2DArrays {
    public static void main(String[] args) {

        int[][] tablo = {
                {4, 55},
                {45, 6, 77},
                {4, 2, 999, 45, 56, 66},
                {42, 12, 9},
                {4},
        };

        System.out.println("satir miktari= " + tablo.length);
        System.out.println("0. satirdaki sutun sayisi= " + tablo[0].length);
        System.out.println("1. satirdaki sutun sayisi= " + tablo[1].length);
        System.out.println("2. satirdaki sutun sayisi= " + tablo[2].length);
        System.out.println("3. satirdaki sutun sayisi= " + tablo[3].length);
        System.out.println("4. satirdaki sutun sayisi= " + tablo[4].length);

        // yazdirma bolumu

        for (int i = 0; i < tablo.length ; i++) {

            for (int j = 0; j < tablo[i].length ; j++) {
                System.out.print(tablo[i][j] + "\t");
            }
            System.out.println();

        }


    }
}
