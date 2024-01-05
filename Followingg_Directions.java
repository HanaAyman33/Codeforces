import java.io.*;
import java.util.*;
public class Followingg_Directions {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		String[] result = new String[t];
		for(int k = 0;k<t;k++) {
			int newRight = 0;
			int newLeft = 0;
			int n = sc.nextInt();//length of the string
			String s = sc.nextLine();//string of length n
			for(int j = 0;j<n && n>=1 && n<=50;j++){
				if(s.charAt(j)=='U')
					newRight++;
				if(s.charAt(j)=='R')
					newLeft++;
				if(s.charAt(j)=='L')
					newLeft--;
				if(s.charAt(j)=='D')
					newRight--;
			}
			if(newRight<0 || newLeft<0 || (newRight==0 && newLeft==0))
				System.out.println("NO");
			else
				System.out.println("YES");
		}
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