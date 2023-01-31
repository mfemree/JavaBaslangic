package Gun15;

public class _02_JavaNestedLoop {
    public static void main(String[] args) {

        // 2 lerin carpim tablosnu yapmistik
        // 5 lere kadar halini yapiniz.


        /*for (int iGenel = 1; iGenel <= 10; iGenel++)

            for (int i1 = 1; i1 <= 10; i1++)
                System.out.println("1x" + i1 + "=" + (1 * i1));

            for (int i2 = 1; i2 <= 10; i2++)
                System.out.println("2x" + i2 + "=" + (2 * i2));

            for (int i3 = 1; i3 <= 10; i3++)
                System.out.println("3x" + i3 + "=" + (3 * i3));

            for (int i4 = 1; i4 <= 10; i4++)
                System.out.println("4x" + i4 + "=" + (4 * i4));

            for (int i4 = 1; i4 <= 10; i4++)
                System.out.println("5x" + i4 + "=" + (5 * i4));*/


        // 2.yol

        for (int sayac = 1; sayac <= 5; sayac++) {

            for (int i = 1; i <= 10; i++) {
                System.out.println(sayac + "x" + i + "=" + (sayac * i));
            }

            System.out.println();
        }
    }
}