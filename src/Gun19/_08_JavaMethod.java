package Gun19;

import java.util.Arrays;

public class _08_JavaMethod {
    public static void main(String[] args) {

        // mainde 20 elemanlı bir diziyi tanımlayınız, daha sonra bir fonksiyona
        // göndererek random 100 e kadar olan sayılarla dodurunuz. ve aynı fonksiyonda
        // yazdırınız.


        int[] array = new int [20];

        randomSayilar(array);


    }

    public static void  randomSayilar ( int[] sayilar) {

        for (int i = 0; i < sayilar.length ; i++) {
            sayilar[i]= (int)(Math.random()*100);

        }
        System.out.println("Sayilar= " + Arrays.toString(sayilar));

    }

}
