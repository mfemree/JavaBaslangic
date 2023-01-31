package Gun35._02_Polymorphism;

public class CiftlikMain {
    public static void main(String[] args) {

        Kopek kopek1 = new Kopek("karabas");
        kopek1.ses();   // havladi
        kopek1.kokladi();  // kokladi

        Kedi kedi1= new Kedi("kopuk");
        kedi1.ses();  // miyavladi
        kedi1.tirmaladi();  // tirmaladi

        kopekSesi(kopek1);  // havladi
        kediSesi(kedi1);    // miyavladi

        hayvanSesi(kopek1); // havladi sesi cikartir
        hayvanSesi(kedi1); // miyavladi sesi cikartir

        /**********************************************/

        Hayvan hayvan1 = new Hayvan("ordek");
        Hayvan hayvan2 = new Kopek("kangal");
        Hayvan hayvan3 = new Kedi("boncuk");

        System.out.println("-----------------------");
        hayvan1.ses(); // genel hayvan -> ses cikardi
        hayvan2.ses(); // hayvanlardan kopek -> havladi
        hayvan3.ses(); // hayvanlardan kedi -> miyavladi
        System.out.println("-----------------------");

        hayvan2.ses(); // kopek de olsa hayvan Referansi sebebiyle metodlar kisitli

        // peki bu hayvanı kopek formunu nasıl ortaya çıkartırım
        // tip dönüşümü acaba işime yarar mı?

        ((Kopek)hayvan2).kokladi();
        // artık diğer metodları kullanabilirim.
        // ((int)Math.random()) casting burdaki gibi, tip dönüşümü

        // Setlerden HasSet
        // Maplerden HashMAp
        // Listlerden ArrayList

//        Polymorphism
//        çok formluluk - Çok çeşitlilik
//        şizofren bir konu
//        Bir NESNE istenildiğinde, aynı zamanda extend edildiği tür gibi davranmasına
//        ve bu şekilde kullanılabilmesine Polymorphism denir.

        // öğretmenin okulda "fizik öğretmeniyim" demesi,
        // mahallede "öğretmenim" demesi gibi.

    }

    public static void kopekSesi ( Kopek kopek){ kopek.ses(); }
    public static void kediSesi ( Kedi kedi){
        kedi.ses();
    }
    public static void hayvanSesi ( Hayvan hayvan ){
        // buraya hem kedi gelebiliyor, hem de kopek
        hayvan.ses();

        if ( hayvan instanceof Kopek)  // eger kopek hayvanin bir ornegi ise/ kopyasi ise
                                       // ya da hayvan aslinda Kopek mi
                                       // yani normalde bilmiyoruz nerden geldigini
            ((Kopek)hayvan).kokladi();

        if ( hayvan instanceof Kedi )
            ((Kedi)hayvan).tirmaladi();

            // bir class in kimden oldugunu/nerden geldigini bulma yontemi

    }

    // kopek ve kedi burda hayvan kiligina girmis olsa bile kopek kopekligini, kedi kediligini yapti.
    // kopek "havladi"
    // kedi "miyavladi"
    // cunku once parent classa gitse bile, child classlardaki methotlari kontrol eder
    // eger oralarda override edildiyse onu uygular
    // override edilmemisse parent class takini uygular.

}
