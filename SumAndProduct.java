import java.util.*;
public class SumAndProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			int q = sc.nextInt();
			while(q-->0) {
				int x = sc.nextInt(),y = sc.nextInt();
				int pairs = 0;
				if(n==1)
					pairs = 1;
				for(int i = 0;i<n;i++) {
					for(int j = i+1;j<n;j++) {
						if(a[i]+a[j]==x && a[i]*a[j]==y)
							pairs++;
					}
				}
				System.out.print(pairs+" ");
			}
			System.out.println();
		}
	}
}