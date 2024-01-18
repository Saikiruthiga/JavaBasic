package org.jav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaDayOne {
	
	public static void main(String args[]) {
		
		int[] a = new int[5];
		a[0] = 5;
		a[1] = 8;
		a[2] = 23;
		a[3] =100;
		a[4] = 10;
		
		
		for(int i =0;i<a.length;i++) {
			
			if(a[i]%2 == 0) 
			{
				System.out.println(a[i] + " " + "is an even number");
			}
			else 
			{
				System.out.println(a[i]  + " " + "is an odd number");
			}
		}
		
		// if we want to increase the size dynamically we can go for ArrayList and also we have so many handy methods in Arraylist.
		
		ArrayList<String> b = new ArrayList<String>();
		b.add("Selenium");
		b.add("in");
		b.add("Udemy");
		
		System.out.println(b.get(1));
		
		for(String s : b) {
			
			System.out.print(s + " ");
			
		}
		System.out.println();
		
		System.out.println(b.contains("in"));
		
		String [] s = {"Sel","in","ium"};
		
		//Arrays.asList - method used to convert array to list however we cannot convert the primitive typed arrays (int,double,float,boolean etc) to List. we can convert the wrapper class to List.
		
		List <String> s1 = Arrays.asList(s);
		
		Integer[] x = {1,0,2};
		List <Integer> x1 = Arrays.asList(x);
	}

}
