package aufgabenMethoden;

public class Rekursion {
	public static void main(String[] args) {
		
		int to = aufgabenKontrollstrukturen.AufgabenSwitch.getRandomNumber(2, 9);
		
		for (int i = 0; i < 10; i++)
		{
			to = aufgabenKontrollstrukturen.AufgabenSwitch.getRandomNumber(2, 9);
			System.out.println("Summe aller Zahlen von 1 bis " + to + ": " + sumOneTo(to));
		}
		
	}
	
	static int sumOneTo(int to)
	{
		if (to < 1)
		{
			return 0;
		}
		
		return to + sumOneTo(to - 1);
	}
}