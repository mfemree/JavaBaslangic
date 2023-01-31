package Gun06;

public class _07_StringConcat {
    public static void main(String[] args) {

        String s1= "Merhaba";
        String s2= "Dunya";

        System.out.println("birlesik hali = " + s1+s2);
        System.out.println("birlesik hali = " + s1.concat(s2));
        System.out.println("birlesik hali = " + s1.concat(" ").concat(s2));
        System.out.println("birlesik hali = " + s1.concat(" "+s2));
        System.out.println("birlestirme = " + s1.concat("Venus"));

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);


    }
}
