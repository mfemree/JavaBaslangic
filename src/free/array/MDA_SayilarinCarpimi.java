package free.array;

public class MDA_SayilarinCarpimi {
    public static void main(String[] args) {

        // verilen iki katli bir arrayde bulunan tum sayilarin
        // carpimini bize donduren bir method olusturun.

        int[][] arr= {{5,7}, {5,8,9},{0,1}};

        System.out.println(elementlerinCarpimi(arr));   //  0


    }

    public static int elementlerinCarpimi ( int [][] arr ){

        int carpim=1;

        for (int i = 0; i <arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {

                carpim*= arr[i][j];
            }

        }
      return carpim;
    }

}
