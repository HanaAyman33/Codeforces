/*
Given an integer 𝑛, find an integer 𝑥 such that:
2≤𝑥≤𝑛.
The sum of multiples of 𝑥 that are less than or equal to 𝑛 is maximized. 
Formally, 𝑥+2𝑥+3𝑥+⋯+𝑘𝑥 where 𝑘𝑥≤𝑛 is maximized over all possible values of 𝑥.
 */
import java.util.*;
public class MaximumMultipleSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int sum = 0,ans = 2;
			for(int i = 2;i<=n;i++) {
				int tmp = i,j = 2;
				while(j*i<=n) {
					tmp+=(j*i);
					j++;
				}
				if(sum<tmp) {
					sum = tmp;
					ans = i;
				}
			}
			System.out.println(ans);
		}
	}
}
