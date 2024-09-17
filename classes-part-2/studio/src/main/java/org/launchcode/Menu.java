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
