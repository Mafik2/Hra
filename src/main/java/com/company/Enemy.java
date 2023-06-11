package com.company;

import java.util.Random;

public class Enemy {
    private Level level;            // Reference to the current level
    private Position position;      // Current position of the enemy
    private Random random;          // Random number generator
    private int minDistance;        // Minimum distance from the player

    public Enemy(Level level, int minDistance) {
        this.level = level;
        this.position = findStartPosition();
        this.random = new Random();
        this.minDistance = minDistance;
    }

    // Find the initial position of the enemy in the level
    private Position findStartPosition() {
        for (int i = 0; i < level.getMap().length; i++) {
            for (int j = 0; j < level.getMap()[i].length; j++) {
                if (level.getMap()[i][j] == 'E') {
                    return new Position(i, j);
                }
            }
        }
        return null;
    }

    // Set the current level of the enemy
    public void setLevel(Level level) {
        this.level = level;
        this.position = findStartPosition();
    }

    // Move the enemy randomly in the level
    public void moveRandom() {
        int x = position.getX();
        int y = position.getY();

        int randomDirection = random.nextInt(4); // Random direction: 0 = up, 1 = left, 2 = down, 3 = right

        switch (randomDirection) {
            case 0:
                if (isValidPosition(x - 1, y) && isFarFromPlayer(x - 1, y)) {
                    level.getMap()[x][y] = ' ';
                    x--;
                }
                break;
            case 1:
                if (isValidPosition(x, y - 1) && isFarFromPlayer(x, y - 1)) {
                    level.getMap()[x][y] = ' ';
                    y--;
                }
                break;
            case 2:
                if (isValidPosition(x + 1, y) && isFarFromPlayer(x + 1, y)) {
                    level.getMap()[x][y] = ' ';
                    x++;
                }
                break;
            case 3:
                if (isValidPosition(x, y + 1) && isFarFromPlayer(x, y + 1)) {
                    level.getMap()[x][y] = ' ';
                    y++;
                }
                break;
        }

        position.setX(x);
        position.setY(y);
        level.getMap()[x][y] = 'E';
    }

    // Check if the given position is a valid position in the level
    private boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= level.getMap().length || y < 0 || y >= level.getMap()[0].length) {
            return false;
        }
        return level.getMap()[x][y] != '-' && level.getMap()[x][y] != '|';
    }

    // Check if the enemy is far enough from the player based on the minimum distance
    private boolean isFarFromPlayer(int x, int y) {
        Position playerPosition = level.getPlayerPosition();
        int playerX = playerPosition.getX();
        int playerY = playerPosition.getY();

        int distance = Math.abs(playerX - x) + Math.abs(playerY - y);
        return distance >= minDistance;
    }

    // Get the current position of the enemy
    public Position getPosition() {
        return position;
    }
}
