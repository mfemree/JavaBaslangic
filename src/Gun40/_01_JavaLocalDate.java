package Gun40;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class _01_JavaLocalDate {
    public static void main(String[] args) {

        // LocalDate sadece gun-ay-yil bilgisini tutar

        LocalDate tarih = LocalDate.now();   // su andaki zamani verir.

        System.out.println("tarih = " + tarih);                                      // 2023-01-13
        System.out.println("tarih.getYear() = " + tarih.getYear());                  // 2023
        System.out.println("tarih.getMonth() = " + tarih.getMonth());                // January - hangi ayda oldugumuz
        System.out.println("tarih.getMonthValue() = " + tarih.getMonthValue());      // 1  - kacinci ayda oldugumuz
        System.out.println("tarih.getDayOfMonth() = " + tarih.getDayOfMonth());      // 13 - ayin kacinci gununde oldugumuz
        System.out.println("tarih.getDayOfWeek() = " + tarih.getDayOfWeek());        // FRIDAY - haftanin angi gununde oldugumuz
        System.out.println("tarih.getDayOfWeek().getValue() = " + tarih.getDayOfWeek().getValue());  // haftanin kacinci gunu?
        System.out.println("tarih.getDayOfYear() = " + tarih.getDayOfYear());        // 13 - yilin kacinci gununde oldugumuz


        // kendisindeki hazir formatlara bakalim

        System.out.println("ISO_DATE = " + tarih.format(DateTimeFormatter.ISO_DATE));                             // o gunun tarihini verir. - 2023-01-13
        System.out.println("SHORT = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));      // o gunun tarihini kisa sekilde verir - 1/13/23
        System.out.println("MEDIUM = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));    // o gunun tarihini orta uzunlukta verir - Jan 13,2023
        System.out.println("LONG = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));        // o gunun tarihini uzun uuznlukta verir - JAnuary 13, 2023
        System.out.println("FULL = " + tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));        // o gunun tarihini full verir - Friday, January 13, 2023

        System.out.println("\n*************");
        // localde aldigim tarihi istedigim ulkenin formatina gore, diline gore nasil gosteririm?
        // ornegin localdeki saati ALmanya ya nasil gosteririz.

        System.out.println("FULL Almanya gosterimi =\n");
        tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN));

        // lokalizasyon tanimlamasi
        // en-US: birincisi DILI, ikincisi ulkeyi temsil ediyor.
        // en-UK: UK ingilizcesi
        // fr-CA: Kanada Fransizcasi
        // en-CA:
        // tr-TR:

        Locale[] kullanilabilirLokaller = Locale.getAvailableLocales();

        for ( Locale l : kullanilabilirLokaller){

            if ( l.getDisplayCountry().toLowerCase().contains("chi")) {

                System.out.print("Dil = " + l.getDisplayLanguage());
                System.out.print(", Ulke = " + l.getDisplayCountry());
                System.out.print(",  " + l.getLanguage());
                System.out.println(" - " + l.getCountry());

            }
        }

        Locale lokalCince = new Locale ("zh", "CN");
        System.out.println("FULL Cince gosterimi =\n" +
                tarih.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(lokalCince)));


        System.out.println("\n************istedigim formatta gosterim************");
        System.out.println("tarih = " + tarih);

        DateTimeFormatter ozelFormat1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");   // pattern = modern,kalip,desen
        System.out.println("tarih dd/MM/yyy = " + tarih.format(ozelFormat1));

        DateTimeFormatter oz2 = DateTimeFormatter.ofPattern("d.M.yy");
        System.out.println("tarih d.M.yy = " + tarih.format(oz2));

        DateTimeFormatter oz3= DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");  // gunu de ekliyor - EEEE ile
        System.out.println("ozel format ve loc EEEE dd.MM.yyyy = " + tarih.format(oz3.withLocale(Locale.UK)));

        DateTimeFormatter oz4 = DateTimeFormatter.ofPattern("EE dd.MM.yyyy");  // gunu kisa olarak ekliyor
        System.out.println("tarih EE dd.MM.yyyy = " + tarih.format(oz4));

        DateTimeFormatter oz5 = DateTimeFormatter.ofPattern("MMMM dd.MM.yyyy");  // ayi ekleyerek yaziyor
        System.out.println("tarih MMMM dd.MM.yyyy = " + tarih.format(oz5));

        System.out.println("\n***********************");
        // kendimiz bir tarihi nasil set edebilriiz, olusturuabiliriz, int sayi=5

        LocalDate tarih1=LocalDate.of(1993,7,16);
        LocalDate tarih2= LocalDate.of(1999, Month.MARCH,12);

        System.out.println("tarih1 = " + tarih1);                                          // 1993-07-16
        System.out.println(tarih1.format(oz4));                                            // Fri 16.07.1993
        System.out.println("tarih2.format(ozelFormat1) = " + tarih2.format(ozelFormat1));  // 12/03/1999

    }
}
