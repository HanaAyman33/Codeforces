import java.util.*;
public class SumOfSumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n+1];
			a[0] = 0;
			for(int i = 1;i<=n;i++) {
					a[i] = S(i) + a[i-1];
			}
			System.out.println(a[n]);
		}
	}
	public static int S(int i) {
		if(i<=9)
			return i;
		int ans = 0;
		while(i!=0) {
			int x = i%10;
			ans+=x;
			i/=10;
		}
		return ans;
	}
}
