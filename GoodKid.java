import java.util.*;
public class GoodKid {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int t =sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int product = 1;
			int zero = 0;
			boolean flag = true;
			for(int i = 0;i<n;i++){
				a[i] = sc.nextInt();
				if(a[i]==0) {
					zero++;
					flag = false;
				}
				else
					product*=a[i];
			}
			int tmp = product,max = product;
			for(int i = 0;i<n;i++){
				if(!flag){
					if(product>=0 && zero==1)
						max = product;
					else 
						max = 0;
					break;
				}
				else if(a[i]!=0){
					tmp/=a[i];
					tmp*=(a[i]+1);
					max = Math.max(max, tmp);
					tmp = product;
				}
			}
			System.out.println(max);
		}
	}
}