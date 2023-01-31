package Gun05;

import java.util.Scanner;

public class _09_Ornek {

    public static void main(String[] args) {

        // Kullanıcıdan ağırlığını double, boyunu double olarak alınız.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)


        Scanner kiloOku=new Scanner(System.in);
        System.out.print("Kilonuzu giriniz= ");
        double kiloDeger=kiloOku.nextDouble();

        Scanner boyOku=new Scanner(System.in);
        System.out.print("Boyunuzu giriniz= ");
        double boyDeger=boyOku.nextDouble();

        double vucutKitleInd= kiloDeger / (boyDeger*boyDeger);

        System.out.println("Kilonuz= " + kiloDeger + " " + ", " + "Boyunuz= " + boyDeger);
        System.out.println("VucutKitleInd = " + vucutKitleInd);




    }
}
