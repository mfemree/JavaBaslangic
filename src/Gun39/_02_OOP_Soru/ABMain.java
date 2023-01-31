package Gun39._02_OOP_Soru;

public class ABMain {
    public static void main(String[] args) {

        A a = new A();
        System.out.println(A.mesaj);  // A dan merhaba

        B b = new B();                 // constructor calisti
        System.out.println(A.mesaj);  // B den merhaba

        A a2= new A();
        System.out.println(A.mesaj);  // B den merhaba


    }
}
