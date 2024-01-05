import java.io.*;
import java.util.*;
public class MoreRam {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt(); // test cases
		while(t-->0) {
			int n = sc.nextInt(),k = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int max = -1;
			int min = 100000;
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
				max = Math.max(max, a[i]);
				min = Math.min(min, b[i]);
			}
			Arrays.sort(a);
			Arrays.sort(b);
			if(k==1 && min>k)
				System.out.println("1");
			else{
			here:while(k<max){
					for(int i = 0;i<n;i++) {
						if(b[i]<=k)
							k+=b[i];
						if(k>max || i==n-1) {
							System.out.println(k);
							break here;
						}
					}
				}	
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