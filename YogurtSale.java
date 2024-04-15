/*	The price of one yogurt at the "Vosmiorochka" store is 𝑎 burles, but there is
a promotion where you can buy two yogurts for 𝑏 burles.
Maxim needs to buy exactly 𝑛 yogurts.
When buying two yogurts, he can choose to buy them at the regular price or at the promotion price.
What is the minimum amount of burles Maxim should spend to buy 𝑛 yogurts?
 */
import java.util.*;
public class YogurtSale {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
			int ans = 0;
			if(n%2==0)
				ans = Math.min((a*n), ((n/2)*b));
			else 
				ans = Math.min((a*n), ((n/2)*b)+a);
			System.out.println(ans);
		}
	}
}