package ODEVLER.Projeler._09_Proje.service;

import ODEVLER.Projeler._09_Proje.database.Database;
import ODEVLER.Projeler._09_Proje.entity.Address;
import ODEVLER.Projeler._09_Proje.entity.User;
import ODEVLER.Projeler._09_Proje.enums.City;
import ODEVLER.Projeler._09_Proje.exception.UserNotFoundException;
import java.util.List;

public class UserServiceImpl extends AbstractService implements UserService{

    int randomId = (int) (Math.random() * 100);

    @Override
    public List<User> getAllUser() {
        return Database.users;
    }

    @Override
    public User getUserById(int id) throws UserNotFoundException {
        for (User user : Database.users){
            if (user.getId() == id){
                return user;
            }
        }
        throw new UserNotFoundException("Boyle bir kullanici mevcut degildir");
    }

    @Override
    public User addUser() {
        System.out.println("Alisveris yapabilmek icin kayit olusturmaniz gereklidir...");
        System.out.println("Lutfen adinizi girin : ");
        String firstName = scan.nextLine();

        System.out.println("Lutfen soyadinizi girin : ");
        String lastName = scan.nextLine();

        System.out.println("Adresinizi giriniz..:");
        String address = scan.nextLine();

        System.out.println("Yasadiginiz sehiri seciniz..:");
        for (int i = 0; i < City.values().length; i++) {
            System.out.println(City.values()[i]+" icin "+i);
        }
        int chosenCity = scan.nextInt();

        System.out.println("Zipcode..: ");
        String zipCode = scan.next();

        System.out.println("Lutfen kullanici adinizi belirleyin : ");
        String userName = scan.next();

        System.out.println("Lutfen sifrenizi belirleyin :");
        String password = scan.next();

        User currentUser = new User(randomId,firstName, lastName, userName, password, new Address(address, City.values()[chosenCity], zipCode));
        Database.users.add(currentUser);
        return currentUser;
    }

    @Override
    public void deleteUserById(int id) throws UserNotFoundException {
        for (User user : Database.users){
            if (user.getId() == id){
                Database.users.remove(user);
            }
        }
        throw new UserNotFoundException("Boyle bir kullanici mevcut degildir");
    }

    @Override
    public void updateUser(User user) {
        int userIndex = 0;
        for (User usr : Database.users){
            if (usr.getId() == user.getId()){
                Database.users.remove(user);
            }
            userIndex++;
        }
        Database.users.add(userIndex, user);
    }

    @Override
    void print() {
        System.out.println("User printed");
    }
}
