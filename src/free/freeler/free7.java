package free.freeler;

public class free7 {
    public static void main(String[] args) {

      /*  String s1= "Merhaba";
        String s2= "MERHABA";

        boolean esitMi= s1.equals(s2);

        System.out.println("Esit Mi: " + esitMi);
        System.out.println("Esit mi: " + s1.equals(s2));

        ---------------------------------------------------------------------------------
*/
       /* String s1= "Merhaba";
        String s2= "MERHABA";

        boolean esitMi= s1.equalsIgnoreCase(s2);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        ---------------------------------------------------------------------------------*/

        /*String s1= "Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty());

        String s2= " ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty());

        ---------------------------------------------------------------------------------*/

         /*  //       0123456
        String s1= "Merhaba";

        System.out.println("s1.indexOf= " + s1.indexOf("M"));  // 0
        System.out.println("s1.lastimdex0f = " + s1.lastIndexOf("a")); // 6

        // sadece arama yonu degisiyor. indexOf bastan, lastIndexOf sondan aramaya baslar.

        ---------------------------------------------------------------------------------*/

      /*  String s1= "Merhaba arkadaslar";

        String parca1= s1.substring(3,9); // 3 nolu indexten 9 nolu indexe kadar olanlari al ( 3 dahil )
        System.out.println(s1.substring(3,9));

        String parca2= s1.substring(8,15);
        System.out.println("parca2 = " + parca2);
        System.out.println(s1.substring(8,15));

        String parca3= s1.substring(0); // 0 dan sonrasini yazdir ( yani hepsini )
        String parca4= s1.substring(8); // 8 den sonrasini yazdir.

        System.out.println(parca3);
        System.out.println(parca4);


        ---------------------------------------------------------------------------------
*/
        // girilen bir ad soyadi ayri ayri yazdiriniz

        /*Scanner oku= new Scanner(System.in);

        System.out.print("adiniz ve soyadiniz yaziniz: ");
        String adSoyad= oku.nextLine();

        int boslukIndex= adSoyad.indexOf(" ");

        System.out.println("Adiniz= " + adSoyad.substring(0, boslukIndex));
        System.out.println("Soyadiniz= " + adSoyad.substring(boslukIndex+1));

        ---------------------------------------------------------------------------------*/

       /* String text= "HLC Teknoloji";

       // verilen karakter "...." ile basliyor mu?

        System.out.println(text.startsWith("HC")); // false
        System.out.println(text.startsWith("te")); // false
        System.out.println(text.startsWith("H")); // true
        System.out.println(text.startsWith("h")); // false
        System.out.println(text.startsWith("HL")); // true

        ---------------------------------------------------------------------------------*/

       /* // verilen karakter "...." ile bitiyor mu?

        String text= "Mustafa Emre";

        System.out.println(text.endsWith("a")); // false
        System.out.println(text.endsWith("e")); // true
        System.out.println(text.endsWith("re")); // true
        System.out.println(text.endsWith("M")); // false
        System.out.println(text.endsWith("E")); // false

        ---------------------------------------------------------------------------------
*/
      /* // Stringi kucuk harfe cevirme

        String text= "Merhaba Dunya";

        System.out.println("orjinal hali: " +text);
        System.out.println("text.toLowerCase: " + text.toLowerCase());
        System.out.println("me ile veya ME ile basliyor mu: " + text.toLowerCase().startsWith("me"));
        System.out.println("me ile veya ME ile basliyor mu: " + text.toLowerCase().startsWith("ME"));

        ---------------------------------------------------------------------------------*/

        // Stringi buyuk harfe cevirme

       /* String text= "Merhaba Dunya";

        System.out.println("orjinal hali: " + text);
        System.out.println("text.ToUpperCase: " + text.toUpperCase());
        System.out.println("text.To.UpperCase: " + text.toUpperCase().startsWith("ME")); //true
        System.out.println("text.To.UpperCase: " + text.toUpperCase().startsWith("Me")); // false
        System.out.println("text.To.UpperCase: " + text.toUpperCase().startsWith("me")); // false
        System.out.println("text.To.UpperCase: " + text.toUpperCase().startsWith("Du")); // false

        ----------------------------------------------------------------------------------*/

        // replace; stringin icindeki karakteri istedigin seyle degistirir.
        // degistirilecek karakterler "" tirnak isareti icine alinir.

       /* String text= "Merhaba Dunya";

        System.out.println("text = " + text);
        System.out.println("text.replace(a,e) = " + text.replace("a","e"));
        System.out.println("text.replace(ha,ya) = " + text.replace("ha","ya"));
        System.out.println("text.replace(a,'') = " + text.replace("a"," "));


        System.out.println("text.replace(Merhaba, Zalim) = " + text.replace("Merhaba" , "ZALIM"));

        ----------------------------------------------------------------------------------
*/
        // replace gibi calisir ama daha gelismisidir.
        //

        String text= "Merhaba Dunya123";
        System.out.println("text: " + text); // orjinal hali

        System.out.println("abn -> _ = " + text.replaceAll("[abn]" , "_"));
        // a veya b veya n harflerini _ yap

        System.out.println("A-Z -> _ = " + text.replaceAll("[A-Z]" , "_"));
        // A dan Z ye kadar olan buyuk harfleri = yap

        System.out.println("a-z -> _ = " + text.replaceAll("[a-z]" , "_"));
        // a dan z ye kadar olan buyuk harfleri = yap

        System.out.println("0-9 -> _ = " + text.replaceAll("[0-9]" , "_"));
        // 0 dan 9 a kadar olan butun karakterleri _ yap.

        System.out.println("0-9 -> _ = " + text.replaceAll("[^0-9]" , "_"));
        // 0 dan 9 a kadar olan rakamlar haric her seyi _ yap

        System.out.println("^a-z -> _ = " + text.replaceAll("[^a-z]" , "_"));
        // a dan z ye kadar olan harfler haric her seyi _ yap.
        // yani buyuk harfleri, bosluklari ve rakamlari ( ve varsa, rakamlar haric diger tum karakterleri ) _ yapar

















    }
}
