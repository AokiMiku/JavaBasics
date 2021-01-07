package aufgaben;

import java.util.Scanner;

public class Schaltjahr {
	public static void main(String[] args) {
		// Schreiben Sie ein Programm, das eine Jahreszahl durch den Benutzer einliest und ausgibt, ob es ein Schaltjahr ist oder nicht.
		// Einfache Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist
		// Schwierige Variante: ein Jahr ist ein Schaltjahr, wenn es durch 4 teilbar ist. Ausnahme: eine Jahrhundertwende ist nur dann ein Schaltjahr,
		// wenn sie auch durch 400 teilbar ist
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Bitte geben Sie ein Jahr ein: ");
		int jahr = sc.nextInt();
		
		boolean schaltjahr = false;
		if (jahr % 100 == 0) {
			if (jahr % 400 == 0) {
				schaltjahr = true;
			}
		}
		else {
			if (jahr % 4 == 0) {
				schaltjahr = true;
			}
		}

		if (schaltjahr) {
			System.out.format("Das Jahr %d ist ein Schaltjahr.", jahr);
		}
		else {
			System.out.format("Das Jahr %d ist kein Schaltjahr.", jahr);
		}
		
		sc.close();
	}
}