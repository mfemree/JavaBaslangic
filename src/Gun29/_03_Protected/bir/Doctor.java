package Gun29._03_Protected.bir;

public class Doctor {

    protected String adi;   // default ile ayni
                            // sadece kendi klasorunden ulasilir

    String bolumu;             //  default

    private String SicilNo;    //  private

    public String hastaneAd;    // public


    Doctor () {  // default constructor
                // hic bor sey yazilmazsa default sayilir
                // sadece kendi klasorunden ulasilir

    }

    public Doctor ( String adi ) {

        this.adi=adi;
    }
}
