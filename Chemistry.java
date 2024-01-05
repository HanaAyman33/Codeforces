import java.util.*;
public class Chemistry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),k = sc.nextInt();
			String s = sc.next();
			if(n==1 || (n==2 &&  k>0) || k==n-1)
				System.out.println("YES");
			else if((n==2 && k==0))
				System.out.println("NO");
			else {
				int odd = 0;
				for(int i = 0;i<n;i++) {
					if(occ(s.charAt(i),s)%2!=0 || occ(s.charAt(i),s)==1)
						odd++;
				}
				if((odd-1)<=k || (distinct(s)<n && odd==n && n%2==1))
					System.out.println("YES");
				else
					System.out.printlx	n("NO");
			}
		}
	}
	public static int occ(char c,String s) {
		int cnt = 0;
		for(int i = 0;i<s.length();i++) {
			if(c==s.charAt(i))
				cnt++;
		}
		return cnt;
	}
	public static int distinct(String s) {
		String tmp = "";
		for(int i = 0;i<s.length();i++) {
			if(!tmp.contains(s.charAt(i)+""))
				tmp+=s.charAt(i)+"";
		}
		return tmp.length();
	}
}
