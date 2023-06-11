package com.company;

public class Item {
    private String name;        // Name of the item
    private String description; // Description of the item
    private int id;             // Unique ID of the item
    private double price;       // Price of the item

    public Item(String name, String description, int id, double price) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
    }

    // Get the name of the item
    public String getName() {
        return name;
    }

    // Get the description of the item
    public String getDescription() {
        return description;
    }

    // Get the ID of the item
    public int getId() {
        return id;
    }

    // Get the price of the item
    public double getPrice() {
        return price;
    }
}
