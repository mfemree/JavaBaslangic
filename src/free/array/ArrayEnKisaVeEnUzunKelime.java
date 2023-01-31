package free.array;

public class ArrayEnKisaVeEnUzunKelime {
    public static void main(String[] args) {

        // verilen string bir arraydeki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun


        String [] arr = {"Hasan", "Adem", "Senturk", "Omer", "Faruk"};

        enUzunveEnkisaYazdir(arr);

    }

    public static void enUzunveEnkisaYazdir (String [] arr ){

        String enUzunKelime=arr[0];
        String enKisaKelime= arr[0];


        for (int i = 1; i < arr.length; i++) {

            if (arr[i].length() > enUzunKelime.length() ){
                enUzunKelime= arr[i];
            }

            if ( arr[i].length() < enKisaKelime.length()){

                enKisaKelime= arr[i];
            }

        }

        System.out.println("enKisaKelime = " + enKisaKelime);
        System.out.println("enUzunKelime = " + enUzunKelime);

    }

}
