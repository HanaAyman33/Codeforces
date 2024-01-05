import java.util.*;
import java.util.Random;
public class NonCoprimeSplit {
	/*public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
	}*/
	 public static int minDivisor(int n) {
	        for (int d = 2; d <= Math.round(Math.sqrt(n)); d++) {
	            if (n % d == 0) {
	                return d;
	            }
	        }
	        return n;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random R = new Random();
		int t = sc.nextInt();
		while(t-->0) {
			int l = sc.nextInt();
            int r = sc.nextInt();
            
            for (int x = l; x <= r; x++) {
                int md = minDivisor(x);
                if (md != x) {
                    System.out.println(md + " " + (x - md));
                    break;
                }
                
                if (x == r) {
                    System.out.println(-1);
                }
            }
			/*int l = sc.nextInt(),r = sc.nextInt();
			try{
				int a = R.nextInt(1,r),b = R.nextInt(1,r);
				while(true) {
					if(gcd(a,b)!=1 && (a+b)<=l && (a+b)<=r) {
						System.out.println(a+" "+b);
						break;
					}	
				}
			}
			catch(InputMismatchException e){
				System.out.println("-1");
			}*/
		}
	}
}