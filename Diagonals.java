package com;

public class Diagonals {
    public static void main(String[] args) {
        int[][] a = new int[5][5];
        int summain = 0;
        int sumside = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    summain += a[i][j];
                    sumside += a[i][a.length - 1 - j];
                }
            }
        }
        System.out.println(summain);
        System.out.println(sumside);
    }
}
