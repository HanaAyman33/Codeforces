import java.util.*;
public class LoveStory {
	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s1 = sc.next(),s2 = "codeforces";
			int n = 0;
			for(int i = 0;i<10;i++) {
				if(s1.charAt(i)!=s2.charAt(i))
					n++;
			}
			System.out.println(n);
		}
	}
}
