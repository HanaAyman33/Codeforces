import java.io.*;
import java.util.*;
public class LessOrrEqual {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt(),k = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int min = a[0];
		int max= a[a.length-1];
		boolean flag = false;
		if(k<min)
			flag = false;
		else{
			while(min<=max) {
				int cnt = 0;
				for(int i = 0;i<n;i++) {
					if(a[i]<=min)
						cnt++;
				}
				if(cnt==k) {
					flag = true;
					break;
				}
				if(cnt>k) {
					flag = false;
					break;
				}
				min++;
			}
		}
		System.out.println(flag?min:"-1");
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