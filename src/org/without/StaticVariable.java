package org.without;

public class StaticVariable {
	String Personname;
	static int Personsalary;
		

	public static void main(String[] args) {
		StaticVariable sv1 = new StaticVariable();
		StaticVariable sv2 = new StaticVariable();
		sv1.Personname="Praveen";
		Personsalary=100000;
		sv2.Personname="kavi";
		Personsalary=200000;
		System.out.println(sv1.Personname);
		System.out.println(Personsalary);
		System.out.println(sv2.Personname);
		System.out.println(Personsalary);
	}
}
