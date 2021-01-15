package aufgabenMethoden;

import aufgabenKontrollstrukturen.AufgabenSwitch;

public class AufgabeUeberladen 
{

	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
			int a = AufgabenSwitch.getRandomNumber(-20, 20), b = AufgabenSwitch.getRandomNumber(-20, 20);
			
			System.out.format("%d: a = %d; b = %d\n", i + 1, a, b);
			System.out.println("max = " + getMax(a, b));
			System.out.println();
		}
	}
	
	public static int getMax(int zahl1, int zahl2)
	{
		return zahl1 > zahl2 ? zahl1 : zahl2;
	}

	public static int getMax(int zahl1, int zahl2, int zahl3)
	{
		return getMax(getMax(zahl1, zahl2), zahl3); 
	}
}
