package free;

import java.time.Duration;
import java.time.LocalTime;

public class Durationnn {
    public static void main(String[] args) {

        // Duration: hem LocalTime hem de LocalDateTime arasindaki farki verir.

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(17,0,0);
        LocalTime dersBitis = LocalTime.of(20,0,0);

        Duration gunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("gunlukDersSuresi = " + gunlukDersSuresi);                           // PT 3H
        System.out.println("gunlukDersSuresi.toHours() = " + gunlukDersSuresi.toHours());       // 3 -> saat
        System.out.println("gunlukDersSuresi.toMinutes() = " + gunlukDersSuresi.toMinutes());   // 180 -> dakika
        System.out.println("gunlukDersSuresi.toMillis() = " + gunlukDersSuresi.toMillis());     // 10800000 -> milisn

        // LocalDateTime
        // 2 tarih-saat arasindaki fark



    }
}
