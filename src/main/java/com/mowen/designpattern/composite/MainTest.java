package com.mowen.designpattern.composite;

/**
 * Created by mowen on 4/9/16.
 */
public class MainTest {

    public static void main(String[] args) {
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessertMenu = new Menu("DESSERT MENU", "Dessert of course");

        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");

        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem("K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99));
        dinerMenu.add(new MenuItem("Waffles",
                "Waffles,with your choice of blueberries or strawberries",
                true,
                3.59));
        dinerMenu.add(new MenuItem("Regular Pancake Breakfast",
                "Pancakes make with fried eggs,sausage",
                false,
                2.99));
        dinerMenu.add(dessertMenu);

        cafeMenu.add(new MenuItem("CCCCC-K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99));
        cafeMenu.add(new MenuItem("CCCCC-Waffles",
                "Waffles,with your choice of blueberries or strawberries",
                true,
                3.59));
        cafeMenu.add(new MenuItem("CCCCC-Regular Pancake Breakfast",
                "Pancakes make with fried eggs,sausage",
                false,
                2.99));


        dessertMenu.add(new MenuItem("DDDDD-K&B's Pancake Breakfast",
                "Pancakes with scrambled eggs,and toast",
                true,
                2.99));
        dessertMenu.add(new MenuItem("DDDDD-Waffles",
                "Waffles,with your choice of blueberries or strawberries",
                true,
                3.59));
        dessertMenu.add(new MenuItem("DDDDD-Regular Pancake Breakfast",
                "Pancakes make with fried eggs,sausage",
                false,
                2.99));

        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
}
