package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Level1 level1 = new Level1();
        Level2 level2 = new Level2();
        Level3 level3 = new Level3();
        Level4 level4 = new Level4();
        Level5 level5 = new Level5();
        Level[] levels = {level1, level2, level3, level4, level5};
        int currentLevel = 0;

        Player player = new Player(levels[currentLevel]);
        Enemy enemy = new Enemy(levels[currentLevel],2 ); // Minimální vzdálenost protivníka od hráče

        Scanner scanner = new Scanner(System.in);

        printLegend();

        while (true) {
            player.printMap();
            System.out.println("Zadej pohyb (W, A, S, D) nebo 'I' pro inventář, nebo 'NEXT' pro další level, nebo 'SELL' pro prodej věcí, nebo 'P' pro hráčovy informace: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equalsIgnoreCase("next")) {
                currentLevel++;
                if (currentLevel >= levels.length) {
                    System.out.println("Vyhrál jsi hru!");
                    break;
                } else {
                    player.setLevel(levels[currentLevel]);
                    enemy.setLevel(levels[currentLevel]);
                    continue;
                }
            }
            if (input.equalsIgnoreCase("p")) {
                System.out.println("Aktuální množství peněz: " + player.getInventory().getMoney());
                continue;
            }

            if (input.equalsIgnoreCase("i")) {
                player.printInventory();
                continue;
            }

            if (input.equalsIgnoreCase("sell")) {
                player.processCommand(input);
                continue;
            }

            switch (input) {
                case "w":
                case "a":
                case "s":
                case "d":
                    player.move(input);
                    enemy.moveRandom(); // Pohyb protivníka
                    if (player.getPosition().equals(enemy.getPosition())) {
                        System.out.println("Prohrál jsi! Protivník tě chytil.");
                        // Zde můžeš přidat další logiku pro ukončení hry nebo jiné akce.
                        break;
                    }
                    break;
                default:
                    System.out.println("Neplatný vstup!");
                    break;
            }
        }
    }

    private static void printLegend() {
        System.out.println("LEGENDA:");
        System.out.println("O - Tvoje pozice");
        System.out.println("| - Zeď");
        System.out.println("- - Zeď");
        System.out.println("X - Věc");
        System.out.println("A - Dveře");
        System.out.println("E - Protivník");
        System.out.println(" ");
    }
}
