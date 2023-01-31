package free;

public class MDA_2D_Array_ParantezliDefaultDegeri {
    public static void main(String[] args) {

                int [][ ] arr = new int [3][3];

                System.out.print("Dizi: [");

                for (int i = 0; i < arr.length; i++) {

                    System.out.print("[");

                    for (int j = 0; j < arr[i].length; j++) {
                        System.out.print(arr[i][j] + ",");
                    }
                    System.out.print("\b],");
                }
                System.out.println("\b]");

    }
}
