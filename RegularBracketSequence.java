import java.io.*;
import java.util.*;
public class RegularBracketSequence {
	 public static int findMaxLength(String bracketSequence) {
	        Stack<Character> stack = new Stack<>();
	        int maxLength = 0;
	        for (char c : bracketSequence.toCharArray()) {
	            if (c == '(') {
	                stack.push(c);
	            } else if (c == ')') {
	                if (!stack.isEmpty()) {
	                    stack.pop();
	                    maxLength += 2;
	                }
	            }
	        }

	        return maxLength;
	    }
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String bracketSequence = sc.nextLine();
		int maxLength = findMaxLength(bracketSequence);
		System.out.println(maxLength);
		/*String s = sc.nextLine();
		int cnt1 = 0,cnt2 = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='(')
				cnt1++;
			else
				cnt2++;
		}
		if(s.length()%2==1) 
			System.out.println(s.length()-1);
		else if(s.charAt(0)!='(' || s.charAt(s.length()-1)!=')')
			System.out.println(cnt1+cnt2-2);*/
	}
	static class Scanner {
		StringTokenizer st;
		BufferedReader br;

		public Scanner(InputStream s) {
			br = new BufferedReader(new InputStreamReader(s));
		}

		public String next() throws IOException {
			while (st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();
		}

		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}

		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}

		public String nextLine() throws IOException {
			return br.readLine();
		}

		public double nextDouble() throws IOException {
			String x = next();
			StringBuilder sb = new StringBuilder("0");
			double res = 0, f = 1;
			boolean dec = false, neg = false;
			int start = 0;
			if (x.charAt(0) == '-') {
				neg = true;
				start++;
			}
			for (int i = start; i < x.length(); i++)
				if (x.charAt(i) == '.') {
					res = Long.parseLong(sb.toString());
					sb = new StringBuilder("0");
					dec = true;
				} else {
					sb.append(x.charAt(i));
					if (dec)
						f *= 10;
				}
			res += Long.parseLong(sb.toString()) / f;
			return res * (neg ? -1 : 1);
		}

		public boolean ready() throws IOException {
			return br.ready();
		}

	}
}