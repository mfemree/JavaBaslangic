package ODEVLER.Projeler._09_Proje.service;

import ODEVLER.Projeler._09_Proje.entity.Item;
import ODEVLER.Projeler._09_Proje.exception.ItemNotFoundException;
import java.util.List;

public interface ItemService {

    List<Item> getAllItems();

    Item getItemById(int id) throws ItemNotFoundException;

    void addItem(Item item);

    void deleteItemById(int id) throws ItemNotFoundException;

    void updateItem(Item item);
}
