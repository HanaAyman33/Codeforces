import java.util.*;
public class PlusOrMinus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
			if(a+b==c)
				System.out.println("+");
			else
				System.out.println("-");
		}
	}
}
