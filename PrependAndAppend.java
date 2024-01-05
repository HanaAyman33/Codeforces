import java.util.*;
public class PrependAndAppend {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			int l = 0,r = n-1,ans = n;
			while(s.charAt(l)!=s.charAt(r) && ans>0) {
				l++;
				r--;
				ans-=2;
			}
			System.out.println(ans);
		}
	}
}
