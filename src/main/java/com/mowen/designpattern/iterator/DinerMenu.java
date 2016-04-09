package com.mowen.designpattern.iterator;

import java.util.ArrayList;

/**
 * Created by mowen on 4/9/16.
 */
public class DinerMenu implements Menu {
    ArrayList menuItems;

    public DinerMenu() {
        menuItems = new ArrayList();
        addItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99);
        addItem("Waffles",
                "Waffles,with your choice of blueberries or strawberries",
                true,
                3.59);
        addItem("Regular Pancake Breakfast",
                "Pancakes make with fried eggs,sausage",
                false,
                2.99);

    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
