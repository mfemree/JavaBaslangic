package Gun04;
public class _07_SayiKelime {

    public static void main(String[]args){

        // su ana kadar biz hep sayilari sayilara cevirdik
        // simdi sirada yazilarin rakama, rakamlarin da yaziya cevrilmesi var.

      /*  String ad="Ismet";
        String kelimeSayi="65"; // string halde, toplama gibi bir isleme giremez.

        int sayiDeger= Integer.parseInt(kelimeSayi); // sayiya dönüşür

        int toplam=sayiDeger+sayiDeger;
        System.out.println("toplam= " + toplam);

        // toplam su anda int yani sayi, bunu Stringe nasil donustururum?

        String strToplam= Integer.toString(toplam);
        System.out.println("strToplam= "+ strToplam);*/

        String ad= "Mustafa Emre";
        String kelimeSayi= "80";

        // metin olarak verilen 80 sayisini sayi tipine donustuuryoruz.
        // hangi tipe donusturmek istiyorsak ilk bastan onu yaziyoruz.
        // integer a cevirmek istiyorsam "Integer.parseInt" komutuyla yaziyorum.

        int sayiDeger= Integer.parseInt(kelimeSayi);
        int toplam= sayiDeger+sayiDeger;
        System.out.println("toplam = " + toplam);

        // toplam i biz su anda sayi tipinde yazmis olduk. simdi bunu tekrar string tipine donusturelim.
        // hangi tipe donusturmek istiyorsam ilk basta onu yaziyorum.
        // String e donusturmek istiyorsam "Integer.toString" komutuyla yaziyorum

        String strToplam= Integer.toString(toplam);
        System.out.println(strToplam);




    }
}