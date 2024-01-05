import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    static List<Long> dp;
    static List<Boolean> used;
    static List<List<Long>> sl;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = 1;
        boolean multi = true;
        if (multi) {
            t = input.nextInt();
        }
        
        for (int i = 1; i <= t; i++) {
            solve(input, i);
            System.out.println();
        }
        
        input.close();
    }

    public static void solve(Scanner input, int tc) {
        int n, k;
        n = input.nextInt();
        k = input.nextInt();
        
        dp = new ArrayList<>(n);
        used = new ArrayList<>(n);
        sl = new ArrayList<>(n);
        
        for (int i = 0; i < n; i++) {
            dp.add(input.nextLong());
            used.add(false);
            sl.add(new ArrayList<>());
        }
        
        for (int i = 0; i < k; i++) {
            int e = input.nextInt();
            dp.set(e - 1, 0L);
        }
        
        for (int i = 0; i < n; i++) {
            int m = input.nextInt();
            List<Long> edges = sl.get(i);
            for (int j = 0; j < m; j++) {
                long e = input.nextLong();
                edges.add(e - 1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            get(i);
        }
        
        for (long e : dp) {
            System.out.print(e + " ");
        }
    }

    public static long get(int v) {
        if (used.get(v)) {
            return dp.get(v);
        }
        
        used.set(v, true);
        long s = 0;
        List<Long> edges = sl.get(v);
        for (long u : edges) {
            s += get((int) u);
        }
        
        if (!edges.isEmpty()) {
            dp.set(v, Math.min(dp.get(v), s));
        }
        
        return dp.get(v);
    }
}