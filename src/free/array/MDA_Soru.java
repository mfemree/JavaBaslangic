package free.array;

public class MDA_Soru {
    public static void main(String[] args) {


        // verilen 2 katli arrayde
        // her bir inner arrayin son elemenlerinin toplamini yazdiran bir method olusuturun

        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};

        sonElementleriToplam(arr);

    }

    public static void sonElementleriToplam(int[][] arr) {

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            toplam += arr[i][arr[i].length - 1];

        }
        System.out.println(" son elementlerin toplami = " + toplam);
    }

}
