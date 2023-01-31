package Gun43;

public class _05_TryCatchFinaly {
    public static void main(String[] args) {

        long startTime = 0;
        String str = "";

        try {
            startTime = System.currentTimeMillis();
            System.out.println("hatadan onceki kisim");
            char ilkHarf = str.charAt(0);
            System.out.println("Hatadan sonraki kisim");
            // hata olma olasiliginin oldugu kadar
        } catch (Exception ex) {
            System.out.println("catch blogu calisti");
            // hata oldugunda yapilacaklar
        } finally {  // hata olsa da calisir, olmasa da..
            // bu bolum yukaridaki surecle oldugunu gostermek icin finally icinde yazilir.

            long gecenSure = System.currentTimeMillis() - startTime;
            System.out.println("gecenSure = " + gecenSure);
            System.out.println("try-catch bloguyla ilgili son yapilacaklar");
        }

        System.out.println("diger calisan kodlar");
        System.out.println("program sonu");
    }
}
