package ODEVLER.hw_11_12_2022_Metodlar;

public class hw_11_12_2022_soru3 {
    public static void main(String[] args) {

//        3- reverseString isminde bir method oluşturun.
//        Bu method bir String'i parametre olarak alsın.
//        Ve bu method, girilen String'i tersten yazsın.
//        Terste yazılmış halini yazdırınız.
//        Örn: String = "Java'yı Seviyorum."
//        Print: .muroyiveS ıy'avaJ

         reverseString("bizim eve gel");
    }

    public static String reverseString(String tersCumle) {

        System.out.print("ters hali= " );

        for (int i = tersCumle.length() - 1; i >= 0; i--) {
            System.out.print( tersCumle.charAt(i));
        }
        return tersCumle;

    }

}


