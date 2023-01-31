package ODEVLER.hw_abstract._4_Soru;

public class Main {
    public static void main(String[] args) {

        Circle c1 = new Circle();
        c1.setRadius(5);
        System.out.println(" daire alan = " + c1.getRadius());

        Rectangle r1= new Rectangle();
        r1.setLenght(5);
        r1.setWidth(10);
        System.out.println("dikdortgen alan= " + r1.getArea());

    }
}
