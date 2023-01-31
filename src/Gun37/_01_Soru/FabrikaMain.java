package Gun37._01_Soru;

import java.util.ArrayList;
import java.util.Collections;

public class FabrikaMain {
    public static void main(String[] args) {

        TeslaCar tesla = new TeslaCar(310, "model 5");
        ToyotaPirus pirus = new ToyotaPirus(1200, "sedan");
        Bus bus = new Bus (7000, "IVECO"  );

        ArrayList<Vehicle> araclar = new ArrayList<>();
        Collections.addAll(araclar, tesla,pirus,bus);

        for ( Vehicle v : araclar ){
            System.out.println("----------------------");
            System.out.println(v.getClass().getSimpleName());  // class in adini verir
            System.out.println("----------------------");

            System.out.println("v.getModel() = " + v.getModel());
            System.out.println("v.getEngine() = " + v.getEngine());

            if ( v instanceof TeslaCar ) {
                // eger sen TeslaCar'dan geliyorsan, yani TeslaCarín bir ornegi isen asagidakileri yazdir
                System.out.println(((TeslaCar) v).drive());
                System.out.println(((TeslaCar) v).changeBattery());
            }
            else
                if ( v instanceof ToyotaPirus ) {
                    // degilsen ToyotaPirus'un bir ornegi misin ona bak
                    // Eger ToyotaPirus'dan geliyorsan asagidaki methodlarini yazdir
                    System.out.println(((ToyotaPirus) v).drive());
                    System.out.println(((ToyotaPirus) v).changeBattery());
                    System.out.println(((ToyotaPirus) v).changeOil());
                }
                else
                    if ( v instanceof Bus ) {
                        System.out.println( ((Bus) v).drive() );
                        System.out.println( ((Bus) v).changeDiesel() );
                    }
        }
    }
}
