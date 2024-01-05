import java.io.*;
import java.util.*;
public class KMS {
	static int sum(int a[],int start,int end) {
		int sum = 0;
		for(int i=start-1; i<end; i++)
			sum+=a[i];
		return sum;
	}
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
		int costs[] = new int[n];
		for(int i = 0;i<n;i++)
			costs[i] = sc.nextInt();
		int sorted[] = costs.clone();
		Arrays.sort(sorted);
		int m = sc.nextInt();
		while(m-->0) {
			if(n==1){
				System.out.println(costs[0]);
			}
			else {
				int type = sc.nextInt();
				int l = sc.nextInt();
				int r = sc.nextInt();
				if(type==1) {
					System.out.println(sum(costs,l,r));
				}else {
					System.out.println(sum(sorted,l,r));
				}
			}
		}
		
		
	}
		/*for(int i = 0;i<n;i++)
			costs[i] = sc.nextInt();
		int m = sc.nextInt();
		for(int i = 0;i<m;i++){
			int type = sc.nextInt();
			int sum = 0;
			int l = sc.nextInt();
			int r = sc.nextInt();
			if(type==1) {
				for(int j = l-1;j<r;j++)
					sum+=costs[j];
			}
			else {
				Arrays.sort(costs);
				for(int j = l-1;j<r;j++)
					sum+=costs[j];
			}
			System.out.println(sum);
		}*/
	
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