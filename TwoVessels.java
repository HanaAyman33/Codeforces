import java.util.*;
public class TwoVessels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			double a = sc.nextDouble(),b = sc.nextDouble(),c = sc.nextDouble();
			int moves = 0;
			if(a==b)
				moves = 0;
			else {	
				double max = Math.max(a, b);
				double min = Math.min(a,b);
				while(max>c+min){
					max-=c;
					min+=c;
					moves++;
					if(max==min)
						break;
				}
				if(max>min) {
					max = max-min;
					moves++;
				}
			}
			System.out.println(moves);
		}
	}
}
