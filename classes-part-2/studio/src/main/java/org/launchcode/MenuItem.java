package org.launchcode;

import java.util.Date;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;
    private Date lastUpdated;

    // Constructor
    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
        this.lastUpdated = new Date(); // Automatically sets the last updated time to now
    }

    // Getters
    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    // Setters
    public void setPrice(double price) {
        this.price = price;
        this.lastUpdated = new Date(); // Update the last updated time
    }

    public void setDescription(String description) {
        this.description = description;
        this.lastUpdated = new Date();
    }

    public void setCategory(String category) {
        this.category = category;
        this.lastUpdated = new Date();
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
        this.lastUpdated = new Date();
    }

    // Custom toString method for displaying MenuItem details
    @Override
    public String toString() {
        return "Item: " + description + " | Category: " + category + " | Price: $" + price +
                " | New: " + (isNew ? "Yes" : "No") + " | Last Updated: " + lastUpdated;
    }
}
