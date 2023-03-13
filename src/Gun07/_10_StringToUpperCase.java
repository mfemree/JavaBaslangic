package Gun07;

public class _10_StringToUpperCase {
    public static void main(String[] args) {

        // ToUpperCase: string buyuk harfe cevirir

        String text= "Merhaba Dunya";

        System.out.println("orjinal hali = " + text);                       //  Merhaba Dunya
        System.out.println("text.toUpperCase() = " + text.toUpperCase());   //  MERHABA DUNYA

        System.out.println("me veya ME ile basliyor mu? = " + text.toUpperCase().startsWith("ME")); // true

        System.out.println("text = " + text);
    }
}
