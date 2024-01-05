import java.util.Scanner;
public class CiferShifer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			String result = "";
			int i = 0,j = 1;
			while(i<n && j<n) {
				if(s.charAt(i)==s.charAt(j)) {
					result+=s.charAt(i)+"";
					i = ++j;
				}
				j++;
			}
			System.out.println(result);
		}
	}
}
