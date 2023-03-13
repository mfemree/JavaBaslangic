package Gun07;

public class _13_StringReplaceAll {
    public static void main(String[] args) {
        // ReplaceAll : replace gibi çalışır. farkı Kriter(regex) verilebiliyor
        // regex : regular expression / düzenli ifadeler
        // TODO (yapılacak) : ödev : regex olarak neler yazılabiliyor google dan araştırılacak
        String text="Merhaba Dünya123";

        System.out.println("text = " + text); // orjinal hali
        System.out.println("abn -> _  = " + text.replaceAll("[abn]","_"));
        // a ve b ve n'leri _ yap    ->  Merh___ Dü_y_123

        System.out.println("A-Z -> _  = " + text.replaceAll("[A-Z]","_"));
        // A dan Z ye kadar olan butun büyük harfleri _ yap  ->  _erhaba _ünya123

        System.out.println("0-9 -> _  = " + text.replaceAll("[0-9]",""));
        // 0 dan 9 a kadar olan butun rakamlari sil ve bosluk yap  ->  Merhaba Dünya

        System.out.println("0-9 dışındakile -> _  = " + text.replaceAll("[^0-9]",""));
        // 0 dan 9 a kadar olan rakamlar haric digerlerini sil ve  ->   123

        System.out.println("text.replaceAll(\"[a-z]\", \"\") = " + text.replaceAll("[a-z]", ""));
        // a dan z ye kadar olan butun harfleri sil ve bosluk yap -> M Dü123
        // turkce karakterler varsa onlari da yazacak

    }
}
