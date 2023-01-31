package Gun39._05_OOP_Soru;

public class Palov implements IFood {

    void fry(){
        System.out.println("pirinc ve sehriye kavruldu");

    }

    void boil (){
        System.out.println("kisik ateste pisiirildi");

    }

    @Override
    public void taste() {
        System.out.println("cocuklarin vazgecilmezi");

    }

    @Override
    public double ucret() {
    return 20;
    }
}
