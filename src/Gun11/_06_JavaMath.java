package Gun11;

import Gun20._01_JavaMethodReturn;

public class _06_JavaMath {
    public static void main(String[] args) {

        int a= -12;
        int b= 4;

        System.out.println("a nin mutlak degeri = " + Math.abs(-12));      // 12   ,  absolute value
        System.out.println("a ve b den buyuk olani= " + Math.max(a,b));    // 4
        System.out.println("a ve b den kucuk olani= " + Math.min(a,b));    // -12
        System.out.println("2 nin 3. kuvveti= " + Math.pow(2,3));          // 8    ,  pow ( üs kuvvet )
        System.out.println("b nin karakoku= " + Math.sqrt(b));             // 2    ,  square root / squareroot / sqrt
        System.out.println("round(yuvarlama) 3.1 = " + Math.round(3.1));   // 3    ,  3.5 dan az ise asagiya yuvarlar
        System.out.println("round 3.5 = " + Math.round(3.5));              // 4    ,  3.5 ve 3.5 dan fazla ise yukariya yuvarlar

        System.out.println("ceil  3.1 = "+Math.ceil(3.1));// bu rakamdan büyük en yakın tam sayı    // 4
        System.out.println("ceil  3.5 = "+Math.ceil(3.5));// bu rakamdan büyük en yakın tam sayı    // 4   ,  tavan demek o yuzden yukariyi baz aliyor
        System.out.println("floor 3.1 = "+Math.floor(3.1));// bu rakamdan küçük en yakın tam sayı   // 3   ,  zemin demek o yuzden asagiyi baz aliyor
        System.out.println("floor 3.5 = "+Math.floor(3.5));// bu rakamdan küçük en yakın tam sayı   // 3


        int enb= _01_JavaMethodReturn.enbBul(a,b);
    }
}

