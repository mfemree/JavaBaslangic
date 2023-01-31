package Gun41;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class _02_StringToLocalDateAndTimeParse {
    public static void main(String[] args) {

        // Kullanicidan alinan ve string durumundaki time veya tarih
        // bilgisinin time veya tarih bilgisine cevrilmesi

        long startTime = System.currentTimeMillis();  // kodun performansi

        Scanner oku = new Scanner(System.in);
        System.out.println("Tarih giriniz (25 01 2023 )= ");
        String strTarih=oku.nextLine();

        // kullanicinin girecegi formata gore format olusturduk
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd MM yyyy");

        // Stringin formati bu formata uygun olmali. parse ile cevirdik
        LocalDate tarih = LocalDate.parse(strTarih,f);

        System.out.println("tarih = " + tarih.format(f));

        long finishTime = System.currentTimeMillis();

        System.out.println("gecen sure = " + (finishTime-startTime) + " msn" );
    }
}
