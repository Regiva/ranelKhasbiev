import java.util.Random;
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[sc.nextInt()][sc.nextInt()];
        int[][] b = new int[sc.nextInt()][sc.nextInt()];
        int[][] c = new int[a.length][b[0].length];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(9) + 1;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                b[i][j] = random.nextInt(9) + 1;
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k]*b[k][j];
                }
            }
        }
        for(int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
