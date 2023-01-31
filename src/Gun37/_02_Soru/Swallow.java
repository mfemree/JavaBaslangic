package Gun37._02_Soru;

public class Swallow extends Animal implements IFlying {

    public Swallow(String cinsi, String neredeYasar) {
        super(cinsi, neredeYasar);
    }

    @Override
    public String food() {
        return "Kırlangıçlar genellikle böcekler ve meyvelerle beslenir...";
    }

    @Override
    public String flying() {
        return "Kırlangıçlar ortalama hiç durmadan havada 8 saate kadar uçabilirler...";
    }
}
