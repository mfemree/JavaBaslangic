package Gun31._03_Enum;

public class AylarMain {
    public static void main(String[] args) {

        // Bir User yetkilendirme modülü yapılması isteniyor.
        // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
        // USER STATUSU : AKTIF, PASIF
        // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
        // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
        // kullanıcısı tanımlayınız.
        // UserSilme isimli fonksiyona bu userları gönderiniz.
        // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

        System.out.println("Aylar.AGUSTOS = " + Aylar.AGUSTOS);

        Aylar ay = Aylar.SUBAT;

        System.out.println("ay = " + ay);
        System.out.println("ay.ayNo = " + ay.ayNo);
        System.out.println("ay.gunMiktar = " + ay.gunMiktar);
        System.out.println("ay.ayAd = " + ay.ayAd);


        for ( Aylar a  : Aylar.values() ) {
            System.out.println(a.ayNo + "-" + a.gunMiktar +"-"+ a.ayAd);
        }

    }
}
