/*
 * Given a 𝑛 by 𝑚 grid consisting of '.' and '#' characters, there exists a whole
 *  manhattan circle on the grid. The top left corner of the grid has coordinates (1,1),
 *   and the bottom right corner has coordinates (𝑛,𝑚).
Point (𝑎,𝑏) belongs to the manhattan circle centered at (ℎ,𝑘) if |ℎ−𝑎|+|𝑘−𝑏|<𝑟, 
where 𝑟 is a positive constant.
On the grid, the set of points that are part of the manhattan circle is marked as '#'. 
=> Find the coordinates of the center of the circle.
 */
import java.util.*;
public class ManhattanCircle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),m = sc.nextInt();
			char[][] grid = new char[n][m];
			int cnt = 0;
			boolean flag = false;
			int r = 1,c = 1;
			for(int i = 0;i<n;i++) {
				grid[i] = sc.next().toCharArray();
				int tmp = 0;
				for(int j = 0;j<m;j++) {	
					if(grid[i][j]=='#') {
						tmp++;
						if(!flag) {
							flag = true;
							r = i+1;
							c = j+1;
						}
					}
				}
				cnt = Math.max(cnt, tmp);
			}
			if(cnt!=1)
				r+=(cnt/2);
			System.out.println(r + " " + c);	
		}
	}
}
