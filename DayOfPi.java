import java.util.*;
public class DayOfPi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next()+'#';
			if(s.charAt(0)!='3')
				System.out.println("0");
			else {
				int result = 1;
				int j = 1;
				String pi = pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
				for(int i = 1;i<s.length();i++) {
					if(s.charAt(i)==(pi).charAt(j)) {
						result++;
						j++;
					}
				}
				System.out.println(result);
			}
		}
	}
}

