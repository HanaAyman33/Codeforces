import java.util.*;
public class Morning {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			int a = Integer.parseInt(s.charAt(0)+"");
			int b = Integer.parseInt(s.charAt(1)+"");
			int c = Integer.parseInt(s.charAt(2)+"");
			int d = Integer.parseInt(s.charAt(3)+"");
			if(a==0)
				a = 10;
			if(b==0)
				b = 10;
			if(c==0)
				c=10;
			if(d==0)
				d =10;
			int sec = a+Math.abs(b-a)+3+Math.abs(c-b)+Math.abs(d-c);
			System.out.println(sec);
		}
	}
}
