import java.util.*;
public class Upscaling {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			char[][] check = new char[2*n][2*n];
			int cnt1 = 0;
			int cnt2 = 0;
			char tmp = '#';
			for(int i = 0;i+1<check.length;i+=2) {
				cnt2 = cnt1;
				for(int j = 0;j+1<check.length;j+=2) {
					if(cnt2%2==0)
						tmp = '#';
					else
						tmp = '.';
					check[i][j] = tmp;
					check[i+1][j] = tmp;
					check[i][j+1] = tmp;
					check[i+1][j+1]= tmp;
					cnt2++;
				}
				cnt1++;
			}
			for(int i =0 ;i<check.length;i++) {
				System.out.print(check[i]);
			System.out.println();
			}
		}
	}

}
