package ODEVLER.Projeler._09_Proje.service;

import ODEVLER.Projeler._09_Proje.entity.Cart;
import ODEVLER.Projeler._09_Proje.entity.User;
import ODEVLER.Projeler._09_Proje.exception.ItemNotFoundException;

public interface ShoppingService {

    void completePurchase(User currentUser, Cart shoppingCart) throws ItemNotFoundException;
}
