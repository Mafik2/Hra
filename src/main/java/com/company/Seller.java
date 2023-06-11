package com.company;

import java.util.List;

public class Seller {
    private Inventory inventory;

    public Seller(Inventory inventory) {
        this.inventory = inventory;
    }

    public void sellAllItems() {
        List<Item> items = inventory.getItems();
        int totalMoney = 0;

        for (Item item : items) {
            totalMoney += item.getPrice();
        }

        inventory.clearItems();
        inventory.addMoney(totalMoney);

        System.out.println("Prodal jsi všechny věci a získal " + totalMoney + " peněz.");
    }
}
