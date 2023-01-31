package ODEVLER.hw_11_12_2022_Metodlar;

import java.util.Scanner;

public class hw_11_12_2022_soru7 {
    public static void main(String[] args) {

//        7- powerOfThree isminde bir method oluşturun.
//        Parametre olarak int
//        Return tipi boolean
//        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
//        **Örnek 1:**
//        ```
//        **Girdi:** 27
//        **Çıktı:** true
//        ```
//        ```
//        Açıklama: 3*3*3 =27
//        ```
//        ```
//        Sonuç= true
//        ```

        //1.yol
        powerOfThree(8);

        // 2.yol
        System.out.println(powerOfThree2(sayiOku()));

    }

public static boolean powerOfThree ( int girilenSayi ){


    // int sayi = ((girilenSayi/3) / 3 );

    int sayi = (int) Math.pow(( (girilenSayi/3) / 3 ), 3);

    boolean usMu = true;

    if ( sayi == girilenSayi )
        System.out.println(usMu);
    else
        System.out.println(false);

    return usMu;

    }

    // 2.yol

    public static boolean powerOfThree2(int sayi){
        for (int i = 3; i <=sayi ; i*=3) {
            if (i==sayi)
                return true;
        }
        return false;
    }
    public static int sayiOku(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Sayi giriniz :");
        return sc.nextInt();
    }
}