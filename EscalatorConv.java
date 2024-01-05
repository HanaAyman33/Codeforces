import java.util.*;
public class EscalatorConv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),m = sc.nextInt(),k = sc.nextInt(),H = sc.nextInt();
			int[] h = new int[n];
			for(int i = 0;i<n;i++)
				h[i] = sc.nextInt();
			int people = 0;			
			int i = 0;
			while(i<n) {
				int diff = Math.abs(h[i]-H);
				if(diff%k==0 && diff>=k) {
					int index = diff/k;
					if(index<m)
						people++;
				}
				i++;
			}
			System.out.println(people);
		}
	}
}
