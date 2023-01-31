package Gun43;

public class _01_JavaException {
    public static void main(String[] args) {


        System.out.println("program calismaya basladi");
        String kelime="";  // once ; koymadik, bu compile error.
        char harf= kelime.charAt(3); // bu satiri en son ekledik, bu RUNTIME error
        System.out.println("program bitti");


        // daha çalışmadan önce oluşmuş eksikliklerden kaynaklı hatalara
        // Derleme zamanı yani COMPILE ERROR, Exception diyoruz.

        //program çalıştıktan sonra çalışma zamanı içerisindeki hatalara
        //çalışma zamanı yani RUNTIME ERROR, Exception diyoruz.



    }
}
