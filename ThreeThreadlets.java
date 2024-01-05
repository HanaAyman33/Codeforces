import java.util.Arrays;
import java.util.Scanner;

public class ThreeThreadlets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int[] arr = { a, b, c };
            Arrays.sort(arr);
            a = arr[0];
            b = arr[1];
            c = arr[2];

            if (a == b && b == c) {
                System.out.println("YES");
            } else if (b % a == 0 && c % a == 0 && (b / a - 1) + (c / a - 1) <= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}