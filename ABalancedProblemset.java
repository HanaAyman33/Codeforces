import java.util.*;
/*
 * For each test case, print a single line containing a single integer 
 * denoting the maximum balance of the problemset Yash can achieve.
 */
public class ABalancedProblemset {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int x = sc.nextInt(),n = sc.nextInt();
			int ans = 1;
			for(int i = 1;i*i<=x;i++) {
				if(x%i==0) {
					if(n<=x/i)
						ans = Math.max(ans, i);
					if(n<=i)
						ans = Math.max(ans, x/i);
				}
			}
			System.out.println(ans);
		}
	}
}