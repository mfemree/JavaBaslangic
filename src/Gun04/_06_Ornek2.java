package Gun04;

public class _06_Ornek2 {

    public static void main(String[] args) {

        // Kişinin ağırlığını double, boyunu int olarak değerler veriniz.
        // ve bir satırda boyunuz ... ve kilonuz ... şeklinde yazrınız.
        // vucut kıtle ındexını de bularak yazdırınız ( kg/ boy*boy)


        double agirlik= 63; // burda sayiyi 63 seklinde yazsak bile java bunu 63.0 olarak algilar  // 63.0
        int boy=168;
        double kitleIndex= agirlik / (boy*boy);

        System.out.println("kitleIndex= " + kitleIndex);
        System.out.println("boyunuz= "+boy+", kilonuz=" +agirlik + "\n");
        //**********************************************//*

        double agirlik2= 75;
        int boy2= 180;
        double kitleIndex2= agirlik2 / (boy2*boy2);

        System.out.println("boy = " + boy2 +" , " + "agirlik = " + agirlik2);
        System.out.println("kitleIndex = " + kitleIndex2);



    }
}
