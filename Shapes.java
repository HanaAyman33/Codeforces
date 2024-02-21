/*
 * For the given grid, determine the type of shape that is drawn on it.
 * either a square or triangle
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Shapes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
	        ArrayList<String> g = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            String s = sc.next();
	            g.add(s);
	        }
	        boolean triangle = false;
	        for (int i = 0; i < n; i++) {
	            int cnt = 0;
	            for (int j = 0; j < n; j++) {
	                if (g.get(i).charAt(j) == '1') {
	                    cnt++;
	                }
	            }
	            if (cnt == 1) {
	                triangle = true;
	            } else if (cnt > 1) {
	                break;
	            }
	        }
	        Collections.reverse(g);
	        for (int i = 0; i < n; i++) {
	            int cnt = 0;
	            for (int j = 0; j < n; j++) {
	                if (g.get(i).charAt(j) == '1') {
	                    cnt++;
	                }
	            }
	            if (cnt == 1) {
	                triangle = true;
	            } else if (cnt > 1) {
	                break;
	            }
	        }
	        if (triangle)
	            System.out.println("TRIANGLE");
	        else
	            System.out.println("SQUARE");
		}
	}
}
