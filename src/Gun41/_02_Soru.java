package Gun41;

import Gun39.MyFunc;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class _02_Soru {
    public static void main(String[] args) {

        // canli dijital saat yapiniz

        DateTimeFormatter f = DateTimeFormatter.ofPattern("kk:mm:ss");  // benim verecegim sekle gore yaz demek istiyorsak -> ofPattern

        while (true) {

            LocalTime saat= LocalTime.now();
            System.out.print("\r" + saat.format(f));
            MyFunc.Bekle(1);
        }


    }
}
