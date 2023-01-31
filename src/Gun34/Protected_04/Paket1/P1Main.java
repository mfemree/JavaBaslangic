package Gun34.Protected_04.Paket1;

public class P1Main {
    public static void main(String[] args) {

        P1Hayvan p1h = new P1Hayvan();
        p1h.ad="karakedi";  // public erisildi
        p1h.yas=2; // default erisildi
        p1h.cinsi= "tekir"; // protected erisildi
        // p1h.renk private old icin erisilmedi. sadece kendi class indan erisilir




    }
}
