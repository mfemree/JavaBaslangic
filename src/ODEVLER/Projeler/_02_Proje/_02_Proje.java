package ODEVLER.Projeler._02_Proje;

import java.util.*;

public class _02_Proje {

    public static void main(String[] args) {

        // Scanner Class tanimlayin...
        Scanner strScan = new Scanner(System.in);
        Scanner intScan = new Scanner(System.in);

        // Banka Islemleri Listesi tanimlayin..."Para_Yatir", "Para_Cek", "Transfer", "Hesap_Ac"...
        List<String> actions = new ArrayList<>(Arrays.asList("Para_Yatir", "Para_Cek", "Transfer", "Cikis"));

        // Banka musterileri kullanici adi listesi tanimlayin..."User1", "User2", "User3"...
        ArrayList<String> userNames = new ArrayList<>(Arrays.asList("User1", "User2", "User3"));
        // Banka musterileri sifreleri listesi tanimlayin..."password1", "password2", "password3"...
        ArrayList<String> passwords = new ArrayList<>(Arrays.asList("password1", "password2", "password3"));

        // Banka musterilerine ait banka hesap numaralari listesi tanimlayin.."1234", "5678", "9999"
        ArrayList<String> accountsNumber = new ArrayList<>();
        Collections.addAll(accountsNumber, "1234", "5678", "9999");

        // Banka musterilerine ait banka hesaplarinda bulunan para miktarlarini tanimlayin...200, 1000, 5000
        ArrayList<Integer> balances = new ArrayList<>();
        balances.add(200);
        balances.add(3000);
        balances.add(2000);

        // TODO ONEMLI NOT : Yukarida gireceginiz listelerdeki veriler index numarasina gore birbirleri ile iliskilidir
        // TODO Mesela -> 'User1' in passwordu 'password1', hesap numarasi '1234' ve hesabiundaki para miktari '200' dur...


        while (true) {

        /* Sonsuz bir dongu icerisinde kullanicidan username ve password girmesini isteyelim...
         Konsoldan girilen username ve passwordu confirmUsernameAndPassword() methodunu cagirarak teyit edelim...
         Eger dogru username ve password girilmis ise "Basarili bir sekilde giris yaptiniz" mesaji yazdirarak yapmak istedigi islemi soralim ...
         Kayitli olmayan username ve password girilmis ise "Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin" mesaji
         gosterip kullaniciyi tekrar username ve password girisine geri dondurelim.. */

            System.out.print("Username: ");
            String userName = strScan.nextLine();
            System.out.print("Password: ");
            String password = intScan.nextLine();

            boolean isThatTrue = confirmUsernameAndPassword(userNames, passwords, userName, password);

            if (isThatTrue) {
                System.out.println("Basarili bir şekilde giriş yaptınız...");

                System.out.println();
                break;
            } else
                System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }


        int userChoose;

        while (true) {
            System.out.println("Yapmak istediğiniz işlemi seçiniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i) + " - " + (i + 1));
            }

            userChoose = intScan.nextInt();

            switch (userChoose) {

                case 1:
                    System.out.println("Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz");
                    break;
                case 2:
                    boolean isTrue = true;
                    String accountNo;
                    do {
                        System.out.println("Hangi hesaptan para cekmek istiyorsunuz?");

                        for (int i = 0; i < accountsNumber.size(); i++) {
                            System.out.println(accountsNumber.get(i));
                        }
                        accountNo = strScan.nextLine();
                        for (int i = 0; i < accountsNumber.size(); i++) {
                            if (accountsNumber.get(i).equals(accountNo)) {
                                isTrue = false;
                                break;
                            } else if (i == accountsNumber.size() - 1) {
                                System.out.println("Hatalı bir hesap numarası girdiniz... Tekrar deneyiniz...");
                            }
                        }

                    } while (isTrue);

                    System.out.println("Ne kadar para çekmek istiyorsunuz...");
                    int amount = intScan.nextInt();
                    withdraw(accountsNumber, balances, accountNo, amount);
                    break;
                case 3:
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                case 4:
                    System.out.println("Çıkış yapıldı...");
                    System.exit(1);
                default:
                    System.out.println("Basarili bir secim yapmadiniz...");

            }


        }


    /*
        while (true){

         Secim hatali ise "Basarili bir secim yapmadiniz..." ikazi vererek tekrar secim yapmasini isteyelim..
         Dogru bir secim yapildiginda kullanici tarafindan secilen islem SWITCH Statements vasitasiyla koda aktarilsin
         Case 1: "Bu bankamatik gecici olarak para yatirma islemine kapalidir...Uzgunuz" ikazi versin..
         Case 2: "Hangi hesaptan para cekmek istiyorsunuz?" diye kullaniciya sorsun
                  Hesap numaralarini yukaridaki List ten alarak ekrana yazdirin.. Kullanici sectigi hesap numarasini tuslasin..
                 "Ne kadar para cekmek istiyorsunuz?" diye soralim..Kullanici girdisini alalim...
                  asagida bulunan withdraw() methodunu cagirarak hesaptan para cekme islemini tamamlayalim...
                  tekrar islemler dongusune geri donelim...
         Case 3: "Bu islemi su an gerceklestiremiyoruz..." diyerek basa donsun..
         Case 4:  System.exit(1);  buradaki kodu case 4 e aynen kopyalayip yapistirin...
         default:"Basarili bir secim yapmadiniz..." mesaji versin..

    */
       /* System.out.println("Yapmak istediginiz islemi seciniz...");
        for (int i = 0; i < actions.size(); i++) {
            System.out.println(actions.get(i) + " - " + (i + 1));
        }
        int userChoice = scan.nextInt();

        switch (userChoice) {
            case 1: {


            }
            case 2: {


            }
            case 3: {


            }
            case 4:
                System.exit(1);

            default: {
                System.out.println("Basarili bir secim yapmadiniz...");
            }

        }
       /*
        }
       */
    }

