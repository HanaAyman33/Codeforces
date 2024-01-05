import java.util.*;
public class CanISquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			long[]a = new long[n];
			long sum = 0;
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextLong();
				sum+=a[i];
			}
			if(Math.sqrt(sum)%1==0)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
