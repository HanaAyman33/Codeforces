import java.util.*;
public class ShortSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			if(s.equals("bca") || s.equals("cab"))
				System.out.println("NO");
			else
				System.out.println("YES");
		}
	}
}
