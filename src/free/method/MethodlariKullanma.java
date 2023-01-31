package free.method;

import free.array.ArrayElementleriToplama;
import free.array.ArrayElementleriniArttirma;
import free.array.ArraydeElemanArama;
import free.array.KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class MethodlariKullanma {
    public static void main(String[] args) {



        int[] arr= {2,3,4};

        // verilen bir int arrayin elementlerini 2 arttirin
        arr= ArrayElementleriniArttirma.elementleri2Artir(arr);
        System.out.println(Arrays.toString(arr));    //  [4,5,6]

        // arr array inin elementlerini toplayip sonucunu yazdirin.
        System.out.println(ArrayElementleriToplama.pozitifElemanlariTopla(arr));

        // arr arrayinde 10 element var mi?
        ArraydeElemanArama.elemanAra(arr,10);

        // kullanicidan deger alarak bir array olusuturun
        int [] yeniArr= KullaniciyaArrayOlusturma.arrayOlustur();
        System.out.println(Arrays.toString(yeniArr));


    }
}
