import java.io.*;
import java.util.*;
public class AC {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		PrintWriter pw = new PrintWriter(System.out);
		char[] a = sc.next().toCharArray();
		Stack<Character> result = new Stack<>();
		for(int i = 0;i<a.length;i++) {
			if(result.isEmpty())
				result.push(a[i]);
			else {
				if(a[i]==result.peek())
					result.pop();
				else
					result.push(a[i]);
			}	
		}
		System.out.println(result.isEmpty()?"YES":"NO");
	}
	/*CODE1:
	 * if(a.length==1 || (a.length==2 && a[0]!=a[a.length-1]))
	System.out.println("NO");
else if(a.length==2 && a[0]==a[a.length-1])
	System.out.println("YES");
else {
	int i = 0;
	boolean flag = false;
	while(i<a.length) {
		int j = i;
		String temp = "";
		while(j<i+4) {
			temp+=a[j];
			j++;
		}
		if(temp.equals("-++-") || temp.equals("+--+"))
			flag = true;
		else
			flag = false;
		i+=4;
	}
	System.out.println(flag?"YES":"NO");
}*/
	/*CODE2:
	 * int plus = 0,minus = 0;
	for(int i = 0;i+1<a.length;i+=2) {
		if(a[i]=='+' && a[i+1]=='+')
			plus++;
		else if(a[i]=='-' && a[i+1]=='-')
			minus++;
		}
	if(minus==plus)
		System.out.println("YES");
	else
		System.out.println("NO");
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