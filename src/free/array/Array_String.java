package free.array;

import java.util.Arrays;

public class Array_String {
    public static void main(String[] args) {

        // String array

        String [] arr= {"ali", "ulus", "nesrin"};

        for (int i = 0; i <arr.length; i++) {

            System.out.print( arr[i] + " ");                // normal element olarak yazdirdi
                                                            //  ali ulus nesrin
        }

        System.out.println("arr = " + arr);              // array bir obje / non-primitive data oldugundan java referansini yazdirir
                                                         // array'i array olarak yazdirmak istersek Arrays class"indan yardim almaliyiz

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));    //  [ali, ulus, nesrin]

    }



}
