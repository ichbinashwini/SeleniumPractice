package SeleniumSessions;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class practice {

	public static void main(String[] args) {
	
		String st = "xxzzchab";
		
		char[] stChar = st.toCharArray();
		
		Map<Character , Integer> m1 = new LinkedHashMap<>();
		Set<Character>s1 = new LinkedHashSet<>();

		for(char each : stChar) {
			m1.put(each, m1.getOrDefault(each, 0)+1);
			s1.add(each);
		}
		
		System.out.println(m1);
		
		
		for(int i = st.length()-1; i>0;i--) {
			char ch = st.charAt(i);
			if(m1.get(ch)==1) {
				System.out.println("Last repeating char--> "+ch);
				break;
			}
		}
		
		
		//First non repeating
		
		for (Map.Entry<Character, Integer> each : m1.entrySet()) {
			int a = each.getValue();
			if (a == 1) {
				System.out.println(each.getKey() + "<-- is the non rep first");
				break;
			}
		}
		System.out.println(s1);
		
		
	
		
//		 String info1 = "Ashwini";
//		 String info2 = "Ashwini";
//		String ss =  "        hello        all     ";
//		
//	System.out.println(	ss.replaceAll(" ",""));
//		
//		int last = info1.length()-1;
//		System.out.println("first"+ info1.charAt(0));
//		System.out.println("Last"+info1.charAt(last));
//		
//		
//		 
//		 System.out.println(info1.length());  ;
//		System.out.println( info1.charAt(0));
//		
//		
//		
//		
//		 String inputString = "Ashwini";
//		    String reverseString = "";
//		    
//		    for(int i=inputString.length()-1; i>=0; i--){
//		      char ch =  inputString.charAt(i);
//		        reverseString+=ch;
//		    }
//		    System.out.println(reverseString);
//		   
//		   
	}

}
