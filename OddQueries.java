import java.util.*;
public class OddQueries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tmp = 0;
		while(t-->0){
				int n = sc.nextInt(),q = sc.nextInt();
				int[] a = new int[n];
				int sum = 0;
				for(int i = 0;i<n;i++) {
					a[i] = sc.nextInt();
					sum+=a[i];
				}
				for(int i = 0;i<q;i++) {
					tmp = sum;
					int l = sc.nextInt(),r = sc.nextInt(),k = sc.nextInt();
					for(int j = l-1;j<r;j++) {
						tmp-=a[j];
						tmp+=k;
					}
					if(tmp%2==1)
						System.out.println("YES");
					else
						System.out.println("NO");
			}
		}
	}
}
