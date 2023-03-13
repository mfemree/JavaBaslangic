package Gun14;

public class _02_forLoop {
    public static void main(String[] args) {

        // 1 den 5 e kadar olan sayilari ekrana yazdiriniz.


        int i=1;

        while (i<=5){

            System.out.println("í= " + i);
            i++;
        }
        System.out.println();


        // bunu for dongusu ile ise su sekilde yazariz
        // sayinin baslangici belli, kacta bitecegi belli, artis miktari belli

        for (i=1; i<=5; i++) {

            System.out.println("i= " + i);
        }

    }
}
