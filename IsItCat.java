import java.util.*;
public class IsItCat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String S = sc.next();
			String s = S.toLowerCase();
			char tmp = s.charAt(0);
			String result = tmp+"";
			for(int i = 0;i+1<n;i++) {
				if(tmp!=s.charAt(i+1)) {
					tmp = s.charAt(i+1);
					result+=tmp+"";
				}
			}
			if(result.equals("meow"))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
