package com.company;

public class Level3 extends Level {

    public Level3() {
        super(10, 10);

        map = new char[][]{
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'},
                {'-', 'O', ' ', 'X', ' ', 'E', ' ', ' ', ' ', '-'},
                {'-', '-', ' ', '-', '-', '-', '-', '-', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', 'X', ' ', '-'},
                {'-', ' ', '-', '-', '-', '-', '-', '-', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', 'X', ' ', ' ', 'E', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '-'},
                {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-'}
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
