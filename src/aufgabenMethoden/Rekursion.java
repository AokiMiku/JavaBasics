package aufgabenMethoden;

public class Rekursion {
	public static void main(String[] args) {
		
		int to = aufgabenKontrollstrukturen.AufgabenSwitch.getRandomNumber(2, 9);
		
		printFromXToOne(10);
		
		for (int i = 0; i < 10; i++)
		{
			to = aufgabenKontrollstrukturen.AufgabenSwitch.getRandomNumber(2, 9);
			System.out.println("Summe aller Zahlen von 1 bis " + to + ": " + sumOneTo(to));
		}
		
		fibonacci(0, 1);
		
	}
	
	static int sumOneTo(int to)
	{
		if (to < 1)
		{
			return 0;
		}
		
		return to + sumOneTo(to - 1);
	}
	
	static void printFromXToOne(int x)
	{
		if (x < 1)
		{
			return;
		}
		
		System.out.print(x + " ");
		printFromXToOne(x - 1);
	}
	
	static int fibonacci(int a, int b)
	{
		if (a + b > 500)
		{
			return 0;
		}
		
		System.out.println(a);
		System.out.println(b);
		a += b;
		b += a;
		return fibonacci(a, b);
	}
}