import java.util.*;
import java.util.Random;
public class SumOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r =new Random();
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			 solve(n);
		}
	}
	public static void solve(int n) {
        for (int x = 1; x <= 20; x++) {
            for (int y = 1; y <= 20; y++) {
                if (x + y >= n || x == y) continue;
                int z = n - x - y;
                if (z == x || z == y) continue;
                if (x % 3 == 0 || y % 3 == 0 || z % 3 == 0) {
                    continue;
                }
                System.out.println("YES");
                System.out.println(x + " " + y + " " + z);
                return;
            }
        }
        System.out.println("NO");
    }
}
