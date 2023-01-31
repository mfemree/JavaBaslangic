package ODEVLER.hw_11_12_2022_Metodlar;

public class hw_11_12_2022_soru1 {
    public static void main(String[] args) {

//        1 -Ismi **randomNum **olan bir method oluşturun.
//             Parametre olarak **int max**almalı.
//             Bu method, 0 ile max arasında random bir değer döndürmelidir.
//             Random numarayı döndürünüz.


        System.out.println("randomNum = " + randomNum());

        // hocanin yaptigi
        System.out.println(randomNum2(10));

    }
        public static int randomNum() {

            int max= Integer.MAX_VALUE;

            int random = (int) (Math.random() * max);
            return random;

    }

    // hocanin yaptigi

    public static int randomNum2 ( int max ) {

        return (int) (Math.random()*max);
    }


}