package Gun03;

public class _02_Degiskenler {
    public static void main(String[] args) {
        /*int sayi=5;

        int kisaKenar= 5;
        int uzunKenar= 7;

        int cevre = kisaKenar + kisaKenar +uzunKenar + uzunKenar;

        System.out.println(cevre);*/

        int sayi = 10;
        int kisaKenar = 20;
        int uzunKenar = 25;
        int cevre;
        int alan;

        cevre= kisaKenar+kisaKenar+uzunKenar+uzunKenar;
        cevre= ( kisaKenar + uzunKenar ) * 2;
        alan= kisaKenar * uzunKenar;

        System.out.println("cevresi = " + cevre);
        System.out.println("cevresi = " + kisaKenar + "+" + kisaKenar + "+" + uzunKenar + "+" + uzunKenar + " = " + cevre);
        System.out.println("alani = " + alan);

    }
}
