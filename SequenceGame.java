import java.util.*;
public class SequenceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                int x = sc.nextInt();
                if (i > 0 && a.get(a.size() - 1) > x) {
                    a.add(1);
                }
                a.add(x);
            }
            System.out.println(a.size());
            for (int el : a) {
                System.out.print(el + " ");
            }
            System.out.println();
		}
	}
}
