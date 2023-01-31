package ODEVLER.digerOdevler;

public class odev_21_11_2022 {

    public static void main(String[] args) {

        // 1- I love java** olan bir String oluşturun. Bu cümlenin toplam karakter sayısını yazdırın.

        /*String cumle= "I love java";
        int uzunluk= cumle.length();
        System.out.println("Karakter Sayisi= " + uzunluk);*/

        // 2- Sprint planning** olan bir String oluşturun. Bu dizenin _toplam karakter sayısını_ yazdırın.

       /* String planning= "1-veri toplama, 2-Analiz";
        int uzunluk2= planning.length();
        System.out.println("Karakter Sayisi= " + uzunluk2);*/

        // 3- **apple** olan bir String oluşturun. String'in _içinde_ **app** olup olmadığını **doğrula**.

        /*String meyve= "apple";
        boolean varMi= meyve.contains("app");
        System.out.println("kelimenizin icinde app var mi? = " + varMi);*/

        // 4- **orange** kelimesinden oluşan bir String oluşturun. String'in **Apple**'a _eşit_ olup olmadığını doğrulayın.

       /*String kelime1= "orange";
        String kelime2= "Apple";

        boolean esitMi= kelime1.equals(kelime2);
        System.out.println("esit mi= " + esitMi);*/


        // 5- **apple**  olan  bir String oluşturun. String'in **apple**'a _eşit_ olup olmadığını doğrulayın.
        // Büyük harf veya küçük harf önemli değildir._

        /*String kelimee= "apple";
        boolean esitMi= kelimee.equalsIgnoreCase("apple");
        System.out.println("esit mi= " + esitMi);*/

        // 6- **Florida** kelimesinden bir String oluşturun.
        // Florida kelimesinin içindeki, sadece  **'o'**  harfinin bulunduğu indexini yazdırın.

        /*String kelimem= "Florida";
        int kelimemIndex= kelimem.indexOf("o");
        System.out.println("o harfinin indexi= " + kelimemIndex);*/

        // 2. yontem

        /*System.out.println(kelimem.indexOf("o") );*/

        // 7- **Thank you** olan bir String oluşturun.
        // Thank you içindeki, sadece  **'y'** harfinin bulunduğu _konumu_ yazdırın.

        /*String tesekkurler= "Thank you";

        int tesekkurlerIndex= tesekkurler.indexOf("y");
        char karakter6=tesekkurler.charAt(6); // soruda tam olarak neyi istedigini anlamadigim icin ikisini de yapiyorum.

        System.out.println("y harfinin indexi= " + tesekkurlerIndex);
        System.out.println("sadece y harfi= " + karakter6);*/

        // 8- **Main method** oluşturun.
        // **Mouse** değerinde bir String oluştur.
        // Mouse String'inin 3_. sırasındaki karakteri_ yazdırın.

            /*public static void main(String[] args) {

            String word= "Mouse";
            char harf3= word.charAt(2);

            System.out.println("3. siradaki karakter= " + harf3);*/


        // 9- **paper** olan bir String oluşturun.String'i _büyük harfe_ çevirin ve yazdırın.örn: apple > APPLE

         /*String spice= "paper";
         String buyukHarf= spice.toUpperCase();
         System.out.println("buyuk harfli hali= " + buyukHarf);*/


        // 10- **OraNge** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.örn: APPLE > apple

        /*String meyvee= "OranNge";
        String kucukHali= meyvee.toLowerCase();
        System.out.println("kucuk hali= " + kucukHali);*/

        // 11-  **New Jersey** olan bir String oluşturun. String'i _büyük harfe_ çevirin ve yazdırın.

        /*String state= "New Jersey";
        String buyukHal= state.toUpperCase();
        System.out.println("buyuk hal= " + buyukHal);*/

        // 12- **New York** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.

        /*String state= "New Jersey";
        String kucukkHali= state.toLowerCase();
        System.out.println("kucuk hal= " + kucukkHali);*/

        // 13- **PADDLE** olan bir String oluşturun. String'i _küçük harfe_ çevirin ve yazdırın.

        /*String imlec= "PADDLE";
        String kuccukHali= imlec.toLowerCase();
        System.out.println("kuccukHali = " + kuccukHali);*/

                                                    // Özel sorular

        // 1- Ayrı ayrı girilen ad ve soyadı aralarında bir boşluk koyarak birleştiriniz.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("adiniz= ");
        String ad= oku.nextLine();

        System.out.print("soyadiniz= ");
        String soyad= oku.nextLine();

        System.out.println("adiniz soyadiniz= " + ad + " " + soyad);*/

        // 2- Girilen bir kelimenin boş(Blank) olup olmadığını yazdırınız

        /*Scanner oku= new Scanner(System.in);
        System.out.print("bir seyler yaziniz= ");
        String kelime= oku.nextLine();

        boolean Varmi= kelime.contains(" ");

        System.out.println("yazdiginiz seylerde bosluk var mi?= " + Varmi);*/


        // 3- girilen bir cümledeki A harfi sayısını bulunuz.(Büyük küçük harf ayırımı olmadan.

       /*Scanner oku= new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String cumle= oku.nextLine();
        int cumleUzunluk= cumle.length();
        cumle=cumle.toLowerCase();

        String aHarfli= cumle.replaceAll("[!a]","");
        int aHarfliOlmayanUzunluk= aHarfli.length();
        int aHarfiUzunluk= cumleUzunluk - aHarfliOlmayanUzunluk;

        System.out.println("cumlenizdeki a harfi sayisi= " + aHarfiUzunluk);*/

        // 4- girilen bir kelimenin ilk ve son harfini bulunuz.

        /*Scanner oku= new Scanner(System.in);
        System.out.print("bir kelime giriniz= ");
        String kelime= oku.nextLine();

        int kelimeUzunluk= kelime.length();
        int sonHarfUzunluk= kelimeUzunluk - 1;

        char ilkHarf= kelime.charAt(0);
        char sonHarf= kelime.charAt(sonHarfUzunluk);

        System.out.println("ilk ve son harf= " + ilkHarf + " " + sonHarf );*/

        // 5- girilen bir cümledeki ilk kelimeyi yazdırınız.

       /* Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String cumle= oku.nextLine();

        int boslukIndex= cumle.indexOf(" ");
        System.out.println("ilk kelime= " + cumle.substring(0,boslukIndex));*/

        // 6- girilen en az 3 kelimelik bir cümledeki ilk iki kelimeyi yazdırınız

        /*Scanner oku = new Scanner(System.in);
        System.out.print("en az 3 kelimelik bir cumle giriniz= ");
        String cumle= oku.nextLine();

        int boslukIndex= cumle.indexOf(" ");
        String ilkKelime= cumle.substring(0,boslukIndex); //ibrahim

        int bosluk2Index= cumle.lastIndexOf(" ");
        String ikinciKelime=cumle.substring(boslukIndex+1, bosluk2Index);

        System.out.println("ilk iki kelime= " + ilkKelime + " " + ikinciKelime);*/

        // 7- Girilen bir cümlede kaç kelime olduğunuz bulunuz.

        /*Scanner oku = new Scanner(System.in);
        System.out.print("bir cumle giriniz= ");
        String cumle= oku.nextLine();

        int cumleUzunluk=cumle.length(); // 11

        String bosluksuzHali= cumle.replace(" " , ""); // aliatabak

        int bosluksuzHaliUzunluk= bosluksuzHali.length(); // 9
        int bosluksayisi= cumleUzunluk - bosluksuzHaliUzunluk; // 2

        System.out.println("cumlenizdeki bosluk sayisi= " + bosluksayisi);*/

        // 9- 3 kelimelik ismi olan kişinin ad , 2.ad ve soyadını A.E.Y. şeklinde yazınız.

        /*Scanner oku = new Scanner(System.in);
        System.out.print("en az 3 kelimeden olusan bir isim soyisim giriniz= ");
        String adSoyad= oku.nextLine();

        // mustafa emre us

        char ilkHarf = adSoyad.charAt(0); // m

        int boslukIndex=adSoyad.indexOf(" ");
        char ikinciAdIlkHarf= adSoyad.charAt(boslukIndex+1); // e

        int sonBoslukIndex= adSoyad.lastIndexOf(" ");
        char soyadIlkHarf = adSoyad.charAt(sonBoslukIndex+1); // u

        System.out.println("AD soyadiniz bas harfleri= " + ilkHarf + "." + ikinciAdIlkHarf + "." + soyadIlkHarf);
        */

    }
}