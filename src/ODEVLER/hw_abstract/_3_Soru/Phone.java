package ODEVLER.hw_abstract._3_Soru;

import java.util.ArrayList;

public abstract class Phone {

    static ArrayList<String> cart = new ArrayList<>();

    static int getSum ( ArrayList<String> list) {
        int toplam=0;
        for (String text : list ) {
            text = text.replaceAll( "[^0-9]", "");
            int value = Integer.parseInt(text);
            toplam += value;
        }
        return toplam;
    }

    abstract void options (String a, String b );

}
