package com.company;

import java.util.Random;

public class Enemy {
    private Level level;
    private Position position;
    private Random random;
    private int minDistance;

    public Enemy(Level level, int minDistance) {
        this.level = level;
        this.position = findStartPosition();
        this.random = new Random();
        this.minDistance = minDistance;
    }

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

    public void setLevel(Level level) {
        this.level = level;
        this.position = findStartPosition();
    }

    public void moveRandom() {
        int x = position.getX();
        int y = position.getY();

        int randomDirection = random.nextInt(4); // Náhodný směr: 0 = nahoru, 1 = doleva, 2 = dolů, 3 = doprava

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

    private boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= level.getMap().length || y < 0 || y >= level.getMap()[0].length) {
            return false;
        }
        return level.getMap()[x][y] != '-' && level.getMap()[x][y] != '|';
    }

    private boolean isFarFromPlayer(int x, int y) {
        Position playerPosition = level.getPlayerPosition();
        int playerX = playerPosition.getX();
        int playerY = playerPosition.getY();

        int distance = Math.abs(playerX - x) + Math.abs(playerY - y);
        return distance >= minDistance;
    }

    public Position getPosition() {
        return position;
    }
}
