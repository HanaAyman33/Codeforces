import java.util.*;
public class GrabTheCandies {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] c = new int[n];
			int m = 0,b = 0;
			for(int i = 0;i<n;i++) {
				c[i] = sc.nextInt();
				if(c[i]%2==0)
					m+=c[i];
				else
					b+=c[i];
			}
			if(m>b)
				System.out.println("YES");
			else
				System.out.println("NO");
			
		}
		}
}
