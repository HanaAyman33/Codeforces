import java.util.*;
public class CountPairs {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			String s1 = "" ;	//LowerCase characters
			String s2 = "";		//UpperCase characters;
			for(int i = 0;i<n;i++) {
				if(s.charAt(i)>='a' && s.charAt(i)<='z')
					s1+=s.charAt(i)+"";
				else
					s2+=s.charAt(i)+"";
			}
			
		}
	}
}
