package Gun27._02_Ornek;

import Gun27._02_Ornek.MyMath;

public class Soru {


    // Math sınıfndaki metodlarıdan 5 tanesini
    // kendi isimlendirmenizle ayrı bir sınıfta yazarak,
    // (kendi metodunuzun içinde Math.fonksiyonlarını kullanabilirsiniz)
    // mainden nesne oluşturmadan direk kullanılmasını sağlatacak örnek
    // kullanımlarını yazınız.

    public static void main(String[] args) {

        int max = MyMath.getMax(5,10);
        int min = MyMath.getMin( 5,10);
        int rnd = MyMath.getRandom(10 );
        double usSonuc= MyMath.getUsAl(2,3);
        double karekok= MyMath.getKarekok(16);


        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("rnd = " + rnd);
        System.out.println("usSonuc = " + usSonuc);
        System.out.println("karekok = " + karekok);

    }
}
