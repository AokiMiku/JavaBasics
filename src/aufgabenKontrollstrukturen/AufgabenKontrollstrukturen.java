package aufgabenKontrollstrukturen;

public class AufgabenKontrollstrukturen {
	public static void main(String[] args) {
		
		// A1
		int summe = 0;
		for(int i = 1; i < 11; i++)
		{
			summe += i;
		}
		System.out.println("A1> Die Summe aus allen Zahlen von 1 bis 10 ist: " + summe);
		
		// A2
		int x = 3, y = 4, ergebnis = x;
		
		for (int i = 1; i < y; i++)
		{
			ergebnis *= x;
		}
		
		System.out.format("A2> Das Ergebnis von %d hoch %d lautet: %d", x, y, ergebnis);
		System.out.println();
		
		// A3
		x = 3; y = 4; ergebnis = x;
		int i = 1;
		while (i++ < y)
		{
			ergebnis *= x;
		}
		
		System.out.format("A3> Das Ergebnis von %d hoch %d lautet: %d", x, y, ergebnis);
		System.out.println();
		
		// A4
		x = 3; y = 4; ergebnis = 0;
		ergebnis = (int) Math.pow(x, y);
		
		System.out.format("A4> Das Ergebnis von %d hoch %d lautet: %d", x, y, ergebnis);
		System.out.println();
		
		// A5
		for (i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		// A6
		for (i = 1; i <= 4; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (i == 1 || j == 1 || i == 4 || j == 5)
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
		
		// A7
		char lines = 'A';
		for (i = 1; i <= 6; i++)
		{
			for (int j = 0; j <= 5; j++)
			{
				if (i == 1)
				{
					if (j == 0)
					{
						System.out.print(" ");
					}
					else
					{
						System.out.print(j);
					}
				}
				else if (j == 0)
				{
					System.out.print(lines++);
				}
				else
				{
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		// A8
		int[] monate = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for(int monat = 1; monat <= 12; monat++) 
		{
			System.out.format("Monat %2d: ", monat);
		    for (int tag = 1; tag <= monate[monat - 1]; tag ++)
		    {
		    	System.out.print(tag + " ");
		    }
		    System.out.println();
		}
	}
}
