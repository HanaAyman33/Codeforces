import java.util.*;
public class TargetPractice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char[][] a = new char[10][10];
			for(int i = 0;i<10;i++) {
				a[i] = sc.next().toCharArray();
			}
			int points = 0;
			for(int i = 0;i<10;i++) {
				for(int j = 0;j<10;j++) {
					if(a[i][j]=='X') {
						if((i>=0 && i<=9 && (j==0 || j==9) ||
								(j>=0 && j<=9 && (i==0 || i==9))))
								points++;
						else if((i>=1 && i<=8 && (j==1 || j==8) )||
								(j>=1 && j<=8 && (i==1 || i==8)))
								points+=2;
						else if((i>=2 && i<=7 && (j==2 || j==7)) ||
								(j>=2 && j<=7 && (i==7 || i==2)))
								points+=3;
						else if((i>=3 && i<=6 && (j==3 || j==6)) ||
								(j>=3 && j<=6 && (i==3 || i==6)))
								points+=4;
						else if((i>=4 && i<=5 && (j==4 || j==5)) ||
								(j>=4 && j<=5 && (i==4 || i==5)))
								points+=5;
					}
				}
			}
			System.out.println(points);
		}
	}
}
