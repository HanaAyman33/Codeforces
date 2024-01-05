import java.util.*;
public class DistinctSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			Stack<String> stack = new Stack();
			String tmp = "";
			for(int i = 0;i<n;i++) {
				if(i==n-1) {
					tmp+=s.charAt(i)+"";
					stack.push(tmp);
				}
				else if(!(tmp.contains(s.charAt(i)+"")))
					tmp+=s.charAt(i)+"";
				else {
					stack.push(tmp);
					tmp = "";
				}
			}
			int result = 0;
			for(int i = 0;i<stack.size();i++)
				result+=stack.get(i).length();
			System.out.println(result);
		}
	}
}
