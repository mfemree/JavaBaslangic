package Gun37._02_Soru;

public class Cat extends Animal implements IAnimal{

    public Cat(String cinsi, String neredeYasar) {
        super(cinsi, neredeYasar);
    }

    @Override
    public String food() {
        return "Kediler genellikle et, süt gibi hayvansal gıdalardan beslenir...";
    }
}
