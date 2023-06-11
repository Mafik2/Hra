package com.company;

public class Item {
    private String name;
    private String description;
    private int id;
    private double price;

    public Item(String name, String description, int id, double price) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}
