import java.util.*;
public class Buttons {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int t = sc.nextInt();  // test cases
    	while(t-->0) {
    		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
    		if(c%2==0)
    			System.out.println(a<=b?"Second":"First");
    		else
    			System.out.println(a>=b?"First":"Second");
    		
    		/*if(a==b && b==c)
    			System.out.println("First");
    		else{
    			boolean turn = false;
        		int sum = a+b+c;
    			while(sum!=0) {
    				if(a!=0 || c!=0 || b!=0)
    					sum--;
    				if(!turn)
    					turn = true;
    				else
    					turn = false;
    			}
    			System.out.println(turn?"Second":"First");
    		}*/
    	}
    }
}


