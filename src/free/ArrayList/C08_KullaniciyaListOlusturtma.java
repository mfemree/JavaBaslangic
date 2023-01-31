package free.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturtma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar isim alip
        // Q ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun

        ListeOlustur();

    }

    public static ArrayList<String> ListeOlustur (){

    ArrayList<String> isimler = new ArrayList<>();

    Scanner scan= new Scanner(System.in);
    String girilenIsim="";



    while (!girilenIsim.equalsIgnoreCase("q")){

        System.out.println("islemi sonlandirmak icin Q ya basiniz.");
        System.out.print("lutfen listeye eklemek icin isim giriniz= " );


        girilenIsim= scan.nextLine();


        if (!girilenIsim.equalsIgnoreCase("q")){
            isimler.add(girilenIsim);

        }

    }
        System.out.println(isimler);
        return isimler;

    }

}
