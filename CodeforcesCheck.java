import java.util.*;
public class CodeforcesCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char c = sc.next().charAt(0);
			if("codeforces".contains(c+""))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
