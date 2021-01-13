package aufgabenMethoden;
import aufgabenKontrollstrukturen.AufgabenSwitch;

public class Uebungen {
	public static void main(String[] args) {
		
		int a = AufgabenSwitch.getRandomNumber(4, 7);
		int b = AufgabenSwitch.getRandomNumber(8, 10);
		
		System.out.println("\n\nA1:");
		System.out.format("a = %d; b = %d\n", a, b);
		printFromTo(a, b);

		System.out.println("\n\nA2:");
		System.out.format("a = %d; b = %d\n", a, b);
		System.out.println(sum(a, b));
		
		System.out.println("\n\nA3:");
		System.out.format("a = %d; b = %d\n", a, b);
		System.out.println(sumFromTo(a, b));
		
		System.out.println("\n\nA4:");
		System.out.format("a = %d; b = %d\n", a, b);
		zeichneRechteck(a, b);
		
		System.out.println("\n\nA5 false:");
		System.out.format("a = %d; b = %d\n", a, b);
		zeichneRechteck(a, b, false);
		
		System.out.println("\n\nA5 true:");
		System.out.format("a = %d; b = %d\n", a, b);
		zeichneRechteck(a, b, true);
		
		System.out.println("\n\nA6:");
		System.out.format("a = %d; b = %d\n", a, b);
		printRandom(5, a, b);
	}
	
	static void printFromTo(int from, int to)
	{
		for (int i = from; i <= to; i++)
		{
			System.out.print(i + " ");
		}
	}
	
	static int sum(int a, int b)
	{
		return a + b;
	}
	
	static int sumFromTo(int from, int to)
	{
		int result = 0;
		for (int i = from; i <= to; i++) 
		{
			result += i;
		}
		return result;
	}
	
	static void zeichneRechteck(int width, int height)
	{
		for (int i = 1; i <= height; i++)
		{
			for (int j = 1; j <= width; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void zeichneRechteck(int width, int height, boolean fill)
	{
		if (fill)
		{
			zeichneRechteck(width, height);
			return;
		}
		
		for (int i = 1; i <= height; i++)
		{
			for (int j = 1; j <= width; j++)
			{
				if (i == 1 || j == 1 || i == height || j == width)
				{
					System.out.print("*");	
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}
	
	static void printRandom(int rnd, int from, int to) 
	{
		for(int i = 0; i < rnd; i++)
		{
			System.out.print(AufgabenSwitch.getRandomNumber(from, to) + " ");
		}
	}
}
