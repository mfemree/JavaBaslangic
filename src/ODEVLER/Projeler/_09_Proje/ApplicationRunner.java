package ODEVLER.Projeler._09_Proje;

import ODEVLER.Projeler._09_Proje.entity.Cart;
import ODEVLER.Projeler._09_Proje.entity.User;
import ODEVLER.Projeler._09_Proje.exception.ItemNotFoundException;
import ODEVLER.Projeler._09_Proje.service.ShoppingServiceImpl;
import ODEVLER.Projeler._09_Proje.service.UserService;
import ODEVLER.Projeler._09_Proje.service.UserServiceImpl;

public class ApplicationRunner {
    public static void main(String[] args) throws ItemNotFoundException {  // custom exception

        UserService userService = new UserServiceImpl();
        ShoppingServiceImpl shoppingService = new ShoppingServiceImpl();
        Cart shoppingCart = new Cart();


        System.out.println("Alisveris yapabilmek icin kayit olusturmaniz gereklidir...");
        User currentUser = userService.addUser();
        System.out.println("Kayit oldugunuz icin tesekkur ederiz... Iyi alisverisler..");

        shoppingService.completePurchase(currentUser, shoppingCart);
        System.out.println("Iyi gunler dileriz...");


    }
}
