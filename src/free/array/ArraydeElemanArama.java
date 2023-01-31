package free.array;

public class ArraydeElemanArama {
    public static void main(String[] args) {


        // verilen bir arrayde istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yazdiran bir method olusturub.


        int[] arr= {1,2,4,5,3,6,7,4,2,3,5,1,3,2 };

        int arananEleman=2;

        elemanAra(arr, arananEleman);

    }

    public static void elemanAra ( int[] arr, int aranananEleman ){

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            if ( arr[i] == aranananEleman )
                sayac++;

        }

        if ( sayac==0 ) {
            System.out.println("aranan sayi arrayde yok");
        }else{
            System.out.println("aranan " + aranananEleman + " sayisi, arrayde " + sayac + " kere kullanilmistir." );



        }
    }
}
