package Gun08;

public class _01_JavaAritmeticOperators {

    public static void main(String[] args) {

        int a=9;
        int b=5;

        System.out.println("toplama islemi= " );
        System.out.println("a+b sonucu= " + (a+b) + "\n"); // 14

        System.out.println("cikartma islemi; " );
        System.out.println("a-b sonucu= " + (a-b)+ "\n"); // 4

        System.out.println("carpma islemi; " );
        System.out.println("a*b sonucu= " + (a*b)+ "\n"); // 45

        System.out.println("bolme islemi; " );
        System.out.println("a/b sonucu= " + (a/b)+ "\n"); // 1
        // normalde sonuc 1.8 ama burda int olarak okudugu icin kusuratlar yazilmaz ve sonuc 1 cikar
        // kusuratlar da yazilsin istiyorsak sonucu (double) olarak yazdirmaliyiz.
        System.out.println("(double)a/b sonucu= " + (double)a/b);

        System.out.println("Modul Islemi");
        System.out.println("a % b sonucu = " + (a % b) ); // 9%5 = 4
        System.out.println("b % a sonucu = " + (b % a) ); // 9%5 = 5
        // kisa onemli not
        // soldaki sayi buyuk ise kalani al
        // soldaki sayi kucukse direkt soldakini al


    }
}
