package com;
import java.util.Scanner;

public class Removing {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*20);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        int sc = scanner.nextInt();
        for (int i = sc; i < a.length - 1; i++) {
            int c = a[i];
            a[i] = a[i+1];
            a[i+1] = c;
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
