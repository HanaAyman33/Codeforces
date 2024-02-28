/*You are given an array 𝑎1,𝑎2,…,𝑎𝑛.

In one move, you can perform either of the following two operations:

Choose an element from the array and remove it from the array. As a result, 
the length of the array decreases by 1;
Choose an element from the array and increase its value by 1.
You can perform any number of moves. If the current array becomes empty, then no more moves 
can be made.

Your task is to find the minimum number of moves required to make the sum of the elements of 
the array 𝑎 divisible by 3. It is possible that you may need 0 moves.

Note that the sum of the elements of an empty array (an array of length 0) is equal to 0.
 */
import java.util.*;
public class FastThreeTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for(int i = 0;i<n;i++) {
				a[i] = sc.nextInt();
				sum+=a[i];
			}
			int ans = 0;
			if(sum%3!=0) {
				boolean flag = false;
				for(int i =0 ;i<n;i++) {
					if((sum-a[i])%3==0) {
						flag = true;
						ans = 1;
						break;
					}
				}
				if(!flag) {
					while(sum%3!=0) {
						sum++;
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}

}
