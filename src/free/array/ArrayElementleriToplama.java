package free.array;

public class ArrayElementleriToplama {
    public static void main(String[] args) {

        // verilen bir arraydeki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yaziniz


        int [] arr= {3, -3, 5, -7, -6, 1, -2};

        System.out.println("pozitifElemanlariTopla(arr) = " + pozitifElemanlariTopla(arr));      //  9

    }

    public static int pozitifElemanlariTopla ( int [] arr ){

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] > 0 )
                toplam += arr[i];
        }

        return toplam;
    }
}
