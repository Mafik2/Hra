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

    public char[][] getMap() {
        return map;
    }

    public Position getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(Position position) {
        this.playerPosition = position;
    }

    public Position getEnemyPosition() {
        return enemyPosition;
    }

    public void setEnemyPosition(Position position) {
        this.enemyPosition = position;
    }

    public abstract void printMap();

    public abstract boolean isValidPosition(int x, int y);
}
