import java.util.*;
/*For each test case, print a single integer — the maximum possible
 *  total experience Monocarp can get if he can complete 
 *  no more than 𝑘 quests.
 */
public class Quests	 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();//# of quests
			int k = sc.nextInt();//maximum # of quests can be done
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			for(int i = 0;i<n;i++)
				b[i] = sc.nextInt();
			int res = 0;
	        int sum = 0;
	        int mx = 0;
	        for (int i = 0; i < Math.min(n, k); i++) {
	            sum += a[i];
	            mx = Math.max(mx, b[i]);
	            res = Math.max(res, sum + mx * (k - i - 1));
	        }
	        System.out.println(res);		}
	}
}
