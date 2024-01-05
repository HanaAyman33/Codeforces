import java.util.*;
public class IncreasingSequence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			if(n==1)
				System.out.println(a[0]+1);
			else {
				if(a[0]==1)
					b[0] = 2;
				else
					b[0] = 1;
				for(int i = 1;i-1<n;i++){
					if(a[i]==b[i-1]+1)
						b[i] = b[i-1]+2;
					else
						b[i] = b[i-1]+1;
				}
				System.out.println(b[n-1]);
			}
		}
	}
}