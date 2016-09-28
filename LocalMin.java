public class LocalMin {
    public static void main(String[] args) {
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random()*20);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < a.length - 1; i++) {
            if ((a[i] < a[i-1]) & (a[i] < a[i+1])) {
                System.out.print(a[i] + " ");
                i++;
            }
        }
    }
}
