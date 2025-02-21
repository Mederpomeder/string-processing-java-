import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		Dictionary<Integer, String> sundar = new Hashtable<>();
		sundar.put(0, "нөл");
		sundar.put(1, "бир");
		sundar.put(2, "эки");
		sundar.put(3, "үч");
		sundar.put(4, "төрт");
		sundar.put(5, "беш");
		sundar.put(6, "алты");
		sundar.put(7, "жети");
		sundar.put(8, "сегиз");
		sundar.put(9, "тогуз");
		sundar.put(10, "он");
		sundar.put(20, "жыйырма");
		sundar.put(30, "отуз");
		sundar.put(40, "кырк");
		sundar.put(50, "элүү");
		sundar.put(60, "алтымыш");
		sundar.put(70, "жетимиш");
		sundar.put(80, "сексен");
		sundar.put(90, "токсон");
		
		List<Integer> nums = new ArrayList<>();
		int p = 0;
		while (0<n) {
		    p = n%10;
		    nums.add(p);
		    n/=10;
		}
		String ans = "";
		if(nums.size()==0) {
		    ans="нөл";
		}
        else {
		    for (int i=nums.size()-1; i>=0; i--) {
		        if (i==5 || i==2) {
		            if(nums.get(i)==0) {
		                continue;
		            }
		            else {
		                ans=ans.concat(sundar.get(nums.get(i)) + " жүз ");
		            }
		        }
		        else if (i==4 || i==1) {
		             if(nums.get(i)==0) {
		                continue;
		            }
		            else {
		                ans=ans.concat(sundar.get(nums.get(i)*10) + " ");
		            }
		        }
		        else if(i==3) {
		             if(nums.get(i)==0) {
		                ans+=" миң ";
		            }
		            else {
		                ans=ans.concat(sundar.get(nums.get(i)) + " миң ");
		            }
		        }
		        else {
		             if(nums.get(i)==0) {
		                continue;
		            }
		            else {
		                ans=ans.concat(sundar.get(nums.get(i)) + " ");
		            }
		        }
		    }
	    }
		System.out.println(ans);
	}
}