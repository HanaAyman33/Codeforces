/*  Choose any number 𝑥 from the array 𝑎, and any letter of the English alphabet 𝑦.
	Replace all occurrences of number 𝑥 with the letter 𝑦.
	After the transformation all letters are united into a string, in our example we get the string "cacta".
	Having the array 𝑎 and the string 𝑠 determine if the string 𝑠 could be got from 
	the array 𝑎 after the described transformation?
 */
import java.util.*;
public class NumberReplacement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int [] a = new int[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextInt();
			String s = sc.next();
			boolean flag = true;
			here:for(int i = 0;i<n;i++) {
				int tmp = a[i];
				for(int j = i+1;j<n;j++) {
					if(a[i]==a[j]) {
						if(s.charAt(i)!=s.charAt(j)) {
							flag = false;
							break here;
						}
					}
				}
			}
			System.out.println(flag?"YES":"NO");
		}
	}
}
