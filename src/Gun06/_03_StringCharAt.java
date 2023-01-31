package Gun06;

public class _03_StringCharAt {
    public static void main(String[] args) {

        // Istenilen noktadaki karakteri verir
        // karakterin kacinci sirada oldugunu soyler
        // karakterlerin sirasi 0 dan baslar ve buna index denir.

        // 0123456789 10 11 12
        String cumle = "Merhaba Dunya"; // Length 13 ama karakterlerin odasi 0-12 dahil

        char ilkHarf = cumle.charAt(0);
        System.out.println("ilkHarf =" + ilkHarf);



    }
}
