package Gun34.Protected_04.Paket2;

import Gun34.Protected_04.Paket1.P1Hayvan;

public class P2Main {
    public static void main(String[] args) {

        P1Hayvan p1h = new P1Hayvan();
        p1h.ad="kopek";
        // p1h.yas default, diger paketten erisilemez
        // p1h.cinsi protected diger paketten direkt erisemedim.
    }
}
