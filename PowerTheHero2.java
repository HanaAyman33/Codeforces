import java.math.BigInteger;
import java.util.*;
public class PowerTheHero2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Stack<BigInteger> bonus = new Stack<>();
			BigInteger power = BigInteger.valueOf(0);
			for(int i = 0;i<n;i++) {
				BigInteger x =  BigInteger.valueOf(sc.nextInt());
				if(x.signum()!=0){
					bonus.push(x);
					Collections.sort(bonus);
				}
				else {
					if(bonus.isEmpty())
						power.add(x);
					else{
						power.add(bonus.peek());
						bonus.pop();
					}
				}
			}
			System.out.println(power);
		}
	}
}