    public static boolean confirmUsernameAndPassword(ArrayList<String> userNames, ArrayList<String> passwords, String username, String password) {
        boolean dogruMu = true;
        for (int i = 0; i < userNames.size(); i++) {
            if (userNames.get(i).equals(username) && passwords.get(i).equals(password)) {
                dogruMu = true;
                break;
            } else {
                dogruMu = false;
            }
        }
        return dogruMu;
    }

    public static void withdraw(ArrayList<String> accountsNumber, ArrayList<Integer> balances, String accountNo, int amount) {

        for (int i = 0; i < balances.size(); i++) {

            if (accountsNumber.get(i).equals(accountNo) && balances.get(i) >= amount) {
                System.out.print("Lütfen paranızı alınız, ");
                balances.set(i, (balances.get(i) - amount));
                System.out.println(accountsNumber.get(i) + " nolu hesabınızda " + balances.get(i) + " kaldı.");
                break;
            } else if (i == balances.size() - 1) {
                System.out.println("Hesabınızda yeterli bakiye bulunmamaktadır.");
            }
        }
    }

    /* private static void withdraw(List<String> accounts, List<Integer> funds, String chosenAccount, int amountToWithdraw) {

        /*
        Bu method parametre olarak aldigi accounts (hesaplar) ve funds (hesapta bulunan para miktarlari) listelerinde bulunan degerleri
        kullanici tarafindan girilen degerler ile birlikte kullanabilmek icin olusturulmusutur...
        Mesela : Kullanici 1234 numarali hesaptan para cekmek istemis ise, hangi hesaptan para cekilecegini ve cekilecek para miktarini
        hesap bakiyesinden dusebilmek icin hangi index numarali hesap oldugu bulunmali, ayni index e sahip para miktari funds listesinden
        eksiltilerek kullaniciya hesabinda kalan para miktari belitilmalidir..

        Eger kullanici hesap numarasini yanlis girmisse veya hesabinda bulunan para miktari yeterli degilse
        "Beklenmedik bir hata olustu...Iyi gunler dileriz..." ikazi vermelidir...

    } */

    /* private static boolean confirmUsernameAndPassword(List<String> users, List<String> passwords, String username, String password) {

    /*
        Kullanici yukarida olusturdugumuz kullanici adi ve password lerden birini girmez ise bu method FALSE dondurmelidir..
        Buna gore verile parametreleri kullanarak kullanici teyitini yapiniz..

        return false;
    }  */

}
