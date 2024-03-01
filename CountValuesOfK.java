/*
 * It can be shown that there always exists a way to choose non-negative (i.e. ≥0) 
 * integers 𝑘, 𝑥, and 𝑦 such that 𝑙=𝑘⋅𝑎𝑥⋅𝑏𝑦.
Your task is to find the number of distinct possible values of 𝑘 across all such ways.
 */
import java.util.*;
public class CountValuesOfK {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt(),l = sc.nextInt();
			solve(a,b,l);
		}
	}
	public static void solve(int a, int b, int l) {
        HashSet ans = new HashSet<>();
        for (int i = 0; i <= 34; ++i) {
            int x = l;
            boolean fail = false;
            for (int j = 0; j < i; ++j) {
                if (x % a != 0) {
                    fail = true;
                    break;
                }
                x /= a;
            }
            if (fail) 
            	break;
            while (true) {
                ans.add(x);
                if (x % b != 0)
                	break;
                x /= b;
            }
        }
        System.out.println(ans.size());
    }
}