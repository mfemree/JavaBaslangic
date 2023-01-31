package Gun04;

public class _02_TipDonusumleri {
    public static void main(String[] args) {

        byte ogrNot1 = 98;
        byte ogrNot2 = 98;
        byte ogrNot3 = 100;
        byte ogrNot4 = 98;

        int toplam1 = ogrNot1; // byte i int in icine atabiliriz cunku byte < int oldugu icin veri kaybi olmaz.
                              // bu isleme ( GENISLETME - Widening Casting ) denir.
        int toplam2= ogrNot2;
        int toplam3= ogrNot3;
        int toplam4= ogrNot4;

        int ortalamaInt= ((ogrNot1+ogrNot2+ogrNot3+ogrNot4) / 4);


        ogrNot1 = (byte) toplam1;  // buyuk hafizaya ayrilmis bir alani kucuk hafiza ayrilmis alana atma islemi var
                                  // ama int i byte nin icine atmaya calisirsak veri kaybi olma ihtimali oldugu icin
                                 // bizden emin olmamizi ister ve sol tarafa (byte) yazmamizi ister.
                                 // bu isleme de ( DARALTMA - Narrow Casting ) denir.

        ogrNot2 = (byte) toplam2;
        ogrNot3 = (byte) toplam3;
        ogrNot4 = (byte) toplam4;

        byte ortalamaByte = (byte) ((ogrNot1 + ogrNot2 + ogrNot3 +ogrNot4) / 4 );


        System.out.println("ortalamaInt = " + toplam1 +" "+ toplam2 +" "+ toplam3 +" "+ toplam4);
        System.out.println("ortalamaByte = " + ogrNot1 +" "+ ogrNot2 +" "+ ogrNot3 +" "+ ogrNot4);

    }
}
