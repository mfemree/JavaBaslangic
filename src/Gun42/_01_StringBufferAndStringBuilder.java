package Gun42;

public class _01_StringBufferAndStringBuilder {
    public static void main(String[] args) {

        String cumle = "";

        cumle = cumle + "Bugun"; // + isareti stringlerde birlestrime yapar.
        cumle = cumle + " hava"; // atama ister
        cumle += " cok soguk";

        System.out.println("cumle = " + cumle);
        System.out.println("cumle.concat() = " + cumle.concat(" fakat dun sicakti"));
        System.out.println("cumle = " + cumle);

        cumle = cumle.concat(" fakat dun sicakti ");  // concat komutu birlestirir ve atama ister
        System.out.println("cumle = " + cumle);

        // concat = birlestirme

        /********** StringBuilder *************/

        StringBuilder cumle2 = new StringBuilder();
        cumle2.append("Bugun");  // append: ekle, atama gerektrimez, ekler.
        cumle2.append(" hava");
        cumle2.append(" soguk");

        // append = sonuna ilave etmek, eklemek.

        System.out.println("cumle2 = " + cumle2);

        /************ +, concat, StringBuilder 3 model in hizi test edilecek ***********/

        // 10 bin tane kelime eklersem bu islem kac sn surer? bunu bulmaya calsiiyorum.
        long startTime = System.currentTimeMillis();
        String test1 = "";
        for (int i = 0; i < 10000; i++) {
            test1 = test1 + "merhaba";
        }
        System.out.println("+ icin gecen sure= " + (System.currentTimeMillis() - startTime) + " ms");


        startTime = System.currentTimeMillis();
        String test2 = "";
        for (int i = 0; i < 10000; i++) {
            test2 = test2.concat(" merhaba ");
        }
            System.out.println("concat icin gecen sure= " + (System.currentTimeMillis() - startTime) + " ms");


        startTime = System.currentTimeMillis();
        StringBuilder test3 = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            test3.append(" merhaba");
        }
        System.out.println("StringBuilder icin sure= " + (System.currentTimeMillis() - startTime) + " ms");


        // Performans testi sonucu :
        // eğer 3 kadar ekleme işlemi olacaksa + kullanılır, pratik olduğu için
        // ancak daha fazla ekleme olacaksa 10 adede kadar concat kullanılabilir
        // Eğer çok fazla String işlemleri yapacaksak bunun için
        // performansı oldukça iyi olan StringBuilder kullanılır.
        // yapısı gereği hızlı çalışır.


        ////////////////////////////////////////////////////////////////////////////////////////

        StringBuilder sb = new StringBuilder();
        sb.append("Bugun"); //  kendine ekleme, atama gerektirmez. ( concat da gerekirdi )
        sb.append(" hava");
        sb.append( " guzel");
        System.out.println("sb = " + sb);

        System.out.println("sb.length() = " + sb.length());
        sb.append(4);  // eklenen her seyi toString hali var ise cevirerek en sona ekler
        System.out.println("sb = " + sb);

        sb.reverse(); // Stringi tersine cevirir.
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);

        sb.delete(0,5); // index (0 dahil), 5 haric olmak uzere siler.
        System.out.println("sb = " + sb);

        sb.deleteCharAt(3);  // sadece belirtilen index'deki karakteri siler
        System.out.println("sb = " + sb);

        sb.insert(5, "kelime");  // 5 nolu index'e kelimeyi ekle: araya ekler
        System.out.println("sb = " + sb);

        sb = new StringBuilder("Bugun hava cok soguk"); // sifirlandi ve ilk deger atanfi
        System.out.println("sb = " + sb);

        String strSb = sb.toString();


        StringBuffer sBuffer = new StringBuffer(); // tamamen StringBuilder ile ayni
                                                   // tek farki, paralel calisan yazilimlarda StringBuffer kullanilir.







    }
}
