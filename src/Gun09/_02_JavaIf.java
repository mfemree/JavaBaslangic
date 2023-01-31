package Gun09;

import java.util.Scanner;

public class _02_JavaIf {
    public static void main(String[] args) {

        // girilen bir sayinin negatif mi pozitif mi oldugunu yazdir
        // sifir ise sifir yazdiriniz.

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi giriniz= ");
        int sayi= oku.nextInt();

        if(sayi>0)
            System.out.println("girdiginiz sayi= " + "pozitiftir");

        if(sayi<0)
            System.out.println("girdiginiz sayi= " + "negatiftir");

        if(sayi==0)
            System.out.println("girdiginiz sayi= " + "sifirdir");




    }
}
