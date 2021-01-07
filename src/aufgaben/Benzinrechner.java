package aufgaben;

import java.util.Scanner;

public class Benzinrechner {

	public static void main(String[] args) {
	    // Programmieren Sie einen Benzinrechner, der zu dem Gesamtverbrauch in Liter und den gefahrenen Kilometern den Verbrauch auf 100 Kilometer 
        // berechnet. Beispieldaten: 60 Liter, 400 Kilometer = 15 Liter / 100 Kilometer

        // Deklaration der Variablen und Zuweisung der Werte
		double gesamtVerbrauch = 0;
		double streckeInKm = 0;
		double verbrauchPro100Km = 0;
		Scanner sc = new Scanner(System.in);
		
		// Benutzereingaben
		System.out.print("Bitte geben Sie den Gesamtverbrauch an: ");
		gesamtVerbrauch = sc.nextDouble();
		
		System.out.print("Bitte geben Sie die gefahrenen Kilometer an: ");
		streckeInKm = sc.nextDouble();
		
		// Berechnung des Verbrauchs auf 100 Kilometer
		//verbrauchPro100Km = gesamtVerbrauch / (streckeInKm / 100);
		verbrauchPro100Km = gesamtVerbrauch * 100.0 / streckeInKm;
        
		// Ausgabe des Verbrauchs auf 100 Kilometer 
		//System.out.println("Verbrauch = " + verbrauchPro100Km + " L/100 km");
		System.out.format("Gefahrene Strecke: %.0f km %nGesamtverbrauch: %.0f L %nVerbrauch: %.1f L/100 km%n", 
				streckeInKm, gesamtVerbrauch, verbrauchPro100Km);
		
		sc.close();
		
	}

}
