import java.io.*;
import java.util.*;

public class AndryushaAndSocks {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int n = sc.nextInt();
        int[] a = new int[2 * n];
        for(int i=0; i < 2 * n ;i++)
            a[i] = sc.nextInt();
        boolean[] f = new boolean[n+1];
        int ans = 0 , cnt = 0;
        for(int i=0; i < 2 * n ;i++){
            if(!f[a[i]]){
                cnt++;
                f[a[i]] = true;
            }
            else cnt--;
            ans = Math.max(ans , cnt);
        }
        pw.println(ans);
        pw.flush();
		/*int n = sc.nextInt();// number of pairs
		int[] table = new int[2*n];
		int[] fr = new int[n+1];
		int socks = 0;
		if(n==1)
			System.out.println("1");
		else{
			for(int i=0 ;i<2*n;i++) 
				table[i] = sc.nextInt();
			for(int i = 0;i+1<table.length;i++) {
				fr[table[i]]++;
				if(table[i]!=table[i+1] && fr[table[i]]<2 && fr[table[i+1]]<2)
					socks++;
			}
			System.out.println(socks);
				
		}*/
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