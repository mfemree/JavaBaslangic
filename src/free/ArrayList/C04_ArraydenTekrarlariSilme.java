package free.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {


        // verilen bir arraydeki tekrar eden sayilari bir kere olacak sekilde array i duzenleyin


        int [] arr= {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu arrayle yapmak cok zor
        // bunun yerine bu arrayin elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list e atalim

        ArrayList<Integer> tekrarsizListe = new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {

            if (!tekrarsizListe.contains(arr[i])) {
                tekrarsizListe.add(arr[i]);
            }
        }

        System.out.println("tekrarsizListe = " + tekrarsizListe);

        // en son o list deki elementleri iceren bir array olusturup
        // yeni array i eski array e deger olarak atayalim

        arr = new int[tekrarsizListe.size()];  //  [0, 0, 0, 0, 0 ]


        for (int i = 0; i < arr.length; i++) {

            arr[i] = tekrarsizListe.get(i);

        }
        // array istenen hale geldi
        System.out.println("arrayin tekrarsiz hali= " + Arrays.toString(arr));

    }

}
