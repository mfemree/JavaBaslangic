package Gun06;

public class _09_StringTrim {
    public static void main(String[] args) {

        // trim: String basindaki ve sonuncaki bosluklari alir

        String text= "    Merhaba Dunya   ";

        System.out.println("text = ->" + text + "<-");
        System.out.println("text = ->" + text.trim() + "<-");

        System.out.println("text = " + text);                  //  text =     Merhaba Dunya
        System.out.println("text.trim() = " + text.trim());    //  text.trim() = Merhaba Dunya

    }
}
