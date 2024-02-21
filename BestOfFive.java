
import java.util.*;
public class BestOfFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int cntA = 0,cntB = 0;
			for(int i =0 ;i<s.length();i++) {
				if(s.charAt(i)=='A')
					cntA++;
				else
					cntB++;
			}
			System.out.println(cntA>cntB?'A':'B');
		}
	}
}
