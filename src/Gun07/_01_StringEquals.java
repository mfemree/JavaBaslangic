package Gun07;

public class _01_StringEquals {
    public static void main(String[] args) {

        // equals: 2 stringin birbirine esit olup olmadigini kontrol eder.
        // sonuc boolean

        String s1= "Merhaba";
        String s2= "MERHABA";

        boolean esitMi= s1.equals(s2);               // s1 esit mi s2 ye?
        System.out.println("esit mi= " + esitMi );

        System.out.println("s1.equals(s2) = " + s1.equals(s2)); // Burda Merhaba ile MERHABA yi karsilastiriyor
        System.out.println("s1.equals(Merhaba) = " + s1.equals("Merhaba")); // Burda Merhaba ile Merhaba karsilastiriliyor


    }
}
