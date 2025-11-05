package SeleniumSessions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TestDemo {

	public static void main(String[] args) {
//		i/p: "abchab"
//			o/p: c

		String s = "abchab";
		
		char[] sChar = s.toCharArray();
		Set <Character> sSet = new HashSet<>();
		
		for (char each : sChar) {
			
			if(!sSet.add(each)) {
				System.out.println(each +" is duplicate");
			}
			
			
			
			
		}
		System.out.println(sSet);
		ArrayList arrayList = new ArrayList<>(sSet);
		
		System.out.println(arrayList);
		
		
		
	}

}
