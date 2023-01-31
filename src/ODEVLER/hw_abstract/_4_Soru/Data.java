package ODEVLER.hw_abstract._4_Soru;

public abstract class Data {

    private double radius;
    private double lenght;
    private double width;
    private final double pi=3.14;

//    public Data(double radius, double lenght, double width) {
//       setRadius(radius);
//       setLenght(lenght);
//       setWidth(width);
//    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPi() {
        return pi;
    }

    abstract double getArea();


}
