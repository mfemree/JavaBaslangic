package Gun34.Ornek_02;

public class Okul {
    public static void main(String[] args) {

        LiseOgrencisi lo1 = new LiseOgrencisi("Ismet Temur", OgrTip.LISE, "Sayisal");
        LiseOgrencisi lo2 = new LiseOgrencisi("Mehmet Yilmaz", OgrTip.LISE, "Sozel");
        IlkOgrencisi io = new IlkOgrencisi("ayse bayrak", OgrTip.ILK, "Satranc");

        System.out.println("lo1 = " + lo1);
        System.out.println("lo2 = " + lo2);
        System.out.println("io = " + io);

    }
}
