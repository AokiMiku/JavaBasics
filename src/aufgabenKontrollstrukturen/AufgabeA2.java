package aufgabenKontrollstrukturen;

public class AufgabeA2 {
	public static void main(String[] args) {
		
		int x = 3, y = 4, ergebnis = x;
		
		for (int i = 1; i < y; i++)
		{
			ergebnis *= x;
		}
		
		System.out.format("Das Ergebnis von %d hoch %d lautet: %d", x, y, ergebnis);
	}
}