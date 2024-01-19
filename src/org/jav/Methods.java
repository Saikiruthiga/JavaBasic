package org.jav;

public class Methods {
	
	public static void main(String args[]) {
		
		Methods m = new Methods();
		m.getData();
		String s = m.getData1();
		System.out.println(s);
		
		// we can get the return type and then print or directly we can call inside of print statement.
		
		System.out.println(m.getData1());
		
		getdata2();
		
	}
	
	public void getData() {
		System.out.println("Hello World");  // if there is return statement in the block we should have the data type in the declaration.
	}
	public String getData1() {
		return "Welcome!!!";
	}
	
	public static void getdata2() {
		System.out.println("Selenium"); 
		//if we declare static method it assign to class level, no need to create object.
	}

}

