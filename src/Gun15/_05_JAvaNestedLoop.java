package Gun15;

public class _05_JAvaNestedLoop {
    public static void main(String[] args) {

        // *
        // **
        // ***
        // ****
        // *****
        // *****
        // ****
        // ***
        // **
        // *

        for (int satir = 1; satir <= 5; satir++) {

            for (int i = 0; i < satir; i++)
                System.out.print("*");

                System.out.println();
            }

            for (int satir = 5; satir > 0; satir--) {

                                for (int j = 0; j < satir; j++)
                    // ya da    for (int j = 0; j < 6-satir; j++)
                    System.out.print("*");

                System.out.println();

            }
        }
    }