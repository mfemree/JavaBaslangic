package ODEVLER.Projeler._09_Proje.database;

import ODEVLER.Projeler._09_Proje.entity.Item;
import ODEVLER.Projeler._09_Proje.entity.User;
import ODEVLER.Projeler._09_Proje.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Database {

    public static List<User> users = new ArrayList<>();
    public static List<Item> items = new ArrayList<Item>();

    static {

        Item item1 = new Item(1,"Macbook", Color.BLACK,1500);
        Item item2 = new Item(2,"IPhone",Color.GREEN,1200);
        Item item3 = new Item(3,"Samsung",Color.RED,800);
        Item item4 = new Item(4,"Mouse",Color.BLACK,100);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);

    }








}
