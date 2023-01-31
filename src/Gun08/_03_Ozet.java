package Gun08;

public class _03_Ozet {
    public static void main(String[] args) {

        int sayac=0;
        int toplam=0;

        // sayac= sayac +1;
        // toplam= toplam+sayac;

        toplam= toplam+ ++sayac; // once artis sonra islem
        toplam= toplam+ sayac++; // once islem sonra artis


        System.out.println("toplam = " + toplam); // 1
        System.out.println("sayac = " + sayac); // 1



    }
}
