package com.company;

public abstract class Level {

    protected int width;
    protected int height;
    protected char[][] map;
    protected Position playerPosition;
    protected Position enemyPosition;

    public Level(int width, int height) {
        this.width = width;
        this.height = height;
        this.map = new char[height][width];
    }

    // Get the map of the level
    public char[][] getMap() {
        return map;
    }

    // Get the player's position
    public Position getPlayerPosition() {
        return playerPosition;
    }

    // Set the player's position
    public void setPlayerPosition(Position position) {
        this.playerPosition = position;
    }

    // Get the enemy's position
    public Position getEnemyPosition() {
        return enemyPosition;
    }

    // Set the enemy's position
    public void setEnemyPosition(Position position) {
        this.enemyPosition = position;
    }

    // Print the map of the level
    public abstract void printMap();

    // Check if the given position is valid
    public abstract boolean isValidPosition(int x, int y);
}
