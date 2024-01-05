import java.util.*;
public class AmbitiousKid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int min = 100000000;
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
			min = Math.min(min,Math.abs(a[i]));
		}
		if(min==0)
			System.out.println("0");
		else {
			System.out.println(min);
		}
	}
}
