package basics;

public class RecursionTest 
{
	public static void main(String[] args) 
	{
		int zahl = 7;
		long fakultaet = berechneFakultaet(zahl);
		System.out.println(zahl + "! = " + fakultaet);
	}

	private static long berechneFakultaet(int zahl) 
	{
		if (zahl == 0 || zahl == 1)
		{
			return zahl;
		}
		
		return zahl *= berechneFakultaet(zahl - 1);
	}
}