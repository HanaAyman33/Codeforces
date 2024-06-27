/* Alex thinks some array is good if there exists some element that can be 
 * represented as the sum of all other elements (the sum of all other elements is 0 
 * if there are no other elements). For example, the array [1,6,3,2] is good since 1+3+2=6. 
 * Furthermore, the array [0] is also good. However, the arrays [1,2,3,4] and [1] are not good.
Alex has an array 𝑎1,𝑎2,…,𝑎𝑛. Help him count the number of good non-empty prefixes of the 
array 𝑎. In other words, count the number of integers 𝑖 (1≤𝑖≤𝑛) such that the 
length 𝑖 prefix (i.e. 𝑎1,𝑎2,…,𝑎𝑖) is good.
 */
import java.util.*;
public class GoodPrefixes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			int cnt = 0;
			int max = 0;
			long sum = 0;
			for(int i = 0;i<n;i++) {
				sum+=a[i];
				max = Math.max(max, a[i]);
				if(sum-max==max)
					cnt++;
			}
			System.out.println(cnt);
		}

	}

}
