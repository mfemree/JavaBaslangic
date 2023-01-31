package Gun15;

public class _04_JavaNestedLoop {
    public static void main(String[] args) {

        // asagidaki goruntuyu veren programi yaziniz

        // *****
        // ****
        // ***
        // **
        // *

        for (int i = 0; i <= 5; i++) {

            for (int j = 5; j > i; j--)
                System.out.print("*");

            System.out.println();

        }

        //2.yontem

        for (int i = 5; i > 0; i--) {

            for (int j = 0; j < i; j++)
                System.out.print("*");

            System.out.println();


        }
    }
}