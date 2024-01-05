import java.util.*;
public class CoverInWater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			int i =0 ;
			int res = 0;
			String tmp = "";
			while(i<n) {
				while(i<n && s.charAt(i)=='.') {
					tmp+=".";
					i++;
				}
				res+=get(tmp);
				tmp = "";
				i++;
			}
			System.out.println(res);
		}
	}
	public static int get(String s) {
		if(s.length()<=2)
			return s.length();
		if(s.length()==3)
			return 2;
		else
			return s.length()/2;
	}
}