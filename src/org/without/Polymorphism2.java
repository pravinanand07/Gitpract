package org.without;

public class Polymorphism2 {
	
	String cap;
	String power;
	String nav;
	String presi;
	
	
	public void unitedStates(String capital,String superPower) {
		cap=capital;
		power=superPower;
		System.out.println("Capital is : "+cap+ " is superPower? : "+superPower);
		
		
	}
	
	public void uniteStates(String navy,String president) {
		
		navy=nav;
		presi=president;
		System.out.println("US navy is : "+navy+ " President is : "+presi);
		
	}
	
	public static void main(String[] args) {
		Polymorphism2 pol = new Polymorphism2();
		pol.unitedStates("NewYork", "no,not a superPower");
		pol.uniteStates("seal", "Obama");
	}

}
