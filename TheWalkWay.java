import java.util.*;
public class TheWalkWay {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt()	// # of benches
			,m = sc.nextInt()	//# of cookie sellers
			,d = sc.nextInt();	// value of parameter
			int[] a = new int[m];
			for(int i = 0;i<m-1;i++)
				a[i] = sc.nextInt();
			int i = m;
			while(i-->0) {
				a[0]=1-d;
				a[m-1]=n+1;
				int mn=210444,cnt=0;
				for(int j = 1;j+1<=m-1;j++){
					int s1=a[j]-a[j-1]-1,s2=a[j+1]-a[j]-1,s3=a[j+1]-a[j-1]-1;
					int x=s3/d-s1/d-s2/d;
					if(x<mn){
						cnt=0;
						mn=x;
					}
					if(x==mn) cnt++;
				}
				int sum=0;
				for(int j=1;j<=m-1;j++){
					sum+=(a[j]-a[j-1]-1)/d;
				}
				System.out.println((sum+mn+m-1)+" "+(cnt));
			}
			
		}
	}
}
