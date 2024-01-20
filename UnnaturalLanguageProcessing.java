import java.util.*;
/*
 * For test case, output a string denoting the word split 
 * into syllables by inserting a dot . between every pair of 
 * adjacent syllables.
If there are multiple possible splittings, 
output any of them. The input is given in such a way that
 at least one possible splitting exists.
 */
public class UnnaturalLanguageProcessing {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();//length of string
			String s = sc.next();
			StringBuilder res = new StringBuilder();

	        while (!s.isEmpty()) {
	            int x;
	            if (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e') {
	                x = 2;
	            } else {
	                x = 3;
	            }

	            while (x > 0) {
	                res.append(s.charAt(s.length() - 1));
	                s = s.substring(0, s.length() - 1);
	                x--;
	            }
	            res.append('.');
	        }
	        res.deleteCharAt(res.length() - 1);
	        res.reverse();
	        System.out.println(res.toString());
		}
	}
}
//this worked,but at test case 3, it exceeded time limit
/*if(n>2*Math.pow(10, 5))
break;
char[] S = sc.next().toCharArray();//the string
String v = "ae";
String c = "bcd";
String res = "";
int i = n-1;
boolean flag = true;
while(i-1>=0){
String tmp = "";
tmp+=S[i-1]+""+S[i]+"";
if(i-2>=0 && c.contains(S[i-2]+"") && v.contains(tmp.charAt(0)+"")) {
	tmp = S[i-2]+""+tmp;
	i-=3;
}
else
	i-=2;
if(flag) {
	res = tmp+""+res;
	flag = false;
}
else
	res = tmp+"."+res;
}
System.out.println(res);*/