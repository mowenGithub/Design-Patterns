package com.mowen.designpattern.composite;

/**
 * Created by mowen on 4/9/16.
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent) {
        this.allMenus = menuComponent;
    }

    public void printMenu() {
        allMenus.print();
    }
}
