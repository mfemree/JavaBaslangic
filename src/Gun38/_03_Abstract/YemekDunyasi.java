package Gun38._03_Abstract;

public class YemekDunyasi {
    public static void main(String[] args) {

        Baklava b = new Baklava();
        b.setName("Baklava");
        b.madeIn();
        b.taste();

        GreekSalad g= new GreekSalad();
        g.setName("Greek Salad");
        g.madeIn();
        g.taste();

        SezarSalad s = new SezarSalad();
        s.setName("Sezar Salad");
        s.madeIn();
        s.taste();

        CheeseCake c = new CheeseCake();
        c.setName("Cheese Cake");
        c.madeIn();
        c.taste();


    }
}
