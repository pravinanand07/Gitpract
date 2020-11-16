package org.without;

public class Inheritance2 extends Inheritance1 {
	
	public void JeffBezos() {
		System.out.println("World's Business Conglomerate");
	}
	
	public void Ambani() {
		System.out.println("India's Business Conglomerate");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance2 i2 = new Inheritance2();
		i2.Ambani();
		i2.JeffBezos();
		i2.Tata();
	}

}
