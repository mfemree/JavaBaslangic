package Gun09;

import java.util.Scanner;

public class _01_JavaIf {
    public static void main(String[] args) {

        Scanner oku= new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int sayi= oku.nextInt();

        if(sayi > 10)                    // bu parantezler sart
                                        // noktali virgul koymak yok, koyarsan challenger patlar
        {                               // if sarti saglandiginda yapilacaklarin parantezi.
                                        // if in icinde birden fazla komut var ise if parantezleri sarttir

            System.out.println("10 dan buyuk");
            System.out.println(" ");

        }



    }
}
