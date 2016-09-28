package com;

public class SimpleDigits {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 19 + 1);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length - 1; i++) {
            if ((simple(a[i]) == true) & (simple(a[i + 1]) == false)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean simple(int c) {
        int k = 0;
        for (int j = 1; j * j <= c; j++) {
            if (c % j == 0) {
                k++;
            }
        }
        if (k == 1) {
            return true;
        }
        else {
            return false;
        }
    }
}