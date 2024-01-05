import java.util.*;
public class NotQuiteLatinSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char[][] a = new char[3][3];
			for(int i = 0;i<3;i++)
				a[i] = sc.next().toCharArray();
			int sumA = 0,sumB = 0,sumC = 0;
			for(int i = 0;i<3;i++) {
				for(int j = 0;j<3;j++) {
					if(a[i][j]=='A')
						sumA++;
					else if(a[i][j]=='B')
						sumB++;
					else if(a[i][j]=='C')
						sumC++;
				}
			}
			if(sumA!=3)
				System.out.println("A");
			else if(sumB!=3)
				System.out.println("B");
			else
				System.out.println("C");
		}
	}
}