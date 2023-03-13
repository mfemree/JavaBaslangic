package Gun07;

public class _011_StringReplace {

    public static void main(String[] args) {

        // replace: bir string icindeki karakter(leri) bulup verilenle degistirir.

        String text= "Merhaba Dunya";

        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a" , "e")); // Merhebe Dunye
        System.out.println("text.replace(ba,de) = " + text.replace("ba" , "de")); // Merhede Dunya
        System.out.println("text.replace(Dunya,Java) = " + text.replace("Dunya" , "Java")); // Merhebe Java
        System.out.println("text.replace(a,'') = " + text.replace("a" , "")); // a lar silindi. bosluk oldu
                                                                                              // Merhb Duny

        System.out.println(text + "merhaba\raaaa");  // geri vites yapar ve komuttan onceki herseyi siler
                                                     // ve kendinsen sonra gelenelri satir basindan itivaren tekrar yazar

    }
}
