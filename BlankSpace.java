import java.util.*;	
public class BlankSpace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			if(n==1 && a[0]==0)
				System.out.println("1");
			else if(n==1 && a[0]==1)
				System.out.println("0");
			else {
				int cnt = 0,max = cnt;
				for(int i = 0;i<n;i++) {
					if(a[i]==1)
						cnt = 0;
					else 
						cnt++;
					max = Math.max(cnt, max);
				}
				System.out.println(max);
			}
		}
	}
}
