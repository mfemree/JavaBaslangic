package Gun20;

public class _01_JavaMethodReturn {
    public static void main(String[] args) {

        merhabaYaz();

        toplamYaz(4,5);

        enbYaz(4,5);

        int enb;
        enb= enbBul(10,8);
        System.out.println("enb = " + enb);

        // fonksiyonda return oldugu icin main de yazdirabilirsin
        // yani fonksiyonun sonucunu alabiliyorsaniz

    }

    public static int enbBul ( int a, int b ) {   //  donecek tip

        int girilenSayi=0;

        if(a>b)
            girilenSayi=a;
        else
            girilenSayi=b;

        return girilenSayi;   // donecek deger

    }

    public static void enbYaz ( int a, int b){

        if ( a>b )
            System.out.println("en buyuk sayi= " + a);
        else
            System.out.println("en buyuk sayi= " + b);
    }
    public static void toplamYaz ( int a, int b){

        System.out.println("toplam= " + ( a+b));
    }

    public static void merhabaYaz (){

        System.out.println("merhaba dunya");
    }






}
