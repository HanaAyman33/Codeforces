import java.util.*;
public class YetAnotherPermutationProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int t = sc.nextInt();
		System.out.println(gcd(14,10,1));
		//while(t-->0) {
		//	int n = sc.nextInt();
			
		//}
	}
	public static int gcd(int a,int b,int c) {
		if(a%c==0 && b%c==0) {
			int result = a/c;
			if(c==a || c==b)
				return result;
		}
		return gcd(a,b,++c);
	}
}
