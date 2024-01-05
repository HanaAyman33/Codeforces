import java.util.*;
public class TheCorridor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int k = 0,time = 0;
			List<Integer> D = new ArrayList<>();
			List<Integer> S = new ArrayList<>();
			for(int i = 0;i<n;i++) {
				int d = sc.nextInt(),s = sc.nextInt();
				time+=s;
				D.add(d);
				S.add(s);
			}
			int i = 0;
			while(i<n) {
				if(S.get(i)>(time-S.get(i)+1))
					i++;
				else {
					k = D.get(i);
					break;
				}
			}
			System.out.println(k);
		}
	}
}