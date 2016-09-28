import java.util.Random;

public class FunctionBubble {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
        }
        Bubble(a);
    }

    public static void Bubble(int[] a) {
        int c;
        for (int i = a.length - 1; i > 0; i--) {
            boolean sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j+1]) {
                    c = a[j];
                    a[j] = a[j+1];
                    a[j+1] = c;
                    sorted = false;
                }
            }
            if (sorted == true) {
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}