package ODEVLER.Projeler._03_Proje.proje03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class _01_Proje3 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        Actions action1 = new Actions("Para Yatir");
        Actions action2 = new Actions("Para Cek");
        Actions action3 = new Actions("Transfer");
        Actions action4 = new Actions("Cikis");
        List<Actions> actions = new ArrayList<>(Arrays.asList(action1,action2,action3,action4));


        Account user_1_account1= new Account(1234, 200);
        Account user_1_account2= new Account(4321, 20);
        Account user_2_account1= new Account(5678, 1000);
        Account user_2_account2= new Account(8765, 100);
        Account user_3_account1= new Account(9999, 5000);
        Account user_3_account2= new Account(1111, 500);


        Customer customer1 = new Customer("User1", "password1", Arrays.asList(user_1_account1, user_1_account2));
        Customer customer2 = new Customer("User2", "password1", Arrays.asList(user_2_account1, user_2_account2));
        Customer customer3 = new Customer("User3", "password1", Arrays.asList(user_3_account1, user_3_account2));
        List <Customer> customers = new ArrayList<>(Arrays.asList(customer1,customer2,customer3));


        Customer currentUser;
        Account chosenAccount;


        while ( true){

            System.out.println("Please enter your username: ");
            String username = scan.nextLine();
            System.out.println("Please enter your password: ");
            String password= scan.nextLine();

            currentUser = confirmUsernameAndPassword (customers, username, password );

            if ( currentUser != null ){
                System.out.println("basarili bir sekilde giris yaptiniz ");
                break;
            }
            System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin. ");

        }

        while ( true) {
            System.out.println("yapmak istediginiz islemi seciniz...");
            for (int i = 0; i < actions.size(); i++) {
                System.out.println(actions.get(i).description + " - " + (i+1));
            }
            int userChoice = scan.nextInt();

            switch (userChoice) {

                case 1: {

                    while (true) {
                        System.out.println("lutfen para yatirmak istediginiz hesap numarasini giriniz...");
                        for ( Account account  : currentUser.accounts      ){
                            System.out.println("account.number = " + account.number);
                        }
                        String chosen = scan.next();
                        chosenAccount = confirmAccountNumber(currentUser, chosen);
                        if (chosenAccount == null) {
                            System.out.println("hatali giris yaptiniz...");
                            continue;
                        }
                        break;
                    }
                    System.out.println("lutfen yatirilacak para miktarini giriniz...");
                    int amountToAdd = scan.nextInt();
                    chosenAccount.funds += amountToAdd;
                    break;
                }

                case 2: {

                    while ( true) {
                        System.out.println("lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
                        for ( Account account   : currentUser.accounts  ) {
                            System.out.println(account.number);
                        }
                        String chosen = scan.next();
                        chosenAccount = confirmAccountNumber (currentUser, chosen );
                        if (chosenAccount == null) {
                            System.out.println("hatali hesap numarasi girdiniz...");
                            continue;
                        }
                        System.out.println("lutfen cekmek istediginiz para miktarini giriniz...:");
                        int amountToWithdraw = scan.nextInt();
                        if ( !  withdraw ( chosenAccount, amountToWithdraw)) {
                            break;
                        }
                    }
                    break;
                }

                case 3: {
                    System.out.println("bu islemi su anda gerceklestiremiyoruz");
                    break;
                }
                case 4: System.exit(1);
                default: {

                    System.out.println("basarili bir secim yapmadiniz.");
                }
            }
        }
    }

    private static boolean withdraw (Account chosenAccount, int amountToWithdraw  ) {
        if ( chosenAccount.funds < amountToWithdraw) {
            System.out.println("hesabinizda yeterli bakiye bulunmamaktadir");
            return true;
        }
            chosenAccount.funds -= amountToWithdraw;
        System.out.println("lutfen paranizi aliniz, hesabinizda  toplam" + chosenAccount.funds + " Euro kalmistir... ");
        return false;
    }

    public static Account confirmAccountNumber ( Customer currentUser, String chosenAccount ){
        Integer chosen = Integer.parseInt(chosenAccount);

        for ( Account account : currentUser.accounts ) {

            if ( account.number == chosen ) return account;
        }
        return null;

    }
    private static Customer confirmUsernameAndPassword (List<Customer> users, String username, String password) {

        for (int i = 0; i < users.size(); i++) {
            if ( users.get(i).userName.equals(username) && users.get(i).password.equals(password) ) {
                return  users.get(i);
            }
        }
        return null;
    }



}
