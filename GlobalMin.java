import java.util.Scanner;

public class GlobalMin {
    public static void main(String[] args) {
        int a[] = new int[10];
        int min;
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
        }
        min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        System.out.println();
        System.out.println(min);
    }
}
