package Gun02;

public class _05_EscapeCharacters {

    public static void main(String[] args) {

        //  \n -> yeni satır açıyor, alt satıra geçiyor
        //  \t -> sanki tab tuşuna basılmış gibi boşluk veriyor
        //  \b -> back-space bir karakter geri siler
        //  \" -> " tırnak yazmak için kullanılıyor
        //  \ -> \ yazılacak ekrana
        //  \r -> satır başına geri gelir ve onceki satırı silip tekrar baştan yazar.

        System.out.println("MerhabaDunya");    // MerhabaDunya
        System.out.println("Merhaba\nDunya");  // Merhaba alt satira gecer Dunya
        System.out.println("Merhaba\bDunya");  // Merhab ( bir karakter geri siler ) Dunya
        System.out.println("Merhaba\"Dunya");  // Merhaba"Dunya
        System.out.println("Merhaba\\Dunya");  // Merhaba\Dunya
        System.out.println("Merhaba\rDunya");  // Dunya

        System.out.println("Mustafa Emre US =\t\"Ne zaman baba ne zaman\" dedi.\n");
        System.out.println("Mustafa Emre US =  \b\"Ne zaman baba ne zaman\" dedi.\n");
        System.out.println("eger sarisin, renkli gozlu bir kiz bulabilir isem");
        System.out.println("45\\5=dokuz eder.");
        System.out.println("bir daha mi gelicez dunyaya\r\n\ndevamini getirin.");


    }
}
