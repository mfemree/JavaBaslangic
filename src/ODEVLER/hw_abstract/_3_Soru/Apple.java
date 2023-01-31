package ODEVLER.hw_abstract._3_Soru;

public class Apple extends Phone {

    @Override
    void options(String a, String b) {

        if ( a.equalsIgnoreCase("1") && b.equalsIgnoreCase("1") ){
            cart.add("$750");
        } else if ( a.equalsIgnoreCase("1") && b.equalsIgnoreCase("2")){
            cart.add("$850");
        } else if ( a.equalsIgnoreCase("2") && b.equalsIgnoreCase("1")){
            cart.add("$950");
        }    else if (a.equalsIgnoreCase("2") && b.equalsIgnoreCase("2")){
            cart.add("$1200");
        }
    }

    static void menuMemory() {
        System.out.println("******* APPLE MEMORY MENU *******\n"
                            + "1 - 64 GB\n"
                            + "2 - 128 GB" );
    }

    static void menuSize() {
        System.out.println("******* APPLE SIZE MENU *******\n"
                            + "1 - 5.5 inch\n"
                            + "2 - 6.5 inch" );

    }
}
