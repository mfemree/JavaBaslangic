package Gun39._05_OOP_Soru;

public class Lahmacun implements IFood {

    void dough(){
        System.out.println("mayali hamur hazirlandi");

    }

    void addMeat() {
        System.out.println("ozel kiyma eklendi");
    }

    void bake() {
        System.out.println("odun atesinde pisiridi");
    }

    @Override
    public void taste() {
        System.out.println("mukemmel yerli pizza");

    }

    @Override
    public double ucret() {
    return 20;
    }
}
