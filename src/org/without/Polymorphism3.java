package org.without;

public class Polymorphism3 extends Polymorphism2 {
	
	String nav;
	String presi;
	String arm;
	String Arf;
	
public void uniteStates(String navy,String president) {
		
		navy=nav;
		presi=president;
		System.out.println("US navy is : "+navy+ " President is : "+presi);
		
	}

	public static void main(String[] args) {
		
		Polymorphism3 pol1 = new Polymorphism3();
		pol1.unitedStates("washington","yes,superPower");
		
		
	}

}
