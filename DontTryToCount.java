import java.util.*;
public class DontTryToCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),m = sc.nextInt();
			String x = sc.next(),s = sc.next();
			String result = x;
			int op = 0;
			while(!result.contains(s)) {
				result+=result;
				if(result.length()>(s.length()*2) && !(result.contains(s))) {
					op = -1;
					break;
				}
				op++;
			}
			System.out.println(op);
		}
	}
}
