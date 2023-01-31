package ODEVLER.hw_abstract._4_Soru;

public class Circle extends Data {


    @Override
    double getArea() {
        return getPi() * getRadius() * getRadius();
    }
}
