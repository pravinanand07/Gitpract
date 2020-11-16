package org.without;

public class Staticvar {
	
	static int acbalance;
	String name;

	public static void main(String[] args) {
		Staticvar s1 = new Staticvar();
		acbalance = 1000;
		s1.name = "praveen1";
		Staticvar s2 = new Staticvar();
		acbalance = 2000;
		s2.name="praveen2";
		
		System.out.println(acbalance);
		System.out.println(s1.name);
		System.out.println(acbalance);
		System.out.println(s2.name);
	}

}
