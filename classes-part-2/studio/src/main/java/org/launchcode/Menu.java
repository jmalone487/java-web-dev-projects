package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    private String restaurantName;

    // Constructor
    public Menu(ArrayList<MenuItem> items) {
        this.items = items;
        this.restaurantName = "Code Cafe";  // Restaurant name is set here
        this.lastUpdated = new Date();
    }

    // Getters
    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    // Method to print a single item by its description
    public void printItem(String description) {
        for (MenuItem item : items) {
            if (item.getDescription().equals(description)) {
                System.out.println(item);
                return;
            }
        }
        System.out.println("Item not found.");
    }

    // Method to print the entire menu
    public void printMenu() {
        System.out.println(this);  // 'this' refers to the current Menu object, toString() is called implicitly
    }

    // Method to add an item to the menu (preventing duplicates)
    public void addItem(MenuItem newItem) {
        for (MenuItem item : items) {
            if (item.getDescription().equals(newItem.getDescription())) {
                System.out.println("Warning: Item already exists on the menu. Cannot add duplicate.");
                return;
            }
        }
        items.add(newItem);
        System.out.println(newItem.getDescription() + " has been added to the menu.");
        this.lastUpdated = new Date();
    }

    // Custom toString method for displaying the menu
    @Override
    public String toString() {
        StringBuilder menuString = new StringBuilder();
        menuString.append("Welcome to " + restaurantName + "!\n");
        menuString.append("Last updated: " + lastUpdated + "\n");
        menuString.append("Menu:\n");
        for (MenuItem item : items) {
            menuString.append(item.toString() + "\n");
        }
        return menuString.toString();
    }
}
