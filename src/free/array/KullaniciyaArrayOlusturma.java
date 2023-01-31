package free.array;

import java.util.Arrays;
import java.util.Scanner;

public class KullaniciyaArrayOlusturma {
    public static void main(String[] args) {

        // kullanicidan arrayin boyutunu ve elementini alip arrayi olusuturun
        // ve bize donduren bir method olusturun

        int[] kullaniciArrayi= arrayOlustur();
        System.out.println(Arrays.toString(kullaniciArrayi));

    }
    public static int [] arrayOlustur ( ){

        // bir parametre yok, girmiyoruz. NEden?
        // Cunku main methoddan oraya gonderecegimiz bir sey yok ve tum bilgileri kullanicidan alacagiz

        Scanner scan= new Scanner( System.in);
        System.out.print("olusturulacak array in boyutunu giriniz= ");

        int lenght= scan.nextInt();
        int [] kullaniciArrayi = new int [lenght];

        for (int i = 0; i <lenght; i++) {

            System.out.print("arraye eklenecek bir sayi giriniz= ");
            kullaniciArrayi[i] = scan.nextInt();

        }
        return kullaniciArrayi;
    }

}
