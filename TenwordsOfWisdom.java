import java.util.Scanner;
public class TenwordsOfWisdom {
	public static void main(String[] args){	
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int max = -1;
			int result = 0;
			int n = sc.nextInt();
			for(int i = 1;i<=n;i++) {
				int a = sc.nextInt(),b = sc.nextInt();
				if(a<=10) {
					max = Math.max(max, b);
					if(max==b)
						result = i;
				}
			}
			System.out.println(result);
		}
	
	}
}
