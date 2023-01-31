package Gun24;

import java.util.HashMap;
import java.util.Map;

public class _03_JavaMAp {
    public static void main(String[] args) {

        // bir kartvizit uygulamasini 2 kisi icin yapiniz

        HashMap<String , String> uKartvizit = new HashMap<>();

        uKartvizit.put("isim", "Ugur Yilmaz");
        uKartvizit.put("email", "ugur@gmail.com");
        uKartvizit.put("adres", "Cekmekoy/Istanbul");
        uKartvizit.put("telefon", "050564353");

        System.out.println("uKartvizit.get(\"isim\") = " + uKartvizit.get("isim"));
        System.out.println("uKartvizit.get(\"telefon\") = " + uKartvizit.get("telefon"));



        HashMap<String , String> aKartvizit = new HashMap<>();

        aKartvizit.put("isim", "Ayse Bayrak");
        aKartvizit.put("email", "ayse@gmail.com");
        aKartvizit.put("adres", "Sisli/Istanbul");
        aKartvizit.put("telefon", "0505646883");


        HashMap<String,  HashMap<String,String>   > kartvizitler = new HashMap<>();

        kartvizitler.put("ugur", uKartvizit);
        kartvizitler.put("ayse", uKartvizit);

        System.out.println("ugur un kartviziti = " + kartvizitler.get("ugur"));
        System.out.println("ayse nin kartviziti) = " + kartvizitler.get("ayse"));

        System.out.println("aysenin adresi= " + kartvizitler.get("ayse").get("adres"));
        System.out.println("uygur'un telefonu = " + kartvizitler.get("ugur").get("telefon"));

            for (Map.Entry  <String, HashMap<String,String>> kv: kartvizitler.entrySet()){

                System.out.println("emailler = " + kv.getValue().get("email"));
            }

    }
}
