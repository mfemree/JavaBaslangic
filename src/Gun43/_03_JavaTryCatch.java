package Gun43;

import java.time.LocalDate;
import java.time.Month;

public class _03_JavaTryCatch {
    public static void main(String[] args) {

        System.out.println("program calismaya basladi");

        try { // dene, hatanin basladigi yerin ustune konur
            LocalDate tarih= LocalDate.of(2023, Month.FEBRUARY,30);

        } // hata oldugu zaman o hatayi yakaliyor
        catch (Exception ex ) {
            // ex isimli degiskene hata bilgileri ataniyor
            // hata olustugunda yapilmasi istenenler burada belirtiliyor

            System.out.println("hata olustu, lutfen tekrar deneyiniz");
            System.out.println("tum hata mesaji =" + ex);
            System.out.println("hatanin aciklamasi= " + ex.getMessage());

            // ayni zamanda hata mesajlarini kendine mail olarak da atabilirisn
            // log tutma: program nasil calisiyor, hata loglarini harddiske yazdirabilirsin

        }
        System.out.println("program bitti");


    }
}
