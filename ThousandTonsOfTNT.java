import java.util.*;
public class ThousandTonsOfTNT {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long[] a = new long[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextLong();
			long max = -1;
			for(int i = 0 ;i<n;i++) {
				for(int j = i+1;j<n;j++) {
					max = Math.max(max, Math.abs(a[i]-a[j]));
				}
			}
			System.out.println(max);
		}
	}
}
