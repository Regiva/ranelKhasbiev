import java.util.Scanner;

public class GlobalMax {
    public static void main(String[] args) {
        int a[] = new int[10];
        int max;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
        }
        max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println();
        System.out.println(max);
    }
}