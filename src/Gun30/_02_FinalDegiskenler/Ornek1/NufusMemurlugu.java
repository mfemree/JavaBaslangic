package Gun30._02_FinalDegiskenler.Ornek1;

public class NufusMemurlugu {
    public static void main(String[] args) {

        Vatandas v1= new Vatandas("ismet");
        Vatandas v2= new Vatandas("nazmiye");
        Vatandas v3= new Vatandas("nurhayat");


        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v3 = " + v3);


        // v1.tcNo= 456;
        // final degiskenlerine sadece 1 kez veri atanabilir.
        // o da ya tanimlanirken, ya da Constructor da.


        final double pi = 3.14;
        // pi=5;

    }
}

// final: deger atandiktan sonra degistirilmeyi engelliyor
//         bu sebeple, hem sabit değerler için, hem de sonradan
//         değişmesini istemediğimiz değerler için kullanılır

// static sayac ise: her yeni nesne olusturuuldugunda yeni artan deger almasini sagliyor.