import java.io.*;
import java.util.*;
public class BOG{
	public static void main(String[] args) throws IOException {	
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String string = s.toLowerCase();
	int count = 0;
	boolean flag;
	for(int i = 0;i<string.length();i++) {
		flag = true;
		for(int j = 0;j<string.length() && j!=i;j++) {
			if(string.charAt(i)==string.charAt(j)) {
				flag = false;
				break;
			}
		}
		if(flag)
			count++;
	}
	if(count%2==0)
		System.out.println("CHAT WITH HER!");
	else
		System.out.println("IGNORE HIM!");
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
