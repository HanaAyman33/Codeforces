import java.util.*;
public class MaximumRounding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = Integer.parseInt(sc.nextLine());
		        for (int i = 0; i < n; i++) {
		            String input = sc.nextLine();
		            List<Integer> s = new ArrayList<>();
		            s.add(0);
		            for (char c : input.toCharArray()) {
		                s.add(Integer.parseInt(String.valueOf(c)));
		            }
		            int k = s.size();
		            for (int j = s.size() - 1; j > 0; j--) {
		                if (s.get(j) > 4) {
		                    s.set(j - 1, s.get(j - 1) + 1);
		                    k = j;
		                }
		            }
		            if (s.get(0) != 0) {
		                System.out.print(s.get(0));
		            }
		            for (int j = 1; j < k; j++) {
		                System.out.print(s.get(j));
		            }
		            for (int j = k; j < s.size(); j++) {
		                System.out.print("0");
		            }
		            System.out.println();
			/*int x = sc.nextInt();
			int k = 1;
			String result = "";
			if(x==1)
				System.out.println("1");
			else {
				while(x!=0) {
					int tmp = x%10;
					if(tmp==9){
						while(true) {
							if(tmp<9) {
								result = (x%10+1)+""+result;
								break;
							}
							else
								x/=10;
						}
					}
					else if(tmp>=5)	
						result = (x%10+1)+""+result;
					else
						result = (x%10)+""+result;
					x/=10;
					if(x==0 && result.charAt(0)=='0') {
						result = "0";
					}
				}
				System.out.println(result);
			}*/
		        }
		}
	}
}