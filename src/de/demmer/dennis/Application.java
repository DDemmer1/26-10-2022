package de.demmer.dennis;

public class Application {

	public static void main(String[] args) {

		int i = addieren(5, 8);
		System.out.println("Das Ergebnis ist " + i);
		
		
		boolean b = gleichheit(8,8);
		System.out.println(b);
		
		
		double d = durchZwei(13);
		System.out.println(d);
		
		
		dreimalKonsole("Hallo Welt");
		
	}

	// Die Methode hat zwei Zahlen als Argumente die addiert werden sollen
	static int addieren(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		return ergebnis;
	}

	
	//    | return |  name   |        arguments   |
	static boolean gleichheit(int zahl1, int zahl2) {
		boolean b = zahl1 == zahl2;
		return b;
	}
	
	
	static double durchZwei(double zahl) {
		
		return zahl / 2;
	}
	
	
	static void dreimalKonsole(String s) {
		System.out.println(s);
		System.out.println(s);
		System.out.println(s);
	}
	

	

}
