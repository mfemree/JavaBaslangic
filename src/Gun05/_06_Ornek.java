package Gun05;

import java.util.Scanner;

public class _06_Ornek {
    public static void main(String[] args) {

        // bir karenin kenarini kullanicidan isteyip cevresini ve alanini bulunuz ve yazdiriniz.
        // cevre = a+a+a+a , alan= a*a

        Scanner oku=new Scanner(System.in);

        System.out.print("Karenin bir kenarini giriniz= ");
        int kenar=oku.nextInt();
        int cevre= kenar + kenar + kenar + kenar;
        int alan= kenar * kenar;

        System.out.print("cevre = " + cevre + "\n" );
        System.out.println("alan = " + alan);

    }
}
