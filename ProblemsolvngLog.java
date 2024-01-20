import java.util.*;

//For each testcase, print a single integer 
//— the number of problems Monocarp solved during the contest.
public class ProblemsolvngLog {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			char[] s = sc.next().toCharArray();
			Arrays.sort(s);
			String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			int cnt = 0;
			int i = 0,j = i+1;
			while(i<s.length && j<s.length) {
				j = i+1;
				int x = alpha.indexOf(s[i])+1;
				int tmp = 1;
				while(j<s.length && s[i]==s[j]) {
					tmp++;
					j++;
				}
				if(tmp>=x)
					cnt++;
				i = j;
			}
			System.out.println(cnt);
		}
	}
}
