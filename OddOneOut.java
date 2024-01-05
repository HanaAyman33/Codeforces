import java.util.*;
public class OddOneOut {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
			if(a==b && c!=b)
				System.out.println(c);
			else if(b==c && a!=b)
				System.out.println(a);
			else
				System.out.println(b);
		}
	}
}
