package Gun07;

public class _03_StringIsEmpty {
    public static void main(String[] args) {

        // isEmpty: bir stringin icinde bir sey var mi yok mu boolean olarak verir.

        String s1= "Merhaba";
        System.out.println("s1.isEmpty() = " + s1.isEmpty()); // false

        String s2= " ";
        System.out.println("s2.isEmpty() = " + s2.isEmpty()); // false

        String s3= "";
        System.out.println("s3.isEmpty() = " + s3.isEmpty()); // true

    }
}
