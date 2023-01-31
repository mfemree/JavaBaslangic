package Gun41;

import java.time.LocalDate;
import java.time.Period;

public class _05_Period {
    public static void main(String[] args) {

        // iki tarih arasindaki farka period denir.
        // sadece LocalDate'ler icin kullanilir.


        LocalDate dogumTarihi= LocalDate.of(1993, 7,16);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " yasindasiniz");

        /********************************************/

        Period period3Gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        System.out.println("period3Gun = " + period3Gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra = bugun.plus(period3Gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra = bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);


        /********************************************/

        // Kursun bitis tarihini bulunuz 6 ay - 31 Ekim 2022
        LocalDate kursBaslangic = LocalDate.of(2022,10,31);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);

        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // kursun bitmesine ne kadar sure kaldi
        Period neKadarSureKaldi = Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKaldi = " + neKadarSureKaldi);

        // kurs ne kadar suredur devam ediyor
        Period suAnaKadarDevamSuresi = Period.between(kursBaslangic,bugun);
        System.out.println("suAnaKadarDevamSuresi = " + suAnaKadarDevamSuresi);

    }
}
