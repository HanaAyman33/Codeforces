import java.util.*;
public class Rigged {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int[]e = new int[n];
			int maxE = 0,w = 0;
			int S = 0;
			for(int i = 0;i<n;i++) {
				s[i] = sc.nextInt();
				e[i] = sc.nextInt();
				maxE = Math.max(maxE, e[i]);
				if(maxE==e[i])
					S = s[i];
			}
			if(maxE>e[0]){
				w = S+1;
			}
			if(w>0 && s[0]>w)
				System.out.println(w);
			else
				System.out.println("-1");
		}
	}
}
