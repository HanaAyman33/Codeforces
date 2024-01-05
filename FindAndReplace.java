import java.util.*;
public class FindAndReplace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			if(n==1)
				System.out.println("YES");
			else if(n==2) {
				if(s.charAt(0)!=s.charAt(1))
					System.out.println("YES");
				else
					System.out.println("NO");
			}
			else {
				int[] a = new int[n];
				int d = 0;
				for(int i = 0;i<n;i++) {
					if(i%2==0)
						d = 0;
					else
						d = 1;
					char tmp = s.charAt(i);
					for(int j = 0;j<n;j++) {
						if(s.charAt(j)==tmp)
							a[j] = d;
					}
				}
				boolean flag = false;
				for(int i = 1;i-1<n && i+1<n;i++) {
					if(a[i-1]!=a[i] && a[i]!=a[i+1])
						flag = true;
					else {
						flag = false;
						break;
					}
				}
				if(flag)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
	}
}
