package Gun07;

public class _09_StringtoLowerCase {
    public static void main(String[] args) {

        // toLowerCase: stringi kucuk harfe cevirir.

        String text= "Merhaba Dunya";

        System.out.println("orjinal hali text = " + text); // Merhaba Dunya
        System.out.println("text.toLowerCase() = " + text.toLowerCase()); // merhaba dunya

        System.out.println("m ile veya ME ile basliyor mu= " + text.toLowerCase().startsWith("me"));

        System.out.println("text = " + text); // kendisine atama yapmazsak kendisi degismez.
        text= text.toLowerCase();

    }
}
