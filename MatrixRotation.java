import java.util.*;
public class MatrixRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int[][] a = new int[2][2];
			for(int i = 0;i<2;i++) {
				for(int j = 0;j<2;j++)
					a[i][j] = sc.nextInt();
			}
			int max = Math.max(a[0][0],a[1][1]-a[0][0]);
			int min = Math.min(a[0][0],a[1][1]-a[0][0]);
			if(max+min!=3)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
