package free.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class C13_MD_ArrayList {
    public static void main(String[] args) {

        // Soru 2 :
        // Kullanıcıdan istediği bir dersin  nosunu alarak (0-Mat, 1-Fiz, 2-Kim)
        // sadece istedği derse ait notları bir metodda yazdırınız.

        ArrayList<Integer> matNotlari=new ArrayList<>();
        ArrayList<Integer> fizNotlari=new ArrayList<>();
        ArrayList<Integer> kimNotlari=new ArrayList<>();

        matNotlari.add(50);
        matNotlari.add(70);
        matNotlari.add(80);

        fizNotlari.add(30);
        fizNotlari.add(40);

        kimNotlari.add(60);
        kimNotlari.add(70);
        kimNotlari.add(80);
        kimNotlari.add(90);

        // ArrayList in ArrayList i ni nasıl yaparım
        ArrayList<  ArrayList<Integer>   > notlarListesi=new ArrayList<>(); // Listlerin listesi
        notlarListesi.add(matNotlari);
        notlarListesi.add(fizNotlari);
        notlarListesi.add(kimNotlari);

        Scanner scan = new Scanner(System.in);
        System.out.println("Notlarini gormek itediginiz dersi seciniz");
        System.out.print("Matemetik icin 0'e, \nFizik icin 1'ye, \nKimya icin 2'e basiniz: " );
        int secilenDersNo = scan.nextInt();


        dersNotlariniYazdir(notlarListesi, secilenDersNo);

        // Soru 3 :
        // C13 de verilen derse ait not otlamasını ve geçen sayısını bir metodda yazdırınız.

        dersOrtVeGecenMikBul(notlarListesi, secilenDersNo);


        }

        public static void dersNotlariniYazdir(  ArrayList<  ArrayList<Integer>> notlarListesi, int secilenDersNo) {


            for (int i = 0; i < notlarListesi.get(secilenDersNo).size(); i++) {

                System.out.println(notlarListesi.get(secilenDersNo).get(i) + "\t");

            }

        }


    public static void dersOrtVeGecenMikBul(ArrayList< ArrayList<Integer> > notlarListesi, int dersNo){

        int toplam=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            toplam+=notlarListesi.get(dersNo).get(i);
        }

        int ort= toplam/notlarListesi.get(dersNo).size();

        int gecenMik=0;
        for (int i = 0; i < notlarListesi.get(dersNo).size(); i++) {
            if (notlarListesi.get(dersNo).get(i)>= ort  )
                gecenMik++;
        }

        System.out.println("ort = " + ort);
        System.out.println("gecenMik = " + gecenMik);
    }

}

