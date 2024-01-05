import java.util.*;
import java.util.Random;
public class BattlingWithNumbers {
	public static int LCM(int p, int q) {
		int num = 2;
		int result = 0;
		while(num<=Math.min(q, p)) {
			if(p%num==0 && q%num==0) {
				result = num;
				break;
			}
			else
				num++;
		}
		return result;
	}
	public static int GCD(int p,int q) {
		int x = Math.min(p, q);
		int max = Math.max(p, q);
		int result = 0;
		while(max!=2) {
			if(p/x==q/x)
				result = x;
			else
				max-=x;
		}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int n = sc.nextInt();  
		int[] a = new int[n];
		int[] b = new int[n];
		int x = 1;
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
			x*=Math.pow(a[i], b[i]);
		}
		int m = sc.nextInt();
		int[] c = new int[m];
		int[] d = new int[m];
		int y = 1;
		for(int i = 0;i<m;i++) {
			c[i] = sc.nextInt();	
			d[i] = sc.nextInt();
			y*=Math.pow(c[i], d[i]);
		}
		int pairs = 0;
		int tmp1 = x,tmp2 = y;
		while(tmp1<=y) {
			if(LCM(tmp1,tmp2)==x && GCD(tmp1,tmp2)==y)
				pairs++;
			else {
				tmp1 = r.nextInt(y+1-x)+x;
				tmp2 = r.nextInt(y+1-x)+x;
			}
		}
		System.out.println(pairs%998244353);
	}
}
