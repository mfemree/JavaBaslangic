package Gun31._02_Enum;

public class Soru {

    // Bir User yetkilendirme modülü yapılması isteniyor.
    // USER ROLÜ : ADMIN, MUDUR, SATIS, PERSONEL
    // USER STATUSU : AKTIF, PASIF
    // Yukarıdaki şekilde bir USER(username) class ı tanımlayınız
    // Farklı yetki ve statüde 2 kullanıcı ve bir de ADMIN
    // kullanıcısı tanımlayınız.
    // UserSilme isimli fonksiyona bu userları gönderiniz.
    // ADMIN kullanıcısı için bu user silinemez uyarısı verdirelim

    enum Role {Tanimsiz, ADMIN, MUDUR, SATIS, PERSONEL}
    enum Statu {Tanimsiz, AKTIF, PASIF}

    // role ve statuyu mainin altinda yazdik
    // ama ayri bir enum clasinda da yapabiliriz. yani class gibi


    public static void main(String[] args) {

        User user1 = new User("Ismet", Role.ADMIN, Statu.AKTIF);
        User user2 = new User("Mehmet", Role.MUDUR, Statu.PASIF);
        User user3 = new User("Ayse", Role.SATIS, Statu.AKTIF);

        userSil(user1);
        userSil(user2);
        userSil(user3);

        System.out.println("user1 = " + user1);
    }
    private static void userSil(User user) {

        if (user.role == Role.ADMIN) ;
        {
            System.out.println(user.username + " Admin silinemez");

        }
    }
}