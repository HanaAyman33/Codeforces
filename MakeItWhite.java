/*
You have a horizontal strip of 𝑛 cells. Each cell is 
either white or black.
You can choose a continuous segment of cells once and paint 
them all white. 
After this action, all the black cells in this segment will 
become white, and the white ones will remain white.
What is the minimum length of the segment that needs to be 
painted white in order for all 𝑛 cells to become white?
 */
import java.util.*;
public class MakeItWhite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			String s = sc.next();
			int i = 0;
			int j = s.length()-1;
			int length = 0;
			while(i<n && j>=0) {
				if(s.charAt(i)=='B' && s.charAt(j)=='B') {
					length = j-i+1;
					break;
				}
				if(s.charAt(i)!='B')
					i++;
				if(s.charAt(j)!='B')
					j--;
			}
			System.out.println(length);
		}
	}
}
