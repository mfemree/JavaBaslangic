package Gun38._01_Abstract;

public class Ford extends BinekOto {

    // implement diye yazmaya gerek kalmadi
    // direkt implement yazmis gibi bize conctructorlari ve override lari yaptirdi
    // interface si icinde yani.


    public Ford(String marka, int uretimYili, int vitesAdedi) {
        super(marka, uretimYili, vitesAdedi);
    }

    @Override
    int HizlanmaSuresi() {
        return 0;
    }
}
