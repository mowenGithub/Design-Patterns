package com.mowen.designpattern.iterator;

/**
 * Created by mowen on 4/9/16.
 */
public class Client {

    public static void main(String[] args) {
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(dinerMenu);
        waitress.printMenu();
    }
}
