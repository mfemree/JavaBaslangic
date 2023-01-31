package Gun29._02_PrivateErisim;

public class Sirket {
    public static void main(String[] args) {

        Calisan cal1 = new Calisan();
        cal1.id=1;
        cal1.name= "ISmet";
        cal1.surname= "Temur";

        // cal1.password = "1234";
        // erisemedik, ayni paketin icinde oldugu halde erisilemiyor.
        // yani artik private kendi paketinden bile cagrilamaz.


        cal1.sifreAta("1234");
        cal1.sifreAta("M123_sdf23");
        cal1.sifreGoster();

    }
}
