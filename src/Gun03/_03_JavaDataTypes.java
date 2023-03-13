package Gun03;

public class _03_JavaDataTypes {
    public static void main(String[] args) {

        /* int sayi; // hafizada int kadar yer ayiriyor, sadece tam sayi atilabiliyor.

        // tam sayilar
        byte byteDeger = 7; // -128 127
        short shortDeger = 1645; // -32000 .. 32000
        int intDeger = 250000;
        long longDeger = 2323232345454545L;

        // ondalikli sayilar
        // ondalikli sayilarda default ve DOUBLE dir.
        double doubleDeger = 3.144576574367; // noktadan son 16 hane duyarlidir
        float floatDeger = 3.453463F; // noktadan sonra 7 hane duyarlidir

        char basHarf = 'A';
        String isim = "ismet";

        System.out.println("byteDeger=" + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim); */
        int sayi; // hafizada int kadar yer ayiriyor, sadece tam sayi atilabiliyor.
        // yani pc bir sayi gordugunde bunu ilk int olarak kabul eder. yani default dur.

        // tam sayilar

        byte byteDeger = 7; // -128 127
        short shortDeger = 1645; // -32000 ... 32000
        int intDeger = 250000;
        long longDeger = 2323232345454545L;

        // reel sayilar ( tam sayi + kesirli + rasyonel + irrasyonel + pi )
        // ondalikli sayilarda default DOUBLE dir.

        float floatDeger = 3.14323F; // . dan sonra 7 hane ye kadar gider.
        double doubleDeger = 3.14454545556; // . dan sonra 16 hane ye kadar gider.

        // büyük F küçük f farketmez.

        // karakter ve karakterler

        char basHarf = 'A';
        String isim = "ismet"; // yani metin

        System.out.println("byteDeger = " + byteDeger);
        System.out.println("shortDeger = " + shortDeger);
        System.out.println("intDeger = " + intDeger);
        System.out.println("longDeger = " + longDeger);
        System.out.println("doubleDeger = " + doubleDeger);
        System.out.println("floatDeger = " + floatDeger);
        System.out.println("basHarf = " + basHarf);
        System.out.println("isim = " + isim);


        byte byteDefault;
        short shortDefault;
        int intDefault;
        long longDefault;
        float floatDefault;
        double doubleDefault;
        char charDefault;

    }
}