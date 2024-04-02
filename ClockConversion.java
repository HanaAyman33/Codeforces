import java.util.*;
public class ClockConversion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			char[] tmp = s.toCharArray();
			if(s.substring(0,2).equals("00"))
				System.out.println("12"+s.substring(2)+" AM");
			else {
				int hour = Integer.parseInt(s.substring(0,2));
				if(hour<12) {
					System.out.println(s+" AM");
				}
				else if(hour==12)
					System.out.println(s+" PM");
				else {
					int newHour = hour-12;
					String res = newHour+"";
					if(newHour<10)
						res = "0"+newHour;
					System.out.println(res+s.substring(2)+" PM");
				}
			}
		}
	}

}
