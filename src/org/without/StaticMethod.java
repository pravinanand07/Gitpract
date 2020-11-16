package org.without;

public class StaticMethod {
	
	public static void punjab() {
		System.out.println("Wheat");
	}
	public static void maharashtra() {
		System.out.println("wheat&rice");
	}
	public void TN() {
		maharashtra();
		System.out.println("Rice");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticMethod sm = new StaticMethod();
		punjab();
		sm.TN();
	}

}
