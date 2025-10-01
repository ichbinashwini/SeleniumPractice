package SeleniumSessions;

import java.util.Arrays;

public class practice {

	public static void main(String[] args) {

		 String info1 = "Ashwini";
		 System.out.println(info1.length());  ;
		System.out.println( info1.charAt(0));
		
		
		
		
		 String inputString = "Ashwini";
		    String reverseString = "";
		    
		    for(int i=inputString.length(); i>=0; i--){
		      char ch =  inputString.charAt(i);
		        reverseString+=ch;
		    }
		    System.out.println(reverseString);
		   
		   
	}

}
