package free.freeler;

public class free14 {
    public static void main(String[] args) {

        // 50 kisilik bir sinifin notlarini giriniz ve ortalamadan buyuk
        // kac not oldugunu bulunuz ve bunlari yazdiirniz.


        /*Scanner oku = new Scanner(System.in);

        int[] notlar = new int[5];
        int toplam = 0;

        for (int i = 0; i < notlar.length; i++) {

            System.out.print( i+1 + ".ogrenci notunu giriniz= ");
            notlar[i] = oku.nextInt();
            toplam = toplam + notlar[i];
        }

        System.out.println();
        int ortalama = toplam / notlar.length;
        int gecenler = 0;

        for (int i = 0; i < notlar.length; i++) {

            if (notlar[i] > ortalama) {
                System.out.println("ortalamdan buyuk ogrenci notlari= " + notlar[i]);
                gecenler++;
            }

        }
        System.out.println();
        System.out.println("ortalama= " + ortalama);
        System.out.println("ortalamayi gecen ogrenci sayisi= " + gecenler);

    }
}
*/
        // kullanicidan alacaginiz 7 sayiyi aldiktan sonra
        // kac tanesinin ortalmadan buyuk ve tek oldugunu bulunuz.


        /*int[] sayilar = new int[7];
        int toplam = 0;

        for (int i = 0; i < sayilar.length; i++) {

            Scanner oku = new Scanner(System.in);
            System.out.print(i + 1 + ". sayiyi giriniz= ");
            sayilar[i] = oku.nextInt();

            toplam = toplam + sayilar[i];
        }

        int ortalamayiGecenveTekOlanlar = 0;
        int ortalama = toplam / sayilar.length;

        for (int i = 0; i < sayilar.length; i++) {

            if (sayilar[i] > ortalama && sayilar[i] % 2 == 1) {
                ortalamayiGecenveTekOlanlar++;

            }

        }
        System.out.println("ortalamdan buyuk ve tek olan not sayisi= " + ortalamayiGecenveTekOlanlar);
        System.out.println("ortalama= " + ortalama);*/


        // 5 tv kanali ismini bir diziye doldurunuz.
        // daha sonra random olarak bir tanesini secip ekrana secileni yazdiirniz.

        String[] kanalar= {"trt" , "kanald", "atv", "fox", "haberturk"};

        int random=(int) (Math.random()* kanalar.length);

        System.out.print("kuradan cikan kanal= " + kanalar[random]);




    }
}

