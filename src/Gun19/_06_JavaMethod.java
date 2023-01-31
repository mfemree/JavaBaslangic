package Gun19;

public class _06_JavaMethod {
    public static void main(String[] args) {

        merhabaYaz();

        merhabaYazIsme("ismet");

        cokMerhabaYaz(5);

        adedinceMerhabaYazIsme(2, "Mustafa Emre");

    }

    public static void merhabaYaz() {

        System.out.println("Merhaba Dunya");
        System.out.println("Merhaba Dunya");
    }

    public static void merhabaYazIsme (String isim ) {

            System.out.println("Merhaba " + isim );

    }

    public static void cokMerhabaYaz ( int miktar ){

        for (int i = 0; i < miktar; i++) {

            System.out.println("Merhaba");

        }

    }

    public static void adedinceMerhabaYazIsme ( Integer sayi, String isim ) {

        for (int i = 0; i < sayi; i++)
            System.out.println("Merhaba " + isim );

    }


}
