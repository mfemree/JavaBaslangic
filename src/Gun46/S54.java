package Gun46;

public class S54 {
    public static void main(String[] args) {

        String[][] arr = {{"A", "B", "C"}, {"D", "E"}};

        System.out.println("arr.length = " + arr.length);
        System.out.println("arr[0].length = " + arr[0].length);
        System.out.println("arr[1].length = " + arr[1].length);

        System.out.println("arr[0][0] = " + arr[0][0]);
        System.out.println("arr[0][1] = " + arr[0][1]);
        System.out.println("arr[0][3] = " + arr[0][2]);
        System.out.println("arr[1][0] = " + arr[1][0]);
        System.out.println("arr[1][1] = " + arr[1][1]);

        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {
                System.out.println("arr[i][j] = " + arr[i][j] + " ");    // ABDE

                if (arr[i][j].equals("B"))
                    break;
            }
        }
        // continue; //  continue out side of loop, so -> Compilation fails
        // kendisinden sonra calisan kodu pas gecirir.
        // kendiisnden sonra kod yoksa "compilation fails" ( derleme başarısız ) verir.

    }
}
