import java.util.*;
public class InsertDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),d = sc.nextInt();
			String s = sc.next();
			String result = "";
			int index = 0;
			if(n==1) {
				if(Integer.parseInt(s.charAt(0)+"")<d)
					result = d+""+s.charAt(0)+"";
				else
					result = s.charAt(0)+""+d+"";
			}
			else {
				if(d==0) {
					result+=s+"0";
				}
				else{
					for(int i = 0;i<n;i++) {
						if(Integer.parseInt(s.charAt(i)+"")<d) {
							index = i;
							break;
						}
						else if(i==n-1 && Integer.parseInt(s.charAt(i)+"")>d)
							index = n-1;
					}
					if(index==n-1 && Integer.parseInt(s.charAt(n-1)+"")>d) {
						result+=s+d+"";
					}
					else {
						result+=s.substring(0,index);
						result+=d+"";
						result+=s.substring(index,n);
					}
				}
					
			}
			System.out.println(result);
		}
	}
}
