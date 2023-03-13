package Gun11;

public class _08_JavaRandom {
    public static void main(String[] args) {

        // Math.Random(): double syai uretir 0-0,999999 arasi ( virgulden sonra 15 tane 9 )

        double randSayi= Math.random();

        System.out.println("randSayi = " + randSayi);

        // 0-6 arasi uretsin.
        // 6 ile carparim ( 6 dahil olmaz )
        // 0 - 5,999999
        // int cevirirsem 0-5 arasi verir


        int rndTamSayi= (int) (Math.random() * 6);           //  double sayiyi int seklinde yazdirmis olduk.
        System.out.println("rndTamSayi = " + rndTamSayi);



    }
}
