import java.io.*;
import java.util.*;
public class Bishop {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt();
		for(int i = 0;i<t;i++) {
			char[][] a = new char[8][8];
			for(int j = 0;j<8;j++)
					a[j]= sc.next().toCharArray();
			for(int j = 0;j+2<8;j++) {
				boolean flag = false;
				for(int k  = 0;k+2<8;k++) {
					if(a[j][k]=='#'  && a[j][k+2]=='#' 
						&& a[j+1][k+1]=='#'
						&& a[j+2][k]=='#' && a[j+2][k+2]=='#') {
						System.out.println((j+2)+" "+(k+2));
						flag =true;
					}
				}
				if(flag)
					break;
			}
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