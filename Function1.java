import java.util.Random;

public class Function1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        int min = 11;
        int max = -1;
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        min = min(a);
        max = max(a);
        s = sum(a);
        System.out.println(min);
        System.out.println(max);
        System.out.println(s);
    }

    public static int min(int[] a) {
        int minElement = a[0];
        for (int i = 0; i < a.length; i++) {
            if (minElement > a[i]) {
                minElement = a[i];
            }
        }
        return minElement;
    }

    public static int max(int[] a) {
        int maxElement = a[0];
        for (int i = 0; i < a.length; i++) {
            if (maxElement < a[i]) {
                maxElement = a[i];
            }
        }
        return maxElement;
    }

    public static int sum(int[] a) {
        int s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return s;
    }
}
