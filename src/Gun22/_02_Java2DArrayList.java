package Gun22;

import java.util.ArrayList;

public class _02_Java2DArrayList {
    public static void main(String[] args) {

        int sayi = 5;                                   // tek bir rakam tutabilen bir değişken
        int[] dizi = new int[20];                       // 20 adet sayı saklayabilen bir değişken, uzunluğu sabit
        int[][] tablo=new int[20][2];                   // 20x2 lik sayı saklayabilen değişken, sabit uzunluklu

        ArrayList<Integer> liste=new ArrayList<>();     // istenildiği kadar sayı eklenebilen, uzunluğu değişken
        /****************************/

        // bir sınıf bu sınıf da 20 kişi var ve bunların 3 dersi olsun.Öğrencilerin bu 3 derse ait notlarını
        // nasıl bir değişkende saklayabilirim.

        ArrayList<Integer> matNotlari= new ArrayList<>();
        ArrayList<Integer> fiizkNotlari= new ArrayList<>();
        ArrayList<Integer> kimyaNotlari= new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);

        fiizkNotlari.add(30);
        fiizkNotlari.add(40);

        kimyaNotlari.add(70);
        kimyaNotlari.add(80);


        // arraylist in ArrayList ini nasil yaparim?

        ArrayList<   ArrayList<Integer>   > notlarListesi= new ArrayList<>();   // Listlerin listesi

        notlarListesi.add(matNotlari);
        notlarListesi.add(fiizkNotlari);
        notlarListesi.add(kimyaNotlari);

        notlarListesi.get(0);                             //  matNotlari
        int matBirNot=notlarListesi.get(0).get(0);        //  mat notlarinin ilkini alma

        System.out.println("notlarListesi = " + notlarListesi.get(0));   // mat notlari
        System.out.println("notlarListesi = " + notlarListesi.get(1));   // fizik notlari
        System.out.println("notlarListesi = " + notlarListesi.get(2));   // kimya notlari


        // yukaridakileri bir for dongusu ile yapma

        for (int i = 0; i <notlarListesi.size() ; i++) {     //  0,1,2
            System.out.println("notlarListesi.get(" +i+ ") = " + notlarListesi.get(i));
        }

        /////////////// satir ve sutun yazdirma ///////////////////

        for (int i = 0; i<notlarListesi.size(); i++) {                                   //  i=satirlari, j=sutunlari


            for (int j = 0; j<notlarListesi.get(i).get(j); j++) {                        //  notlar[i].lenght gibi
                System.out.println("notlarListesi = " + notlarListesi.get(i).get(j));    //  notlar [i][j] gibi
            }

            System.out.println();
        }





    }
}
