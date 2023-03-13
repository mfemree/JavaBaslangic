package Gun06;

public class _08_StringContains {
    public static void main(String[] args) {

        // contains: bir stringin icerisinde karakter(lerin) var olup
        // olmadigini boolean cinsinden soyle true veya false

        String cumle= "Merhaba Dunya";

        boolean varMi= cumle.contains("a");
        System.out.println("Var mi? = " + varMi);

        // direkt de yapabilirisniz,

        System.out.println("Var Mi? = " + cumle.contains("a"));
        System.out.println("ya varMi? = " + cumle.contains("ya"));
        System.out.println("k varMi? = " + cumle.contains("k"));
        System.out.println("cumle.contains(\"z\") = " + cumle.contains("z"));


    }
}
