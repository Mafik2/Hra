package com.company;

import java.util.Scanner;
import com.company.Seller;

public class Player {

    private Level level;
    private Position position;
    private Inventory inventory;
    private Seller seller;

    public Player(Level level) {
        this.level = level;
        this.position = findStartPosition();
        this.inventory = new Inventory();
        this.seller = new Seller(inventory);
        level.setPlayerPosition(position); // Nastavení pozice hráče v objektu Level
    }

    private Position findStartPosition() {
        for (int i = 0; i < level.getMap().length; i++) {
            for (int j = 0; j < level.getMap()[i].length; j++) {
                if (level.getMap()[i][j] == 'O') {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    public Position getPosition() {
        return position;
    }

    public void setLevel(Level level) {
        this.level = level;
        this.position = findStartPosition();
        level.setPlayerPosition(position); // Aktualizace pozice hráče v objektu Level
    }

    public void move(String direction) {
        int x = position.getX();
        int y = position.getY();

        switch (direction) {
            case "w":
                if (isValidPosition(x - 1, y)) {
                    level.getMap()[x][y] = ' ';
                    x--;
                    checkItem(x, y);
                    level.getMap()[x][y] = 'O';
                }
                break;
            case "a":
                if (isValidPosition(x, y - 1)) {
                    level.getMap()[x][y] = ' ';
                    y--;
                    checkItem(x, y);
                    level.getMap()[x][y] = 'O';
                }
                break;
            case "s":
                if (isValidPosition(x + 1, y)) {
                    level.getMap()[x][y] = ' ';
                    x++;
                    checkItem(x, y);
                    level.getMap()[x][y] = 'O';
                }
                break;
            case "d":
                if (isValidPosition(x, y + 1)) {
                    level.getMap()[x][y] = ' ';
                    y++;
                    checkItem(x, y);
                    level.getMap()[x][y] = 'O';
                }
                break;
        }

        position.setX(x);
        position.setY(y);
        level.setPlayerPosition(position); // Aktualizace pozice hráče v objektu Level
        checkEnemyDistance(); // Kontrola vzdálenosti protivníka
    }

    private void checkItem(int x, int y) {
        if (level.getMap()[x][y] == 'X') {
            System.out.println("Našel jsi věc! Chceš ji sebrat? (Stiskni libovolnou klávesu pro sebrání)");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();

            level.getMap()[x][y] = ' ';
            inventory.addItem();
            System.out.println("Sebral jsi věc!");
            System.out.println("V inventáři máš " + inventory.getItemCount() + "X.");
        }
    }

    private void checkEnemyDistance() {
        Position enemyPosition = level.getEnemyPosition();

        if (enemyPosition != null) {
            int playerX = position.getX();
            int playerY = position.getY();
            int enemyX = enemyPosition.getX();
            int enemyY = enemyPosition.getY();

            double distance = Math.sqrt(Math.pow(playerX - enemyX, 2) + Math.pow(playerY - enemyY, 2));

            if (distance <= 1.0) {
                System.out.println("Prohrál jsi! Protivník tě chytil.");
                System.exit(0);
            }
        }
    }

    public void printMap() {
        level.printMap();
    }

    public void printInventory() {
        System.out.println("Inventář:");
        for (Item item : inventory.getItems()) {
            System.out.println(item.getName());
        }
    }

    private boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= level.getMap().length || y < 0 || y >= level.getMap()[0].length) {
            return false;
        }
        return level.getMap()[x][y] != '-' && level.getMap()[x][y] != '|' && level.getMap()[x][y] != 'E';
    }

    public void processCommand(String command) {
        // Zpracování příkazu sell
        if (command.equalsIgnoreCase("sell")) {
            seller.sellAllItems();
        }
    }

    public Inventory getInventory() {
        return inventory;
    }
}
