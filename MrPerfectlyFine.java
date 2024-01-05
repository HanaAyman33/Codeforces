import java.util.*;
public class MrPerfectlyFine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
			int n = sc.nextInt();
			List<Integer> zero = new ArrayList<>();
			List<Integer> one = new ArrayList<>();
			List<Integer> two = new ArrayList<>();
			List<Integer> three = new ArrayList<>();
			int minutes = 0;
			for(int i = 0;i<n;i++) {
				int m = sc.nextInt();
				String s = sc.nextLine();
				if(n==1) {
					minutes = m;
					break;
				}
				else{
					switch(s) {
					case "00": zero.add(m);break;
					case "01": one.add(m);break;
					case "10": two.add(m);break;
					default: three.add(m);
					}	
				}
			}
			if(n>1){
				Collections.sort(zero);
				Collections.sort(one);
				Collections.sort(two);
				Collections.sort(three);
				//minutes = one.get(0)+two.get(0);
			}
			//System.out.println(minutes);
			System.out.println(one.get(0));
		}
	}
}
/*if(zero.size()==1 && three.size()==0) {
if(one.get(0)+two.get(0)>zero.get(0))
	minutes = zero.get(0);
}
else if(three.size()==1 && zero.size()==0) {
if(one.get(0)+two.get(0)>three.get(0))
	minutes = three.get(0);
}
else
minutes = (one.get(0))+(two.get(0));*/

