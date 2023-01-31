package Gun47;

public class  MyField {

    int x; // default 0

    int y; // default 0

    public void doStuff ( int x, int y) {   // 100,200

        x=x;       //  parametre parametreye atandi, nesnenin kendisi degismedi. 0
        y=this.y;  //  sagdaki y nesnenin y si, 0 a atandi.

    }

    public void display () {
        System.out.println(x + " " + y + " : ");
    }

    public static void main(String[] args) {

        MyField m1 = new MyField();
        m1.x =100;
        m1.y =200;

        MyField m2 = new MyField();
        m2.doStuff(m1.x, m1.y);     // 100 ve 200 degerleri methoda gitti

        m1.display();  // 100, 200
        m2.display();  // 0, 0


    }
}
