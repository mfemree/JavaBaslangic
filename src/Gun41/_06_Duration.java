package Gun41;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class _06_Duration {
    public static void main(String[] args) {

        // Duration : hem LocalTime hem de LocalDateTime arasindaki farki verir.

        // LocalTime
        LocalTime dersBaslangic = LocalTime.of(19,0,0);
        LocalTime dersBitis = LocalTime.of(22,0,0);

        Duration GunlukDersSuresi = Duration.between(dersBaslangic,dersBitis);
        System.out.println("GunlukDersSuresi = " + GunlukDersSuresi);

        System.out.println("GunlukDersSuresi.toHours() = " + GunlukDersSuresi.toHours()); // farkin toplam saat hali
        System.out.println("GunlukDersSuresi.toMinutes() = " + GunlukDersSuresi.toMinutes()); // farkin toplam dakika hali
        System.out.println("GunlukDersSuresi.toMillis() = " + GunlukDersSuresi.toMillis()); // farkin toplam milisaniye hali


        // LocalDateTime *** 2 Tarih-saat arasindaki fark ***
        LocalDateTime from = LocalDateTime.of(2023,1,1,0,0);
        LocalDateTime to = LocalDateTime.now();  // bugun

        Duration farkZaman = Duration.between(from,to);  // iki tarih arasindaki fark
        System.out.println("farkZaman = " + farkZaman);  //  PT 304H 38M 46.5295308S
        System.out.println("farkZaman.toDays() = " + farkZaman.toDays());        // farkin toplam gunu - toplam kac gun gecmis
        System.out.println("farkZaman.toHours() = " + farkZaman.toHours());      // farkin toplam saati - toplam kac saat gecmis
        System.out.println("farkZaman.toMinutes() = " + farkZaman.toMinutes());  // farkin toplam dakikasi - toplam kac dk gecmis

        // 1000 -> mili
        // 100 000 -> micro
        // 100 000 000 -> nano


    }
}
