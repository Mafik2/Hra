package com.company;

public class Level2 extends Level {

    public Level2() {
        super(12, 12);

        map = new char[][]{
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', 'O', ' ', ' ', 'X', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', '-', ' ', '-', '-', '-', '-', '-', '-', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', 'X', ' ', ' ', ' ', '-'},
                {'-', ' ', '-', '-', '-', '-', '-', '-', '-', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', '-', '-', '-', '-', '-', '-', '-', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
        };
    }

    public void printMap() {
        for (char[] row : map) {
            for (char cell : row) {
                System.out.print(cell);
            }
            System.out.println();
        }
    }

    public boolean isValidPosition(int x, int y) {
        if (x < 0 || x >= map.length || y < 0 || y >= map[0].length) {
            return false;
        }
        return map[x][y] != '-';
    }
}