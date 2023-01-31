package Gun37._02_Soru;

public class Shark extends Animal implements ISailing {

    public Shark(String cinsi, String neredeYasar) {
        super(cinsi, neredeYasar);
    }

    @Override
    public String food() {
        return "Köpek balıkları çoğunlukla diğer balıklar ve deniz canlıları ile beslenir...";
    }

    @Override
    public String sailing() {
        return "Köpek balıklarının ömürleri boyunca yüzmek zorunda oldukları aksi halde batacakları hakkında bir iddia internet aleminde dolaşmaktadır...";
    }
}
