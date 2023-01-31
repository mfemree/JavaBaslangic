package Gun28._01_Constructor;

public class Okul {
    public static void main(String[] args) {

        // 1.yol

        Ogrenci ogr1 = new Ogrenci();    // nesne olusma ani

        ogr1.ID=1;
        ogr1.ad="ismet";
        ogr1.soyad="temur";
        ogr1.sinifi=5;
        System.out.println("ogr1 = " + ogr1.ad);


        // 2.yol

        Ogrenci ogr2= new Ogrenci(2, "Mustafa" , "US" ,5);
        System.out.println("ogr2 = " + ogr2.ad);


        // 3.yol

        Ogrenci ogr3 = new Ogrenci(2,"Ayse","Bayrak");

    }

}
