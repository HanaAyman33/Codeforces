import java.util.*;

public class CountPairs {
    private static final int N = 26;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    private static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String s = scanner.next();

        int[] big = new int[N];
        int[] small = new int[N];

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                big[c - 'A']++;
            } else {
                small[c - 'a']++;
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            int pairs = Math.min(small[i], big[i]);
            answer += pairs;
            small[i] -= pairs;
            big[i] -= pairs;
            int add = Math.min(k, Math.max(small[i], big[i]) / 2);
            k -= add;
            answer += add;
        }

        System.out.println(answer);
    }
}
/*import java.util.*;
public class CountPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt(),k = sc.nextInt();
			String s = sc.next().toLowerCase();
			List<Character> ch = new ArrayList<>();
			for(int i = 0;i<n;i++)
				ch.add(s.charAt(i));
			int pairs = 0;
			for(int i = 0;i<ch.size();i++) {
				for(int j = 0;j<ch.size() && j!=i;j++){
					if(ch.get(i)==ch.get(j)){
						pairs++;
						ch.remove(i);
						ch.remove(j);
					}
				}
			}
			System.out.println(pairs);
		}
	}
}*/
