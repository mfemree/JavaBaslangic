package Gun12;

import java.util.Scanner;

public class _04_Switch {
    public static void main(String[] args) {

        // kullanicinin girdigi gun numarasina karsilik gelen gunun adini yaziniz

        Scanner oku= new Scanner(System.in);
        System.out.println("gun no= ");
        int gunNo= oku.nextInt();

        /*if (gunNo==1)
            System.out.println("pazartesi");
        else
            if (gunNo==2)
                System.out.println("sali");

            .....
            .....*/

        switch (gunNo){

            case 1: System.out.println("pazartesi"); break;
            case 2: System.out.println("sali"); break;
            case 3: System.out.println("carsamba"); break;
            case 4: System.out.println("persembe"); break;
            case 5: System.out.println("cuma"); break;
            case 6: System.out.println("cumartesi"); break;
            case 7: System.out.println("pazar"); break;

            default:    //  case dekilerin disinda ise
                System.out.println("hatali numara");
        }

    }
}
