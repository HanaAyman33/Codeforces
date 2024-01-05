import java.util.*;
public class KarinaAndArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0;i<n;i++) {
				if(sc.nextInt()!=0)
					a[i] = sc.nextInt();
			}
			int size = n;
			while(size>2) {
				int[] b = new int[size];
				b = a.clone();
				
			}
		}
	}
}
