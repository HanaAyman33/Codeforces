/*
 * For each testcase, output a single integer — the number of ways Rudolf can select two coins, 
 * taking one from each pocket, so that the sum of the coins does not exceed 𝑘.
 */
import java.util.*;
public class Ticket {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),//# of left coins
			m = sc.nextInt(),//# of right coins
			k = sc.nextInt();//maximum sum
			int[] left = new int[n];//coins in left pocket
			int[] right = new int[m];//coins in right pocket
			for(int i = 0;i<n;i++)
				left[i] = sc.nextInt();
			for(int i = 0;i<m;i++)
				right[i] = sc.nextInt();
			int ans = 0;
			int sum;
			for(int i = 0;i<n;i++) {
				sum = left[i];
				for(int j = 0;j<m;j++) {
					if(sum+right[j]<=k)
						ans++;
				}
			}
			System.out.println(ans);
		}
	}
}
