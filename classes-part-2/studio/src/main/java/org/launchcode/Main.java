package org.launchcode;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Create some menu items
        MenuItem pancake = new MenuItem(5.99, "Fluffy Pancakes", "Breakfast", true);
        MenuItem burger = new MenuItem(9.99, "Cheeseburger with Fries", "Lunch", false);
        MenuItem sundae = new MenuItem(4.50, "Chocolate Sundae", "Dessert", true);

        // Add the items to an ArrayList
        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pancake);
        menuItems.add(burger);
        menuItems.add(sundae);

        // Create the menu
        Menu menu = new Menu(menuItems);

        // Print the menu
        System.out.println(menu);
    }
}
