import java.util.*;
public class ArrangeCats {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();//# of boxes
			String s = sc.next();
			//each ith character is either 1 or 0(has a cat int the ith box or not
			String f = sc.next();
			int ans = 0;
			int ones1 = 0;
			int ones2 = 0;
			for(int i = 0;i<n;i++) {
				if(s.charAt(i)=='1' && s.charAt(i)==f.charAt(i))
					ans++;
				if(s.charAt(i)=='1')
					ones1++;
				if(f.charAt(i)=='1')
					ones2++;
			}
			ones1-=ans;
			ones2-=ans;
			int answer = Math.min(ones1,ones2);
			int diff = Math.max(ones1,ones2)-Math.min(ones1,ones2);
			System.out.println(diff+answer);
		}
	}
}
//Runtime error occured
/*int n = sc.nextInt();//# of boxes
String s = sc.next();
//each ith character is either 1 or 0(has a cat int the ith box or not
String f = sc.next();
int oper = 0;
Stack<Character> S = new Stack<Character>();
Stack<Character> F = new Stack<Character>();
for(int i = n-1;i>=0;i--) {
	S.push(s.charAt(i));
	F.push(f.charAt(i));
}
char tmp1,tmp2;
while(!S.isEmpty() && !F.isEmpty()) {
	tmp1 = S.pop();
	tmp2 = F.pop();
	if(tmp1!=tmp2) {
		if(tmp1=='0' && tmp2=='1') {
			if(!S.isEmpty() && S.peek()!=tmp1 && S.peek()!=F.peek()){
				S.pop();
				S.push(tmp1);
			}
		}
		else {
			if(F.peek()=='1') {
				S.pop();
				S.push(tmp1);
			}
		}
		oper++;
	}
}
System.out.println(oper);*/