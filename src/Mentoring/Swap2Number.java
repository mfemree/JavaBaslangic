package Mentoring;

public class Swap2Number {
    public static void main(String[] args) {

        int x=6;
        int y=12;

        // x in yeni degerini 12, y nin yeni degeri 6 olarak yazdiriniz.

        int temp=x;
        x=y;
        y=temp;

        // 2.cozum

        int a=6;
        int b=12;

        a= a-b;         //  6-12   = -6    , a -> -6 oldu
        b= a+b;         // -6+12   =  6    , b ->  6 oldu
        a= b-a;         //  6-(-6) = 12    , a ->  12 olur.




    }
}
