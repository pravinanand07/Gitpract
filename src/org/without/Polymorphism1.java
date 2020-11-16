package org.without;

public class Polymorphism1 {

	String Capital;
	String BeforeName;
	long Population;
	float GDP;

	public void Russia(String name, long num) {
		Capital = name;
		Population = num;
		System.out.println("Capital is : " + name);
		System.out.println("Population is : " + num);
	}

	public void Russia(String Before, float CountryGDP) {
		BeforeName = Before;
		GDP = CountryGDP;
		System.out.println("Country's Before Name is : " + Before);
		System.out.println("CountryGDP is : " + CountryGDP);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism1 p1 = new Polymorphism1();
		p1.Russia("Moscow", 50000000000l);
		p1.Russia("USSR", 12.6f);
	}

}
