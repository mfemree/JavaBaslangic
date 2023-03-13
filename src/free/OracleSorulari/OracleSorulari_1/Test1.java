package free.OracleSorulari.OracleSorulari_1;

public class Test1 {
    int x,y;

    public Test1(int x, int y){

        initialize ( x,y);

         x =  this.x + 1;

        System.out.println(x);
        System.out.println("this x = " + this.x);
    }
    public void initialize (int x, int y) {

        this.x= x*x;  // thisx = 81
        this.y= y*y;

    }

    public static void main(String[] args) {

        int x =9, y=5;
        Test1 obj = new Test1(x,y);

        System.out.println(x + " " + y );          // 9 5
        System.out.println( obj.x + " " + obj.y);  // 81 25
    }
}
