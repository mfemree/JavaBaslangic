package ODEVLER.Projeler._07_Proje.services;

import ODEVLER.Projeler._07_Proje.application.Account;
import ODEVLER.Projeler._07_Proje.application.Customer;

public class BankServiceImpl extends AbstractService implements BankService{
    @Override
    public void addFunds(Customer currentCustomer) {
        Account chosenAccount;
        while (true) {
            System.out.println("Lutfen para yatirmak istediginiz hesap numarasini giriniz...: ");
            for (Account account : currentCustomer.getAccounts()) {
                System.out.println(account.getNumber());
            }
            String chosen = scan.next();
            chosenAccount = currentCustomer.confirmAccountNumber(chosen);
            if (chosenAccount == null) {
                System.out.println("Hatali hesap numarasi girdiniz...");
                continue;
            } else if (!chosenAccount.isActive) {
                System.out.println("Bu hesap dondurulmuştur...");
                continue;
            }
            break;
        }
        System.out.println("Lutfen yatirilacak para miktarini giriniz...: ");
        int amountToAdd = scan.nextInt();
        chosenAccount.addFunds(amountToAdd);
    }


    @Override
    public void withdrawMoney(Customer currentCustomer) {
        Account chosenAccount;
        while (true){
            System.out.println("Lutfen para cekmek istediginiz hesap numarasini giriniz...: ");
            for (Account account : currentCustomer.getAccounts()) {
                System.out.println(account.getNumber() + " - " + account.getFunds() + "$");
            }
            String chosen = scan.next();
            chosenAccount = currentCustomer.confirmAccountNumber(chosen);
            if (chosenAccount == null) {
                System.out.println("Hatali hesap numarasi girdiniz...");
                continue;
            } else if (!chosenAccount.isActive) {
                System.out.println("Bu hesap dondurulmuştur...");
                continue;
            }
            System.out.println("Lutfen cekmek istediginiz para miktarini giriniz...: ");
            int amountToWithdraw = scan.nextInt();
            if (chosenAccount.withdraw(amountToWithdraw))
                break;
        }

    }

    @Override
    public void createAccount(Customer currentCustomer) {
        System.out.println("Yeni hesap acma islemini onayliyor musunuz?.. Y / N");
        String secim = scan.next();
        if (secim.equalsIgnoreCase("y")){
            System.out.println("Hesap turunuzu seciniz, Yatirim hesabi icin - 1, Vadesiz Hesap icin - 2 yi tuslayin ");
            int hesapTuru = scan.nextInt();
            System.out.println("Hesabiniz basari ile olusturulmustur... Hesap No :"+ currentCustomer.createAccount(hesapTuru));
        } else
           System.out.println("Gecerli bir secim yapmadiniz...");
    }

    @Override
    public void freezeAccount(Customer currentCustomer) {
        Account chosenAccount;
        System.out.println("Lutfen dondurmak istediginiz hesap numarasini giriniz...: ");
        for (Account account : currentCustomer.getAccounts()) {
            System.out.println(account.getNumber());
        }
        String chosen = scan.next();
        chosenAccount = currentCustomer.confirmAccountNumber(chosen);
        if (chosenAccount == null) {
            System.out.println("Hatali hesap numarasi girdiniz...");
        } else if (!chosenAccount.isActive) {
            System.out.println("Bu hesap zaten dondurulmustur...");
        } else {
            chosenAccount.freeze();
            System.out.println("İsteğiniz üzerine " + chosenAccount.getNumber() + " nolu hesabınız dondurulmuştur.");
        }
    }

    // Arkadaslar gordugunuz gibi bu class Abstract Service i extend ediyor, Bank Service i implement ediyor...
    // Sizin goreviniz Bank Service de tanimlayacaginiz govdesiz metodlarin icerigini burada olusturmaniz..
    // Isiniz bittiginde program video daki gibi calismalidir...
    // Proje 06 da Main method icerisinde olup da kod kalabaligi yapan, switch-case icerisindeki islemler buraya tasinacaktir...
    // Kolay gelsin...
}
