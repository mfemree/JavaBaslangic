package ODEVLER.hw_11_12_2022_Metodlar;

public class hw_11_12_2022_soru5 {
    public static void main(String[] args) {

//        5- EvenOddNums isminde bir method oluşturun.
//        Bu yöntem String olan bir parametreyi kabul etsin.
//        Bu String'de 1234567890 gibi 10 haneli sayılar olacak.
//        Sayıların her basamağını alın ve basamak çiftse toplayın, tekse çıkartın.
//         toplam sonucu yazdırın.
//        **İpucu:Sayılar işlemleri yapabilmeniz için, basamakları tam sayıya dönüştürmeniz gerekiyor.**
//
//        For example Örnek:
//        String =  "6678421312"
//        6+6-7+8+4+2-1-3-1+2
//        sonuç 16 olmalı

        EvenOddNums("6678421312");

        // 2.yol
        String sayi = "6678421312";
        EvennOddNumber2(sayi);

    }

    public static String EvenOddNums(String strNummers) {

        String ilkEleman = "";
        int sayiNum = 0;
        int toplam = 0;

        for (int i = 0; i < strNummers.length(); i++) {

            ilkEleman = strNummers.substring(i, i + 1);
            sayiNum = Integer.parseInt(ilkEleman);

            if (sayiNum % 2 == 0)
                toplam += sayiNum;
            else
                toplam -= sayiNum;
        }

        System.out.println("toplam = " + toplam);

        return String.valueOf(toplam);
    }

    // 2.yol

    public static void EvennOddNumber2 (String strSayi2){

        long longSayi = Long.parseLong(strSayi2);
        int tp = 0;

        do {
            if ((longSayi % 10) % 2 == 0)
                tp += longSayi % 10;
            else
                tp -= longSayi % 10;
            longSayi /= 10;
        } while (longSayi > 0);

        System.out.println(tp);

    }
}

