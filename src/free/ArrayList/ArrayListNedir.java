package free.ArrayList;

import free.array.KullaniciyaArrayOlusturma;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNedir {
    public static void main(String[] args) {

        ArrayList<Integer> sayilar = new ArrayList<>();

        // 1- List primitive data kabul etmez
        // 2- List bir interface oldugu icin direkt obje olusturulamaz
        // onun yerine sag tarafa new ArrayList<>() yazariz

        Scanner scan= new Scanner(System.in);

        KullaniciyaArrayOlusturma obj1= new KullaniciyaArrayOlusturma();

        sayilar.add(4);
        sayilar.add(5);

        System.out.println(sayilar);  //  [4, 5]



    }
}
