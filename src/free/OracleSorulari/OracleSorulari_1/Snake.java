package free.OracleSorulari.OracleSorulari_1;

public class Snake {

    String result = "done";   //compile error

    public void shed ( boolean time ) {


        String result = "done";

        if ( time ) {

            // String result = "done";   //compile error
        }

        System.out.println(result);

        // String result = "done";   //compile error


    }
}
