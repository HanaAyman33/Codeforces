import java.util.*;
public class FollowingDirections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			int x = 0;
			int y = 0;
			String result = "NO";
			for(int i =0 ;i<n;i++) {
				char tmp = s.charAt(i);
				switch(tmp) {
				case 'U':y++;break;
				case 'L':x--;break;
				case 'R':x++;break;
				case 'D':y--;break;
				}
				if(x==1 && y==1) {
					result = "Yes";
				}
			}
			System.out.println(result);
		}
	}
}
