import java.io.*;
import java.util.*;
public class SubsringSort {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		String max = "";
		String[] a = new String[n];
		int[] l = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextLine();
			l[i] = a[i].length();
			if(a[i].length()>max.length())
				max = a[i];
		}
		boolean flag = true;;
		for(int i = 0;i<n;i++) {
			if(!(max.contains(a[i]))) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
			Arrays.sort(l);
			String[] result = new String[n];
			result[n-1] = max;
			for(int i = 0;i<n-1;i++) {
				for(int j = 0;j<n-1;j++) {
					if(l[i]==a[j].length()) {
						result[i] = a[j];
						break;
					}
				}
			}
			for(int i = 0;i<n;i++)
				System.out.println(result[i]);
		}
		else
			System.out.println("NO");
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