import java.util.*;
public class TubeTubeFeed {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),time = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			for(int i = 0;i<n;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			if(time<a[0])
				System.out.println("-1");
			else {
				int index = 0;
				for(int i = 0;i+1<n;i++) {
					if(time==a[i]) {
						index = i++;
						break;
					}
					else if(time>a[i] && i==n-1)
						index = n;
					else if(time>a[i] && (time-1)>=a[i+1])
						time--;
				}
				System.out.println(index);
			}
		}
	}
}
