package Gun37._02_Soru;

public class Duck extends Animal implements ISailing, IFlying {

    public Duck(String cinsi, String neredeYasar) {
        super(cinsi, neredeYasar);
    }

    @Override
    public String food() {
        return "Ördekler marul, maydanoz, brokoli, lahana ve ıspanak gibi yeşilliklerle beslenir. En sevdiği yeşillik ıspanaktır...";
    }

    @Override
    public String sailing() {
        return "Ördeklerin yüzme hızı hakkında net bir bilgi olmamasına rağmen ortalama saatte 30 km/s hıza çıkabilirler.";
    }

    @Override
    public String flying() {
        return "Ördekler belli bir oranda kanat çırparlar ve suyun üzerinde hafif bir süzülme tarzında uçarlar...";
    }
}
