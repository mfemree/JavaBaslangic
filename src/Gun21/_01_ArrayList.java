package Gun21;

import java.util.ArrayList;

public class _01_ArrayList {
    public static void main(String[] args) {

        // dizi, array: boyut sayisi belli, sonradan degistirilemez
        int [] dizi= new int[5];  // Array 5 elelmali ve degistirilemez


        // boyutu dinamik olsun, eleman ekledikce uzasin, sildikce kisasin
        // array list: boyutu basta vermene gerek yok
        // boyutu baslangicta 0
        // eleman ekledikce artar, sildikce kisalir.


        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Double> doubleList = new ArrayList<>();

        ArrayList<String> isimler= new ArrayList<>();
        System.out.println("isimler= " + isimler);      //  isimler= []

        isimler.add("Ahmet");  // uzunluk 1
        isimler.add("Metin");  // uzunluk 2
        isimler.add("Hacer");  // uzunluk 3
        isimler.add("Aynur");  // uzunluk 4

        System.out.println("isimler= " + isimler);                  //  [Ahmet, Metin, Hacer, Aynur]
        System.out.println("isimler.size()= " + isimler.size());    //  4

        isimler.add( 1, "Muhammed");             // verilen indexe ekliyor, digerleri 1 kayiyor sona dogru
        System.out.println("isimler= " + isimler);            //  [Ahmet, Muhammed, Metin, Hacer, Aynur]


        isimler.set(1, "zafer");                              // verilen indexteki elemani degistirir
                                                              // yani 1. indexteki Muhammedi Zafer yapacak

        System.out.println("isimler= " + isimler);            //  [Ahmet, zafer, Metin, Hacer, Aynur]

        boolean varMi= isimler.contains("Metin");             // "metin" var mi. true/false
        System.out.println("isimler= " + varMi);              //  true

        isimler.remove("Metin"); // degere gore siler     // [Ahmet, zafer, Hacer, Aynur]
        System.out.println("isimler = " + isimler);

        isimler.remove(1);                             // rakam verildiginde index olarak kabul eder ve ona gore siler
        System.out.println("isimler = " + isimler);          // [Ahmet, Hacer, Aynur]

        int indexOfAynur= isimler.indexOf("Aynur");
        System.out.println("indexOfAynur = " + indexOfAynur);  //  indexOfAynur = 2

        String ilkEleman= isimler.get(0);                      // yazilan indexin degerini verir.
        System.out.println("ilkEleman = " + ilkEleman);        // ilkEleman = Ahmet

        isimler.clear();                                        // her seyi siler
        System.out.println("isimler = " + isimler);             //  isimler = []





    }
}
