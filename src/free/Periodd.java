package free;

import java.time.LocalDate;
import java.time.Period;

public class Periodd {
    public static void main(String[] args) {

        // 2 tarih arasindaki farka period denir.

        LocalDate dogumTarihi = LocalDate.of(1993, 7,16);
        LocalDate bugun = LocalDate.now();

        Period fark = Period.between(dogumTarihi,bugun);
        System.out.println("fark = " + fark);  // P 29Y 5M 28D  -> Peiod 29 year, 5 months, 28 Day

        System.out.println("fark.getYears() = " + fark.getYears());
        System.out.println("fark.getMonths() = " + fark.getMonths());
        System.out.println("fark.getDays() = " + fark.getDays());

        System.out.println(fark.getYears() + " yasindasiniz");


        /***************************************************/

        Period period3gun = Period.ofDays(3);
        Period period3Ay = Period.ofMonths(3);

        System.out.println("period3gun = " + period3gun);
        System.out.println("period3Ay = " + period3Ay);

        LocalDate ucGunSonra = bugun.plus(period3gun);
        System.out.println("ucGunSonra = " + ucGunSonra);

        LocalDate ucAySonra = bugun.plus(period3Ay);
        System.out.println("ucAySonra = " + ucAySonra);

        /***************************************************/

        // kursun bitsi tariini bulunuz.
        LocalDate kursBaslangic = LocalDate.of(2022,10,31);
        Period kursSure = Period.ofMonths(6);
        LocalDate kursBitis = kursBaslangic.plus(kursSure);
        System.out.println("kursBitis = " + kursBitis);
        System.out.println("kursBitis.getDayOfWeek() = " + kursBitis.getDayOfWeek());

        // kursun bitimine ne kadar sure kaldi?
        Period neKadarSureKAldi = Period.between(bugun,kursBitis);
        System.out.println("neKadarSureKAldi = " + neKadarSureKAldi);  // P 3M 17D

        // kurs ne kadar suredir devam ediyor?
        Period neKadardirDevamEdiyor = Period.between(kursBaslangic,bugun);
        System.out.println("neKadardirDevamEdiyor = " + neKadardirDevamEdiyor); // P 2M 13D


    }
}
