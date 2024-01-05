import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PerfectSquare {
    private static final int MAXN = 1010;
    
    private static int n;
    private static String[] A = new String[MAXN];
    
    private static int solve() {
        int ans = 0;
        for (int i = 0; i * 2 < n; ++i) {
            for (int j = 0; j * 2 < n; ++j) {
                List<Character> M = new ArrayList<>();
                M.add(A[i].charAt(j));
                M.add(A[n - 1 - j].charAt(i));
                M.add(A[n - 1 - i].charAt(n - 1 - j));
                M.add(A[j].charAt(n - 1 - i));
                
                char c = Collections.max(M);
                for (char e : M) {
                    ans += c - e;
                }
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            n = scanner.nextInt();
            for (int i = 0; i < n; ++i) {
                A[i] = scanner.next();
            }
            int result = solve();
            System.out.println(result);
        }
    }
}