//given the coordinates of a square,return the area
import java.util.*;
public class Square {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int maxX = -10000000,minX = 100000;
			int maxY = -10000000,minY = 100000;
			for(int i =0 ;i<4;i++) {
				int x = sc.nextInt(),y = sc.nextInt();
				maxX = Math.max(maxX, x);
				maxY = Math.max(maxY, y);
				minX = Math.min(minX, x);
				minY = Math.min(minY, y);
			}
			int area = Math.abs(maxX-minX) * Math.abs(maxY-minY);
			System.out.println(area);
		}
	}
}
