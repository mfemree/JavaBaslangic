package free.freeler;

public class free11 {
    public static void main(String[] args) {

        int a=0;
        int b= a++;

        System.out.println(a < b && b < a);
        System.out.println(a < b & b < a); // a kucuktur be VE b kucuktur a ise
        System.out.println(b);


        int x=2;
        //System.out.println( (++x) - (x++) - (x--) + (x++));

        System.out.println((++x)); // 3
        System.out.println((x++)); // 3
        System.out.println((x--)); // 4
        System.out.println((x++)); // 3
        System.out.println(x);


    }
}
