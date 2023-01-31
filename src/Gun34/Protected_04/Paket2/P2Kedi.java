package Gun34.Protected_04.Paket2;

import Gun34.Protected_04.Paket1.P1Hayvan;

public class P2Kedi extends P1Hayvan {

    public P2Kedi(String ad, String cinsi) {

        this.ad=ad;
        this.cinsi= cinsi;

        super.cinsi="tekir";  // mesela cinsi'ne ulasabildik.

        // defaulttan farkli olarak
        // extend edildiginde diger paketlerden erisilebilir.
         // yani protected veriable lar extend edildigi class lardan erisilebilirler
    }


}
