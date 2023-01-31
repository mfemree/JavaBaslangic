package Gun33._03_Inharitance;

public class GenelMudur extends Calisan {

    private double tazminat;

    public GenelMudur(String isim, double maas, double maasKatSayisi, double tazminat) {
        super(isim, maas, maasKatSayisi);
        setTazminat(tazminat);
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla();
    }

    public double getTazminat() {
        return this.tazminat;
    }

    public void setTazminat(double tazminat) {
        this.tazminat = tazminat;
    }




    @Override
    public String toString() {
        return "GenelMudur{" +
                " isim= " + getIsim() +
                " maas= " + getMaas() +
                " maasKatsayisi= " + getMaasKatSayisi() +
                " tazminat= " + getTazminat() +
                " odenecek Maas= " + maasHesapla() +
                '}';
    }
}
