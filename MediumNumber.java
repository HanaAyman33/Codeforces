import java.util.*;
public class MediumNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
			if((a>b && a<c && c>b) || (a<b && a>c && c<b))
				System.out.println(a);
			else if((b>a && b<c && c>a) || (b>c && b<a && a>c))
				System.out.println(b);
			else
				System.out.println(c);
		}
	}
}
