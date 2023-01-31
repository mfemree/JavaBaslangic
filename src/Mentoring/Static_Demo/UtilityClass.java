package Mentoring.Static_Demo;

import java.util.Collections;

public class UtilityClass {

    // Math Class ini acalim...

    public static String trim(String givenString){
        return givenString.trim();
    }

    public static int convertToInteger(String givenString){  // "8765" -> 8765
        for (Character ch : givenString.toCharArray()){
            if (ch <= 0) // Tekrar giris yapmasini isteyebiliriz...
            if (!Character.isDigit(ch)) return -1;
        }
        return Integer.parseInt(givenString);
    }


}
