package Gun39._04_OOP_Soru;

class C {   // dede
    public C() {
        // super();  // burda gorunmese de super class var. o yuzden once hep bu calisir
        System.out.println("C");
    }
}

class B extends C {   // baba
    public B() {
        // super();  // burda gorunmese de super class var. o yuzden once hep bu calisir
        System.out.println("B");
    }
}

class A extends B {   // evlat
    public A () {
        // super();  // burda gorunmese de super class var. o yuzden once hep bu calisir
        System.out.println("A");
    }
}



public class Soru {
    public static void main(String[] args) {

        A a = new A();

    }
}
