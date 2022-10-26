package de.demmer.dennis;

public class Application {


	public static void main(String[] args) {
		
		int i = addieren(5,8);
		System.out.println("Das Ergebnis ist " + i);
		
	}
	
	
	
	static int addieren(int zahl1, int zahl2) {
		int ergebnis = zahl1 + zahl2;
		System.out.println(ergebnis);
		return ergebnis;
	}
	

}
