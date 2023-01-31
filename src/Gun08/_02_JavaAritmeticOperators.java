package Gun08;

public class _02_JavaAritmeticOperators {
    public static void main(String[] args) {

        int sayac= 0;

        sayac= sayac + 1; // sayacin degerini 1 tane arttiriyor.
        sayac++;          // sayacin degerini 1 tane arttiriyor.
        ++sayac;          // sayacin degerini 1 tane arttiriyor.

        sayac=sayac-1;    // sayacin degerini 1 tane azaltiyor.
        sayac--;          // ssayacin degerini 1 tane azaltiyor.
        --sayac;          // sayacin degerini 1 tane azaltiyor.

        System.out.println("sayac = " + sayac);

       /* -----------------------------------------------------------------*/

        int toplam= 5 + sayac;   // 5 olur
        System.out.println("toplam = " + toplam);  // 5
        System.out.println("sayac = " + sayac);    // 0

        toplam = 5 + sayac++;   // toplam = 5+sayac sonra sayac=sayac+1
        // toplam=5  ve sayac= 1 oldu.
        System.out.println("toplam = " + toplam);  // 5
        System.out.println("sayac = " + sayac);    // 1

        toplam = 5+  ++sayac;  // sayac=sayac+1 onra toplam=5+sayac  7 olur
        System.out.println("toplam = " + toplam);  // 7
        System.out.println("sayac = " + sayac);    // 2

        // Özet:  ++ lar sağda ise önce işlem sonra artış
        //        ++ lar solda ise önce artış sonra işlem.






    }
}
