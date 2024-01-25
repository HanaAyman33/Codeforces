import java.util.*;
/*Alex is solving a problem. He has 𝑛 constraints on what the integer 𝑘 can be 
 * There are three types of constraints:
𝑘 must be greater than or equal to some integer 𝑥;
𝑘 must be less than or equal to some integer 𝑥;
𝑘 must be not equal to some integer 𝑥.
Help Alex find the number of integers 𝑘 that satisfy all 𝑛 constraints. 
It is guaranteed that the answer is finite (there exists at least one 
constraint of type 1 and at least one constraint of type 2). 
Also, it is guaranteed that no two constraints are the exact same.
 */
public class SatisfyingConstraints {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int cnt = 0,l = Integer.MIN_VALUE,r = Integer.MAX_VALUE;
			List<Integer> unequal = new ArrayList<Integer>();
			for(int i = 0;i<n;i++){
				int a = sc.nextInt(),x = sc.nextInt();
				if(a==1)
					l = Math.max(l, x);
				if(a==2)
					r = Math.min(r, x);
				else
					unequal.add(x);
			}
			for(int i = 0;i<unequal.size();i++) {
				if(unequal.get(i)>=l && unequal.get(i)<=r)
					cnt++;
			}
			if(l>r)
				System.out.println("0");
			else
				System.out.println(Math.max(r-l-cnt+2, 0));
		}
	}
}
	