import java.util.*;
public class TubeTubeFeed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),time = sc.nextInt();
			int[] a = new int[n];	//duration
			int[] b = new int[n];	//entertainment
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			if(time<a[0])
				System.out.println("-1");
			else {
				int index = 0;
				for(int i = 0;i<n;i++) {
					if(time>a[i]) {
						time--;
						if(i==n-1) {
							index = n;
							break;
						}
					}
					else {
						index = i+1;
						break;
					}
				}
				System.out.println(index);
			}
		}
	}
}
