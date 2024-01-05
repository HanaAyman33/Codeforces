import java.util.*;
public class RmovalOfUnattractivePairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			String s = sc.next();
			Stack<Character> st = new Stack<Character>();
			for(int i = 0;i<n;i++) {
				if(st.isEmpty())
					st.push(s.charAt(i));
				else {
					if(s.charAt(i)==st.peek())
						st.push(s.charAt(i));
					else
						st.pop();
				}
			}
			System.out.println(st.size());
		}
	}
}
//Accepted solution
/*import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        for (int i = 0; i < t; i++) {
            solve(input);
        }

        input.close();
    }

    public static void solve(Scanner input) {
        int n = input.nextInt();
        input.nextLine();

        int[] cnt = new int[26];
        String s = input.nextLine();
        for (char c : s.toCharArray()) {
            cnt[(int) c - 97]++;
        }

        int mx = 0;
        for (int i = 0; i < 26; i++) {
            mx = Math.max(mx, cnt[i]);
        }

        int result = Math.max(n % 2, 2 * mx - n);
        System.out.println(result);
    }
}
*/