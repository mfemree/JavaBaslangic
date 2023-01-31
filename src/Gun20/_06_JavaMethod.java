package Gun20;

public class _06_JavaMethod {
    public static void main(String[] args) {

        int s1=4;
        int s2=12;
        int s3=34;
        int s4=23;

        int sonuc1=toplamBul("Ismet" + s1,s2);
        int sonuc2= toplamBul("Mehmet" + s1,s2,s3);
        int sonuc3= toplamBul("Ali " + s1,s2,s3,s4);

        // parametreler ayni tip sadece miktarlari farkli
        // bu tip durumlar icin kolaylik saglanmis

        System.out.println("sonuc1= " + sonuc1);
        System.out.println("sonuc2= " + sonuc2);
        System.out.println("sonuc3= " + sonuc3);

    }

    // ... ile ilgili 2 kural var
    // 1- Bir metodda parametre olarak sadece 1 tane olabilir.
    // 2- Her zaman son parametre olmalı
    // gelen kaç sayı olursa olsun hepsini al dizi şeklinde metoda al

    public static int toplamBul ( String isim, int... sayilar){  // kac sayi gelirse gelsimm omlari dizi seklinde aliyor

       int toplam=0;

        for (int i = 0; i < sayilar.length; i++) {
            toplam= toplam+sayilar[i];

        }

        return toplam;
    }

}
