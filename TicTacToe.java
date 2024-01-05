import java.util.*;
public class TicTacToe {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char[][] a = new char[3][3];
			for(int i = 0;i<3;i++)
				a[i] = sc.next().toCharArray();
			String tmp = "";
			for(int i = 0;i+2<3;i++) {
				for(int j = 0;j+2<3;j++) {
					if(((a[i][j]==a[i][j+1] && a[i][j]==a[i][j+2]) || (a[i][j]==a[i+1][j] && a[i][j]==a[i+2][j])
						|| (a[i][j]==a[i+1][j+1] && a[i][j]==a[i+2][j+2])) && a[i][j]!='.')
						tmp = a[i][j]+"";
					else if(a[i+1][j]==a[i+1][j+1] && a[i+1][j]==a[i+1][j+2] && a[i+1][j]!='.')
						tmp = a[i+1][j]+"";
					else if(((a[i+2][j]==a[i+2][j+1] && a[i+2][j]==a[i+2][j+2]) || 
							(a[i+2][j]==a[i+1][j+1] && a[i+2][j]==a[i][j+2])) && a[i+2][j]!='.')
						tmp = a[i+2][j]+"";
					else if((a[i][j+1])==a[i+1][j+1] && a[i][j+1]==a[i+2][j+1] && a[i][j+1]!='.')
						tmp = a[i][j+1]+"";
					else if(a[i][j+2]==a[i+1][j+2] && a[i][j+2]==a[i+2][j+2] && a[i][j+2]!='.')
						tmp = a[i][j+2]+"";
					else
						tmp = ".";
				}
			}
			if(tmp.equals("X"))
				System.out.println("X");
			else if(tmp.equals("O"))
				System.out.println("O");
			else if(tmp.equals("+"))
				System.out.println("+");
			else 
				System.out.println("DRAW");
		}
	}
}