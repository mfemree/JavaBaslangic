package Gun27._03_Ornek;

import java.util.ArrayList;

public class Student {

    String name;
    int maxSaat;
    ArrayList<Lesson> dersleri = new ArrayList<>();

    public void dersEkle ( Lesson ders ){

        int suAnToplamSaat=0;
        for ( Lesson d: dersleri  )
            suAnToplamSaat += d.saat;

        if ( suAnToplamSaat+ ders.saat <= maxSaat)
            dersleri.add(ders);
        else
            System.out.println(ders.name + ": Kredi siniri asildi.yeni ders eklenememektedir");

    }

    public void dersleriYazdir(){

        System.out.println("\n*** Transkript ***");
        System.out.println("Sayin " + name);
        System.out.println("Aldiginiz dersler asagidadir:");
        for ( Lesson d : dersleri  )
            System.out.println(d.name + " " + d.saat);

    }

    public static void universiteKurallari(){

        System.out.println("Kural 1: Caysiz ve uzumsuz derse gelme" );
        System.out.println("Kural 2: Uykunu mutlaka al, saglik en onemlisi");
        System.out.println("Kural 3: Her zmaan dinc ve dinamik ol ve pozitif ol");
        System.out.println("Kural 4: En basta verdigin sozu unutma, su an kamptasin");
        System.out.println("Kural 5: ");


    }

}
