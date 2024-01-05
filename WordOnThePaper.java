import java.util.Scanner;
public class WordOnThePaper {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			char[][]a = new char[8][8];
			String result = "";
			for(int i = 0;i<8;i++) {
				a[i] = sc.next().toCharArray();
				for(int j = 0;j<8;j++) {
					if(a[i][j]!='.')
						result+=a[i][j]+"";
				}
			}
			System.out.println(result);
		}
	}
}
