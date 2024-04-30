import java.util.Scanner;
public class EvenOddIncrements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),q = sc.nextInt();
			long[] a = new long[n];
			for(int i = 0;i<n;i++)
				a[i] = sc.nextLong();
			long[] query = new long[2];
			long sum = 0;
			for(int i = 0;i<q;i++) {
				query[0] = sc.nextLong();
				query[1] = sc.nextLong();
				sum = 0;
				for(int j = 0;j<n;j++) {
					if((query[0]==0 && a[j]%2==0) || (query[0]==1 && a[j]%2==1)) {
						a[j]+=query[1];
					}
					sum+=a[j];
				}
				System.out.println(sum);	
			}
		}
	}

}
