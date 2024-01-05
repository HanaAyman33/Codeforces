import java.io.*;
import java.util.*;

public class Rewards {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int a1 = sc.nextInt(),a2 = sc.nextInt(),a3 = sc.nextInt();
		int b1 = sc.nextInt(),b2 = sc.nextInt(),b3 = sc.nextInt();
		int cups = a1+a2+a3;
		int medals = b1+b2+b3;
		int n = sc.nextInt();
		 int neededForCups = (cups + 5 - 1)/5 , neededForMedals = (medals + 10 - 1) / 10;
	        if(neededForCups + neededForMedals <= n)
	            pw.println("YES");
	        else
	            pw.println("NO");
	        pw.flush();
		/*int cups = a1+a2+a3;
		int medals= b1+b2+b3;
		if(n<2)
			System.out.println("NO");
		else {
			int shelves = 0;
			if(cups<=5 && medals<=10)
				System.out.println("YES");
			else {
				shelves = (cups/5) + (medals/10);
				if(shelves<=n)
					System.out.println("YES");
				else
					System.out.println("NO");	
			}	
		}
		*/
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