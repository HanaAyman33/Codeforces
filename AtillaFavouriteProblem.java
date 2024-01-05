import java.util.*;
public class AtillaFavouriteProblem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String alph = "abcdefghijklmnopqrstuvwxyz";
			String s = sc.next();
			int index = 0;
			if(s.length()==1)
				index = alph.indexOf(s)+1;
			else {
				char max = s.charAt(0);
				for(int i = 1;i<s.length();i++) {
					if(max<s.charAt(i))
						index = alph.indexOf(s.charAt(i))+1;
				}
			}
				System.out.println(index);
		}
	}
}