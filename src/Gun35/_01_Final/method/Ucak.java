package Gun35._01_Final.method;

public class Ucak extends Araclar {

    public Ucak(String model) {
        super(model);
    }

//    @Override
//    public final String toString() {
//        return "Araclar{" +
//                "model='" + model + '\'' +
//                '}';
//    }

    // Final metodlar degistirilemez
    // yani override edilemez
    // bu yuzden de generate de gozukmez.
    // ama biz buna ragmen israrla extends ettigimiz class dan kopyaladik ve yazmak istedik
    // ama yazamadik

}

