import java.util.*;
public class Eraser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),k = sc.nextInt();
			String s = sc.next();
			int o = 0,i = 0;
			while(i<n){
				if(s.charAt(i)=='B') {
					if(i+k-1<n)
						i+=k;
					else
						i++;
					o++;
				}
				else 
					i++;
			}
			System.out.println(o);
		}
	}
}
