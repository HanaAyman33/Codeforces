
import java.io.*;
import java.util.*;
public class Extrema{
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		long x = sc.nextLong();
		long y = sc.nextLong();
		long z = sc.nextLong();
		if(x>=1 && x<=Math.pow(10,18) && y>=1 && y<=Math.pow(10,18)
				&& z>=1 && z<=Math.pow(10,18)) {
			System.out.println(Math.min(x, Math.min(y, z)));
			System.out.println(Math.max(x, Math.max(y, z)));
			//System.out.println(x<y && x<z?x:y<x && y<z?y:z); //minimum
			//System.out.println(x>y && x>z?x:y>z && y>x?y:z); //maximum
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

