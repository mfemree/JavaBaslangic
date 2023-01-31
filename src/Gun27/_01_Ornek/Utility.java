package Gun27._01_Ornek;

public class Utility {

    public String getString ( int sayi){

        return String.valueOf(sayi);
    }


    public static String getString2 ( int sayi ) {

        return  String.valueOf(sayi);
    }

}

// STATIC lan metodlar SINIF a yani CLASS
// yani TIP e ait
// STATIC oolmayanlar kime ait? Nesneye ait.
// Bu sebeple mutlaka oluşturulmaları gerekiyor
// Nesneyi ilgilendiren metdoları normal yazıyoruz.
// Nesneyi ilgilendirmeyen, Tipi ilgilendiren metodları STATIC ile yazıyoruz.
// Kemdi basina calisacabilecek/kullanilabilecek kodlara static yazmiyoruz