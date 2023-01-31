package Gun47;

public class S87 {
    public static void main(String[] args) {

        int n[][] = {{1,3},{2,4}};

        for (int i = n.length-1; i >= 0; i--) {            // i -> 1,0 alir
            for (int j = n[i].length-1; j >=0; j--) {      // n[1].lenght ve n[0].lenght, j -> 1,0 alir
                System.out.print(n[i][j]);               // [1][1], [1][0], [0][1] [0][0]
            }
        }
    }
}
