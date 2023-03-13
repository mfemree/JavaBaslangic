package Gun08;

public class _04_Soru {

    public static void main(String[] args) {

        // 2022 (dahil) yilina kadar gecen gun miktarini bulunuz.
        // 1 yilda 365 gun
        // 4 yilda 1 extra gun ekleniyor, cunku subat 29 cekiyor.

        int birYil= 365;
        int extraGun= 2022/4;
        int toplamGun= birYil*2022 + extraGun;  // 365*2022 + 2022/4

        System.out.println("gecen gun= " + toplamGun);





    }
}
