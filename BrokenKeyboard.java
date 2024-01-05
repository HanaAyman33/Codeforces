import java.util.*;
public class BrokenKeyboard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			Stack<Character> st = new Stack<Character>();
			Stack<Character> tmp = new Stack<Character>();
			boolean flag = false;
			for(int i = 0;i<s.length();i++) {
				if(s.charAt(i)!='b' && s.charAt(i)!='B')
					st.push(s.charAt(i));
				else {
					flag = false;
					if(s.charAt(i)=='B')
						flag = true;
					while(!st.isEmpty()){
						if((!flag && st.peek()>='a' && st.peek()<='z')
							|| (flag && st.peek()>='A' && st.peek()<='Z')) {
							st.pop();
							break;
						}
						else
							tmp.push(st.pop());
					}
					while(!tmp.isEmpty())
						st.push(tmp.pop());
				}
			}
			String res = "";
			while(!st.isEmpty())
				res = st.pop()+""+res;
			System.out.println(res);
		}
	}
}
//Accepted solution
/*import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();

        for (int i = 0; i < t; i++) {
            String s = input.nextLine();
            solve(s);
        }

        input.close();
    }

    public static void solve(String s) {
        List<Character> chars = new ArrayList<>();
        for (char c : s.toCharArray()) {
            chars.add(c);
        }

        int n = chars.size();
        Stack<Integer> upper = new Stack<>();
        Stack<Integer> lower = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = chars.get(i);
            
            if (c == 'b') {
                chars.set(i, ' ');
                if (!lower.isEmpty()) {
                    chars.set(lower.pop(), ' ');
                }
                continue;
            }
            
            if (c == 'B') {
                chars.set(i, ' ');
                if (!upper.isEmpty()) {
                    chars.set(upper.pop(), ' ');
                }
                continue;
            }
            
            if ('a' <= c && c <= 'z') {
                lower.push(i);
            } else {
                upper.push(i);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') {
                result.append(c);
            }
        }

        System.out.println(result.toString());
    }
}
*/