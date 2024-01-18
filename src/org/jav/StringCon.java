package org.jav;

public class StringCon {
	
	public static void main(String args[]) {
		
		//Literal Strings -----> New memory not allocated if the values are same
		String s = "Hello";
		String s1 = "Hello";
		String s2 ="!!!";
		
		String litstr = s.concat(s1);
		System.out.println(litstr);
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(litstr));
		
		System.out.println("*********************************");
		
		//Non Literal ------> different memory allocated even the values are same
		
		String s3 = new String("Welcome");
		String s4 = new String("Welcome");
		String s5 = new String("to this world");
		String concat = s3.concat(s5);
		System.out.println(concat);
		System.out.println(System.identityHashCode(s3));
		System.out.println(System.identityHashCode(s4));
		System.out.println(System.identityHashCode(concat));
		
		System.out.println("*************************************");
		
		//If we are using StringBuffer / StringBuilder we should use append method and it share the first string memouy value for storing the appended string 
		
		StringBuffer str = new StringBuffer("Hello");
		StringBuffer str1 = new StringBuffer("World");
		StringBuffer appendstr = str.append(str1);
		
		System.out.println(System.identityHashCode(str));
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(appendstr));
		
		System.out.println("***************************************8");
		
		String[] splitstr = s5.split(" ");
		for(String strarr: splitstr)
		System.out.println(strarr);
		
		String s6 = " Hello World     ";
		String trimstr = s6.trim();
		System.out.println(s6);
		System.out.println(trimstr);
		for(int i=trimstr.length()-1;i>=0;i--)
		System.out.println(trimstr.charAt(i));
		
		System.out.println("********************************");
		
		for(char c: trimstr.toCharArray())
			System.out.println(c);
		
		
		
		
		
	
	}

}
