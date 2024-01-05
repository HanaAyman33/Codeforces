import java.io.*;
import java.util.*;
public class Punctuation {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		String s = sc.nextLine();
		String result = "";
		/*else {
			while(i<s.length()) {
				String temp = "";
				while(s.charAt(i)!=' ') {
					if(s.charAt(i)<'a' || s.charAt(i)>'z') {
						temp+=s.charAt(i)+" ";
						i++;
						break;
					}
					temp+=s.charAt(i);
					i++;
				}
				if(s.charAt(i)==' ')
					i++;
				else
					result+=temp+" ";
		}
	}*/
			int i  = 0;
			int spaces = 0;
			while(i<s.length() && s.charAt(s.length()-1)!=' ') {
				if(s.charAt(i)==' '){
					spaces = 0;
					for(int j = i;s.charAt(j)==' ';j++)
						spaces++;
					i+=spaces;
					if(!(s.charAt(i)<'a') && !(s.charAt(i)>'z'))
						result+=" ";
				}
				else {
					if(s.charAt(i)=='?' || s.charAt(i)=='.' || s.charAt(i)=='!' || s.charAt(i)==',')
						result+= s.charAt(i)+" ";
					else
						result+=s.charAt(i);
					i++;
				}
			}
		System.out.println(result);
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