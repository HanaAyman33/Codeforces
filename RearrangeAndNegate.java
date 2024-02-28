/*
 * You are given an array 𝑎 of 𝑛 integers. You must perform the following two operations 
 * on the array (the first, then the second):

Arbitrarily rearrange the elements of the array or leave the order of its elements unchanged.
Choose at most one contiguous segment of elements and replace the signs of all elements in 
this segment with their opposites. Formally, you can choose a pair of indices 𝑙,𝑟 such that 1≤𝑙≤𝑟≤𝑛 
and assign 𝑎𝑖=−𝑎𝑖 for all 𝑙≤𝑖≤𝑟 (negate elements). Note that you may choose not to select a pair of 
indices and leave all the signs of the elements unchanged.
What is the maximum sum of the array elements after performing these two operations
 (the first, then the second)?
 */
import java.util.*;
public class RearrangeAndNegate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			int sum = 0;
			for(int i =0 ;i<n;i++) {
				a[i] = sc.nextInt();
				sum+=Math.abs(a[i]);
			}
			System.out.println(sum);
		}
	}

}
