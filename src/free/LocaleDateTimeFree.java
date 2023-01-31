package free;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleDateTimeFree {
    public static void main(String[] args) {

      LocalDate date = LocalDate.now();

        System.out.println("date = " + date);
        System.out.println("date.getYear() = " + date.getYear());
        System.out.println("date.getMonth() = " + date.getMonth());
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println("date.getDayOfYear() = " + date.getDayOfYear());
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
        System.out.println("date.getDayOfWeek().getValue() = " + date.getDayOfWeek().getValue());

        // kendisindeki hazir formatlara bakalim

        System.out.println("date.format(DateTimeFormatter.ISO_DATE) = " + date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println(date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN)));

        System.out.println("*****************************************\n");


      LocalTime time = LocalTime.now();

      System.out.println("time = " + time);
      System.out.println("time.getHour() = " + time.getHour());   // saati veriyor
      System.out.println("time.getMinute() = " + time.getMinute());  // dakikayi veriyor
      System.out.println("time.getSecond() = " + time.getSecond());  // saniyeyi veriyor
      System.out.println("time.getNano() = " + time.getNano());      // nano - ms yi veriyor


      DateTimeFormatter format1 = DateTimeFormatter.ofPattern("hh:mm a");    // h olunca 0-12 arasi cinsinde yazdirir
      System.out.println("hh:mm a= " + time.format(format1));                // 01:02 PM

      DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm a");    // HH olunca 0-24 arasi cinsinde yazdirir
      System.out.println("HH:mm a= " + time.format(format2));                // 13:02 PM

      DateTimeFormatter format3= DateTimeFormatter.ofPattern("kk:mm");       // kk olunca 1-24 arasi cinsinden yazdirir
      System.out.println("kk:mm= " + time.format(format3));                  // 13:02

      DateTimeFormatter format4 = DateTimeFormatter.ofPattern("KK:mm");      // KK olunca 0-11 arasi cinsinden yazdirir
      System.out.println("KK:mm= " + time.format(format4));                  // 01:02

      LocalTime saat1 = LocalTime.of(17,25);                      // saati, dk'yi veya sn'yi vererek kendimiz yazdiriyoruz saati
      System.out.println("saat1.format(format2) = " + saat1.format(format2)); //  17:25 PM

      System.out.println("*****************************************\n");

      LocalDateTime dt = LocalDateTime.now();

      System.out.println("dt = " + dt);
      System.out.println("dt.getHour() = " + dt.getHour());
      // date'le time'i ayni anda gosteriyor.

      System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
      System.out.println("SHORT DATE: " + dt.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
      System.out.println("SHORT DATE and TIME: " + dt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));

      // ozel formatta istedigimiz gibi
      DateTimeFormatter f = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
      System.out.println("dt.format(f) = " + dt.format(f));

    }
}
