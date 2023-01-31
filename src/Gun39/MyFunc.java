package Gun39;

public class MyFunc {

    public static void Bekle(int sn) {

        try {
        Thread.sleep(1000 * sn);  // ms bekledigi
    } catch( InterruptedException e ) {
        throw new RuntimeException(e);
        }
    }
}
