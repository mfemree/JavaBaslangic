package ODEVLER.Projeler._06_Proje;

import java.util.Scanner;

public class Proje_06 {

    public static void main(String[] args) {

        // Scanner Class tanimlayin...
        Scanner scan = new Scanner(System.in);

        // Kod burada basliyor...
        Customer currentUser;
        Account chosenAccount;

        // service.paraYatir();

        while (true){
            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password = scan.nextLine();

            currentUser = Database.confirmUsernameAndPassword(username, password);
            if ( currentUser != null ){
                System.out.println("Basarili bir sekilde giris yaptiniz");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

        // Actions starts here
        while (true){
            System.out.println("Yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < Database.actions.size(); i++) {
                System.out.println(Database.actions.get(i).getDescription()+ " - " + (i+1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice){

                case 1:{

                    while (true){
                        System.out.println("Lutfen para yatirmak istediginiz hesap numarasini giriniz...: ");
                        for (Account account : currentUser.getAccounts()) {
                            System.out.println(account.getNumber());
                        }
                        String chosen = scan.next();
                        chosenAccount = currentUser.confirmAccountNumber(chosen);
                        if (chosenAccount == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        } else if (!chosenAccount.isActive) {
                            continue;
                        }
                        break;
                    }
                    System.out.println("Lutfen yatirilacak para miktarini giriniz...: ");
                    int amountToAdd = scan.nextInt();
                    chosenAccount.addFunds(amountToAdd);
                    break;
                }

                case 2: {

                    while (true){
                        System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for (Account account : currentUser.getAccounts()) {
                            System.out.println(account.getNumber());
                        }
                        String chosen = scan.next();
                        chosenAccount = currentUser.confirmAccountNumber(chosen);
                        if (chosenAccount == null) {
                            System.out.println("Hatali hesap numarasi girdiniz...");
                            continue;
                        } else if (!chosenAccount.isActive) {
                        continue;
                    }
                        System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
                        int amountToWithdraw = scan.nextInt();
                        if (chosenAccount.withdraw(amountToWithdraw)) break;
                    }
                    break;
                }

                case 3:{
                    System.out.println("Bu islemi su an gerceklestiremiyoruz...");
                    break;
                }

                case 4: {
                    System.out.println("Yeni hesap acma islemini onayliyor musunuz?.. Y / N");
                    String secim = scan.next();
                    if (secim.equalsIgnoreCase("y")){
                        System.out.println("Hesap turunuzu seciniz, Yatirim hesabi icin - 1, Vadesiz Hesap icin - 2 yi tuslayin ");
                        int hesapTuru = scan.nextInt();
                        System.out.println("Hesabiniz basari ile olusturulmustur... Hesap No :"+ currentUser.createAccount(hesapTuru));
                        break;
                    }
                    System.out.println("Gecerli bir secim yapmadiniz...");
                    break;
                }

                case 5: {
                    System.out.println("Lutfen dondurmak istediginiz hesap numarasini giriniz...: ");
                    for (Account account : currentUser.getAccounts()) {
                        System.out.println(account.getNumber());
                    }
                    String chosen = scan.next();
                    chosenAccount = currentUser.confirmAccountNumber(chosen);
                    if (chosenAccount == null) {
                        System.out.println("Hatali hesap numarasi girdiniz...");
                        continue;
                    } else if (!chosenAccount.isActive) {
                        System.out.println("Bu hesap zaten dondurulmustur...");
                        continue;
                }
                    chosenAccount.freeze();
                    break;
                }

                case 6: System.exit(1);

                default:{
                    System.out.println("Gecerli bir secim yapmadiniz...");
                }

            }
        }
    }

}
