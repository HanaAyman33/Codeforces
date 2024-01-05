import java.util.*;
public class SetsAndUnion {
	public static int getMaxHelper(Set a,Set b) {
		int cnt = 0;
		boolean flag = false;
		for(int i = 0;i<a.size();i++){
			flag = false;
			for(int j = 0;j<b.size();j++) {
				if(a.getNum(i)!=b.getNum(j))
					flag = true;
			}
			if(flag)
				cnt++;
		}
		flag = false;
		for(int i = 0;i<b.size();i++) {
			flag = false;
			for(int j = 0;j<a.size();j++) {
				if(a.getNum(j)!=b.getNum(i))
					flag = true;
			}
			if(flag)
				cnt++;
		}
		return cnt;
	}
	public static int getMax(Set[] sets) {
		int max = 0 ;
		int secondMax = 0;
		for(int i = 0;i<sets.length;i++) {
			for(int j = 0;j< sets.length && j!=i;j++) {
				max = Math.max(max, getMaxHelper(sets[i],sets[j]));
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			Set[] sets = new Set[n];
			for(int i = 0;i<n;i++) {
				int k = sc.nextInt();
				sets[i] = new Set(k);
				for(int j = 0;j<k;j++)
					sets[i].add(sc.nextInt());
			}
			System.out.println(getMax(sets));
			
		}
	}
}
