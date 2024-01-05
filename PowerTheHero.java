import java.util.*;
  public class PowerTheHero {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();
    	while(t-->0) {
    		int n = sc.nextInt();
    		Stack<Long> bonus = new Stack<>();
    		long power = 0;
    		for(int i = 0;i<n;i++) {
    			long x= sc.nextLong();
    			if(x!=0) {
    				bonus.push(x);
    				Collections.sort(bonus);
    			}
    			else {
    				if(bonus.isEmpty())
    					power+=x;
    				else{
    					power+=bonus.peek();
    					bonus.pop();
    				}
    			}
    		}
    		System.out.println(power);
    	}
    }
}