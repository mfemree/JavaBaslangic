package Gun30._01_StaticVeriables.Ornek2;

public class School {
    public static void main(String[] args) {

        Student ogr1 = new Student(1, "ismet temur");
        Student ogr2 = new Student(2, "ali ural");
        Student ogr3 = new Student(3, "emre us");

        // problem: her id yi takip etmek zorundayim
        // hem de hata olasiligi yuksek

        Student ogr10 = new Student("ismet temur");
        Student ogr11 = new Student("ali ural");
        Student ogr12 = new Student("emre us");

        System.out.println("ogr10 = " + ogr10);
        System.out.println("ogr11 = " + ogr11);
        System.out.println("ogr12 = " + ogr12);

    }
}
