
import java.util.Scanner;

public class Rudolf121 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0) {
            solve();
        }
        input.close();
    }
    public static void solve() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        for (int i = 0; i < n - 2; i++) {
            if (a[i] < 0) {
                System.out.println("NO");
                return;
            }
            int op = a[i];
            a[i] -= op;
            a[i + 1] -= 2 * op;
            a[i + 2] -= op;
        }
        if (a[n - 1] != 0 || a[n - 2] != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}