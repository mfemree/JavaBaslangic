package Gun31._02_Enum_FarkliYontem;

import static Gun31._02_Enum_FarkliYontem.User.UserSil;

public class Soru {

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    public static void main(String[] args) {

        User user1 = new User("Ismet", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Mehmet", Role.MUDUR, Statu.PASIF);
        User user3 = new User("Ayse", Role.MUDUR, Statu.AKTIF);

        System.out.println("user1 = " + user1);

        UserSil(user1);
        UserSil(user2);
        UserSil(user3);

    }
}