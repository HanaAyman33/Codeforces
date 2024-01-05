import java.util.*;
public class Subsegment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt(),k = sc.nextInt();
			int[] a = new int[n];
			boolean flag = false;
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
				if(a[i]==k)
					flag = true;
			}
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
