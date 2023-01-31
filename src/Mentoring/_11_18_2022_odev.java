package Mentoring;

import java.util.Scanner;

public class _11_18_2022_odev {
    public static void main(String[] args) {

       /* String givenString = "8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd";

        // Verilen String de bosluklari kaldirarak ekrana yeniden yazdiriniz...
        // String methodlarindan uygun olanini kullaniniz...

        System.out.println("Without Blank Stil= " + givenString.replace(  " " , "" ));

        // or

        System.out.println("Without Blank Stil= " + givenString.replaceAll(" " , ""));
*/
        // karisik calisma

        /*String withoutBigLetter= givenString.replaceAll("[^A-Z]" , "");
        System.out.println(withoutBigLetter);

        String withoutSmallLetter= givenString.replaceAll("[^a-z]" , "");
        System.out.println(withoutSmallLetter);

        String withoutNumber= givenString.replaceAll("[^1-9]", "");
        System.out.println("withoutNumber = " + withoutNumber);

        System.out.println("Without Blank Stil= " + withoutNumber + withoutBigLetter + withoutSmallLetter );*/


        /* ------------------------------------------------------------------------------- */

        // Sonuc A.V. seklinde ekrana yazdirilmali...

       /* String givenWord = "Ali Veli";

        int blankIndex= givenWord.indexOf(" ");
        char V= givenWord.charAt(blankIndex+1);


        System.out.println("given word= " + givenWord.charAt(0) + "." + givenWord.charAt(4));
        System.out.println("givenWord = " + givenWord.charAt(0) + "." + V);

        // 2.yol

        System.out.println(givenWord.substring(0,1).toUpperCase() + "." + (givenWord.substring(blankIndex+1, blankIndex+2).toUpperCase()) );*/


        /* ------------------------------------------------------------------------------- */

        // 50 sayidan en buyuk olanini bulmak istesek?

        Scanner oku= new Scanner(System.in);
        System.out.print("1.sayiyi giriniz= ");
        int theBiggestOne= oku.nextInt();

        int counter=0;
        int sayi2;

        do {

            System.out.print(counter+1 + ". sayiyi giriniz= ");
            sayi2=oku.nextInt();

            theBiggestOne= Math.max(sayi2,theBiggestOne);

            counter++;

        }while (counter < 5);

        System.out.println( "The Biggest One= " + theBiggestOne);

        /*----------------------------------------------------------*/

        // hocanin cozdugu

        /*Scanner scan = new Scanner(System.in);
        int count = 0;
        int result = 0;
        while (count <= 5){
            System.out.println("Lutfen bir sayi giriniz");
            int given = scan.nextInt();
            result = Math.max(result, given );
            count++;
        }
        System.out.println(result);*/



                                                // ODEVLER

        // 1) stack memory ve heap memoryi arastir.

        // a) Stack Memory:

        // cagrilan methotlarimizi ust uste koyan bir hafizadir.
        // ama bunu son koydugumuzu ilk alma mantigiyla yapar
        // last in - first out. ( LIFO )

        // b) Heap Memory:


        // 2) Java Runtime Environment (JRE ) nedir?


        // 3) Java Virtual Machine ( JVM ) nedir?


       /* --------------------------------------------------------------------------------- */

        //  Java Class Library ( JCL )
        // Javayi sadece kullaniyorsak ve bir program olarak pc mize yuku ise


        //  Java Development Kit ( JDK )
        //  Javada bir seyler gelistireceksek bu programa ihtiyacimiz var
        // Development Tools ( Javac, jheap, jconsole, etc. )
        // kursun en basinda indirdigimiz program.

        // JDK > JRE > JVM  ( bu ucu interview sorusu )

        //  Java Compiler ( Javac )
        // uzantisi Source code (xxx.java) olan kodlari Java Bytecode (xxx.class) a cevirir. yani 1-0 lara.
        // java dan machine koduna cevirilen yer. o yuzden her yerde kullanabiliyoruz.



    }
}
