import java.io.*;
import java.util.*;

public class Minority {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		int t = sc.nextInt(); //test cases
		while(t-->0){
            char[] c = sc.next().toCharArray();
            int z = 0;
            for(int i=0; i<c.length ; i++)
                if(c[i] == '0')
                    z++;
            if(z == c.length - z)
                pw.println(z - 1);
            else
                pw.println(Math.min(z , c.length - z));
        }
        pw.flush();
		/*while(t-->0) {
			String s = sc.nextLine();
			int count0 = 0;
			int count1 = 0;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)=='0')
					count0++;
				else
					count1++;
			}
			if(s.length()==1 || count0==count1)
				System.out.println("0");
			else {
				if(count0>count1)
					System.out.println(count1);
				else
					System.out.println(count0);
			}
			
		}*/
		/*for(int i = 0;i<t;i++) {
			String s = sc.nextLine();
			int[] fr = new int[2];
			for(int j = 0;j<s.length();j++) {
				if(s.charAt(j)=='0')
					fr[0]++;
				else
					fr[1]++;
			}
			if(s.length()==1 || fr[0]==fr[1])
				System.out.println("0");
			else if(fr[0]>fr[1])
				System.out.println(fr[1]);
			else
				System.out.println(fr[0]);
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