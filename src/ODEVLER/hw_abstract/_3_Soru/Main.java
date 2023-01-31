package ODEVLER.hw_abstract._3_Soru;

import Gun39._02_OOP_Soru.A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Apple.menuMemory();
        System.out.print("Hafizasi kac GB olsun?"); String str1= scan.nextLine();
        Apple.menuSize();
        System.out.print("Boyutu ne kadar olsun?"); String str2= scan.nextLine();

        Apple apple1 = new Apple();
        apple1.options(str1, str2);

        System.out.println("Price totaal: " + Phone.getSum(Phone.cart));

    }
}
