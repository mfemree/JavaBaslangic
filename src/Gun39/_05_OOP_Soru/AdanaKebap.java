package Gun39._05_OOP_Soru;

public class AdanaKebap implements IFood {

    void marinade() {
        System.out.println("et dunden ozel baharatlandi");
    }

    void grill () {
        System.out.println("komur atesinde yavas yavas pisirilir");
    }


    @Override
    public void taste() {
        System.out.println("etin en guzel hallerinden");

    }

    @Override
    public double ucret() {
    return 75;
    }
}
