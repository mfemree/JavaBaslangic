package Gun39._05_OOP_Soru;

import Gun39.MyFunc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TechnoCafe {
    public static void main(String[] args) {

        List<IFood> siparisler = new ArrayList<>();
        Scanner oku = new Scanner(System.in);
        int secim = 0;
        secim = oku.nextInt();

        do {
            menu();
            switch (secim) {

                case 1:
                    IFood ak = new AdanaKebap();
                    siparisler.add(ak);
                    break;

                case 2:
                    IFood lh = new Lahmacun();
                    siparisler.add(lh);
                    break;

                case 3:
                    IFood b = new Borsh();
                    siparisler.add(b);
                    break;

                case 4:
                    IFood p = new Palov();
                    siparisler.add(p);
                    break;
            }

        } while (secim < 5);

        System.out.println("Alinan Siparisler");
        for (IFood f : siparisler) {
            System.out.println(f.getClass().getSimpleName());  // alinan siparislerin listesi
        }
        System.out.println("Siparisleriniz hazirlaniyor..\n");
        MyFunc.Bekle(2)
        ;
        double toplam = 0;
        for (IFood f : siparisler) {
            TechnoKitchen.hazirla(f);
            toplam += f.ucret();
            MyFunc.Bekle(2);
        }
        System.out.println("toplam ucret=" + toplam);

    }

    public static void menu() {
        System.out.println("\n*******Meunu********" +
                "\n1-Adana Kebap (75 TL)" +
                "\n2-Lahmacun (20 TL)" +
                "\n3-Borsh (40 TL)" +
                "\n4-Palov (20 TL)" +
                "\n5-Tamam" +
                "\n6-Seciminiz=");




    }
}