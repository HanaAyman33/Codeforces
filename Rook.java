import java.util.*;
public class Rook {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			char ch = 'a';
			while(ch<='g') {
				if(ch!=s.charAt(0))
					System.out.println(ch+""+s.charAt(1));
				ch++;
			}
			int i = 1;
			while(i<=8) {
				if(i!=Integer.parseInt(s.charAt(1)+""))
					System.out.println(s.charAt(0)+""+i);
				i++;
			}
		}
	}
}
//Accpeted solution
/*import java.util.Scanner;

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
        for (char c : "abcdefgh".toCharArray()) {
            if (c != s.charAt(0)) {
                System.out.print(c + "" + s.charAt(1) + " ");
            }
        }

        for (char c : "12345678".toCharArray()) {
            if (c != s.charAt(1)) {
                System.out.print(s.charAt(0) + "" + c + " ");
            }
        }

        System.out.println();
    }
}
*/