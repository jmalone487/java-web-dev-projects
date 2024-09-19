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

        // Print the entire menu
        System.out.println("Printing the entire menu:");
        menu.printMenu();

        // Print a single menu item
        System.out.println("\nPrinting a single menu item (Fluffy Pancakes):");
        menu.printItem("Fluffy Pancakes");

        // Try to add a duplicate item
        System.out.println("\nTrying to add a duplicate item (Cheeseburger with Fries):");
        menu.addItem(burger);

        // Add a new item and print the menu again
        MenuItem salad = new MenuItem(7.50, "Caesar Salad", "Appetizer", true);
        System.out.println("\nAdding a new item (Caesar Salad) to the menu:");
        menu.addItem(salad);

        // Print the updated menu
        System.out.println("\nPrinting the updated menu:");
        menu.printMenu();
    }
}
