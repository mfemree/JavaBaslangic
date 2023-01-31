package Gun46;

public class S71 {
    public static void main(String[] args) {

        int [][] arr = new int [2][4];
        arr[0]= new int[]{1,3,5,7};
        arr[1]= new int[]{1,3};

        // 2 boyutlu dizilerin eleman sayisi diye inceledigimizde satir sayisi karsimiza cikar
        System.out.println("arr.length = " + arr.length);         // satir sayisini verir      // 2
        System.out.println("arr[0].length = " + arr[0].length);   // 0. satirin eleman sayisi = 4 u verir.
        System.out.println("arr[1].length = " + arr[1].length);   // 1. satirin eleman sayisi = 2 yi verir


        for ( int[]a : arr ) {   // a burada arr nin elemanlarini, yani satirlarini temsil ediyor.

            for (int i = 0; i < arr.length; i++) {
                System.out.print(a[i]+ " ");  // a.lenght : satirin butun elemanlarini yazmasi icin
            }
            System.out.println();
        }



    }
}
