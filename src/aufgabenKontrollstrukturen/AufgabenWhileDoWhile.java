package aufgabenKontrollstrukturen;

import java.util.Random;

public class AufgabenWhileDoWhile {
	public static void main(String[] args) {

		int x = 100, dif = 0, count = 0;
		Random rnd = new Random();
		
		System.out.format("Startwert von x = %3d\n", x);
		while (x > 0)
		{
			dif = x;
			x -= rnd.nextInt(5) + 1;
			System.out.format("Wert von x = %3d; Wert wurde um %d verringert.\n", x, dif - x);
			count++;
		}
		System.out.format("Wert von x hat nach %d Dekrementierungen sein Minimum von %d erreicht.", count, x);
	}
}