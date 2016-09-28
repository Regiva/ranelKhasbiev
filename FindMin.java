import java.util.Random;

public class FindMin {
    public static void main(String[] args) {
        int[][] a = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = random.nextInt(10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int min = 10;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if ((i == j) & (a[i][a.length - 1 - j] < min)) {
                    min = a[i][a.length - 1 - j];
                }
            }
        }
        System.out.println(min);
    }
}
