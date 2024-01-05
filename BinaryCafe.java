import java.util.*;
public class BinaryCafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
				int n = sc.nextInt(),k = sc.nextInt();
				k = Math.min(k,30);
				System.out.println((Math.min(n,(1<< k)-1)+1));
		}
	}
}
