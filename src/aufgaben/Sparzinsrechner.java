package aufgaben;

import java.util.Scanner;

public class Sparzinsrechner {
	public static void main(String[] args) {
		double startKapital = 0;
		double zinsPA = 0;
		int jahre = 0;
		//double endKapital = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie das Startkapital an: ");
	 	startKapital = sc.nextDouble();
		
	 	System.out.print("Bitte geben Sie den Zinssatz p.a. an: ");
	 	zinsPA = sc.nextDouble();
	 	
	 	System.out.print("Bitte geben Sie die Laufzeit an: ");
	 	jahre = sc.nextInt();
		
		double zwischenKapital = startKapital;
		for(int i = 1; i <= jahre; i++) {
			System.out.format("Ihr Kapital nach dem %d. Jahr beträgt %,.2f €.%n", i, zwischenKapital *= (1 + zinsPA / 100));
		}
		
		sc.close();
	}
}