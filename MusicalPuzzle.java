import java.util.*;
public class MusicalPuzzle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			String s = sc.next();
			String st = s.charAt(0)+"";
			for(int i = 1;i<n;i++) {
				if(!(st.contains(s.charAt(i)+"")))
					st+=s.charAt(i)+"";
			}
			if(n%2==1 && st.length()<s.length())
				System.out.println(st.length()+1);
			else if(n%2==1 && st.length()==s.length())
				System.out.println(st.length()-1);
			else
				System.out.println(st.length());
		}
	}
}
