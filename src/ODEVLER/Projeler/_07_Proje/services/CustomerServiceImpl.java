package ODEVLER.Projeler._07_Proje.services;

import ODEVLER.Projeler._07_Proje.application.Customer;
import ODEVLER.Projeler._07_Proje.repository.Database;
public class CustomerServiceImpl extends AbstractService implements CustomerService {


    @Override
    public Customer login() {

        Customer currentCustomer;
        while (true) {
            System.out.print("Username: ");
            String username = scan.nextLine();
            System.out.print("Password: ");
            String password = scan.nextLine();
            currentCustomer = Database.confirmUsernameAndPassword(username, password);
            if (currentCustomer != null) {
                System.out.println("Basarili bir sekilde giris yaptiniz");
                return currentCustomer;
            } else
                System.out.println("Sistemde kayitli boyle bir kullanici bulunamadi.. Tekrar deneyin");
        }

    }

    // Arkadaslar gordugunuz gibi bu class Abstract Service i extend ediyor, Customer Service i implement ediyor...
    // Sizin goreviniz Customer Service de tanimlanan govdesiz method/methodlarin burada icini doldurmaniz...
    // Isiniz bittiginde program video daki gibi calismalidir...
    // Proje 06 da Main method icerisinde olup da kullanici girisi (login) ile ilgili islemler buraya tasinacaktir...
    // Kolay gelsin...


}
