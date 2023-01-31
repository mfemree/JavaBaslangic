package Mentoring;

public class _11_18_2022_Mentoring {

    public static void main(String[] args) {

        String s1 = "Cat";
        String s2 = "Cat" ;
        String s3 = new String ("Cat");

        System.out.println( s1 == s2 );     // true
        System.out.println( s2 == s3 );     // false

        // bu yuzden bunlarin esit olup olmadigina equals yontemi ile bakmamiz lazim.
        // cunku equals yazilan seyin hafizasina, memorysine bakmaz direkt icerigine bakar
        // kucuk-buyuk harf farketmez diyorsak equalsIgnoreCase ile de bakabiliriz.

        System.out.println( s2.equals(s3 ));               // true
        System.out.println( s2.equalsIgnoreCase(s3 ));     // true

        /*-----------------------------------------------------------------------------*/

        // bu sekilde de yazdirmak mumkun. ikisi de ayni
        // yani stringe cevirmis oluyoruz          ->      ""+

        char ch = 'a';
        System.out.println(""+ch);
        System.out.println(ch);

        /*-----------------------------------------------------------------------------*/

        // ASCII TABLOSU: her karakterin desimal numarasini gosteren tabloya denir.

        char ch1 = 'a';
        char ch2 = 'A';

        System.out.println("character= " + (ch1*ch2));   // 6305 ( desimallerini bulup carpti )

        /*-----------------------------------------------------------------------------*/

                                        // Java Data Tipleri
        int count = 99;

        //   int    ->   data type
        //   count  ->   identifier   ( kimlik - belirleyici - tanimlayici )
        //   99     ->   value

                                // Java Data Casting ( Java Veri Dokumu )

        // 1- Implicit Casting
        // ( java otomatik olarak atar. girilen bir sayiyi direkt int okumasi gibi.

        // 2- Explicit Casting
        // ( disardan, biz atiyoruz. yani double olan bir sayiyi zorla int yazdirmak istememiz gibi.

        int d1 = (int) 4.5;

        /*-----------------------------------------------------------------------------*/

        int x= 12;
        int y= 6;

        int biggestOne = Math.max(x,y);
        System.out.println("biggestOne = " + biggestOne);

        if (x>y) {
            System.out.println("x buyuktur"); }
        else {
            System.out.println("y buyuktur");
        }

            }
        }

