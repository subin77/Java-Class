package com.cubic.Assignments;

import java.util.Arrays;

public class StringMethodDemo {

	public static void main(String[] args) {
		String name="Subin Shahukhal";
		
		// Method 1:Finding Index of the String
		System.out.println("Result of Method 1...");
		char Position_of_string=name.charAt(8);
		System.out.println("The character is.."+Position_of_string);
		
		
		// Method 2:String format displaying string, integers etc
		System.out.println("Result of Method 2...");
		String sf1=String.format("name is %s",name); 
		String sf2 = String.format("One: %1$d Two: %2$d Three: %3$d",10, 20, 30);
		System.out.println(sf1);  
		System.out.println(sf2);  
	

		// Method 3: Finding the length of the String
		System.out.println("Result of Method 3...");
		System.out.println("string length is: "+name.length());
		
		// Method 4:public String substring displaying piece of string using start and end index 
		System.out.println("Result of Method 4...");
		System.out.println(name.substring(2,9));
		System.out.println(name.substring(3));
		
		// Method 5:Replaces the value of the String with new values
		System.out.println("Result of Method 5...");
		String statement="We are the Champions"; 
		System.out.println(statement.replace('C','L'));
		System.out.println(statement.replace("Champions","Loosers"));
		
		// Method 6:Checking if string variable is empty 
		System.out.println("Result of Method 6...");
		System.out.println(statement.isEmpty());  
		
		// Method 7:Ignoring Case senisitivity while comparing strings
		System.out.println("Result of Method 7...");
		String A="Hello World";
		String B="hello world";
		System.out.println(A.equalsIgnoreCase(B));
		
		// Method 8: Splitting the String on space 
		System.out.println("Result of Method 8...");
		String S1="welcome to the Jungle";  
		System.out.println("Splitted Words:");  
		for(String a:S1.split("\\s",0)){  
		System.out.println(a);  
		}  
		//String[] splitted_word = a.split("\\s",0);
		//System.out.println(Arrays.toString(splitted_word));
		/*System.out.println("Splitted Words:");  
		for(String a:S1.split("\\s",1)){  
		System.out.println(a);  
		}  
		System.out.println("Splitted Words:");  
		for(String a:S1.split("\\s",3)){  
		System.out.println(a);  
		} */
		
		// Method 9:Changing to lower case
		String jumbled_cases="Hello My Name is Subin";    
		System.out.println(jumbled_cases.toLowerCase()); 
		
		// Method 10: Converting Values to string
		int number=50;
		String S=String.valueOf(number);
		System.out.println(S+10);
	}

}
