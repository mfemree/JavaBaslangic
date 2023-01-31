package ODEVLER.hw_11_12_2022_Metodlar;

public class hw_11_12_2022_soru4 {
    public static void main(String[] args) {

//        4- adı  reverseWord olan bir method oluşturun
//        Bu methodun String olarak bir parametresi olmalıdır
//        Ve bu cümledeki kelimelerle tersine çevirmeli
//        Ters halini yazdırın.
//        Örnek 1 :
//        Dize: Java yazın
//        dönüş şöyle olmalıdır:  yazın Java


        String cumle = "ey edip adanada pide ye";

        reverseWord(cumle);
    }

    public static void reverseWord(String strArr) {

        System.out.print("cumleniz tersten= ");

        for (int i =strArr.length()-1; i >=0 ; i--) {

            System.out.print(strArr.charAt(i));

        }
    }
}
