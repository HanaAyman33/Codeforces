import java.util.*;
public class ToMyCritics {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b =sc.nextInt(),c = sc.nextInt();
			if((a+b)>=10 || (b+c)>=10 || (a+c)>=10)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
