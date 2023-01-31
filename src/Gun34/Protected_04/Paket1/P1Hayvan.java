package Gun34.Protected_04.Paket1;

public class P1Hayvan {

    public String ad;          // her paketten, her yerden erisilebilinir
    int yas;                   // sadece bulundugu pakettekiler erisebilir
    protected String cinsi;    // default gibi, diger paketlerden erisilmez
    private String renk;       // sadece bulundugu class dan ersilebilinir.


}
