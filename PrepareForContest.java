import java.util.*;
/*For each test case, print 𝑛 distinct integers from 1 to 𝑛, 
 * denoting the order that should solve the problems.
 *  If there are multiple answers, print any of them.*/
public class PrepareForContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
        	solve(sc);      	
        }
    }
    public static void solve(Scanner input) {
        int n = input.nextInt();
        int k = input.nextInt();
        input.nextLine();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = n - i;
        }
        reverse(a, n - k - 1, n - 1);
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }
        System.out.println();
    }
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}