package aufgabenArrays;

public class AufgabenVarargs 
{
	public static void main(String[] args) 
	{
		System.out.println("1 = " + produkt());
		System.out.println("8 = " + produkt(2, 4));
		System.out.println("64 = " + produkt(2, 4, 8));
		System.out.println(" = " + concat());
		System.out.println("abc = " + concat("a", "b", "c"));
		System.out.println("a, b, c = " + concat(true, ", ", "a", "b", "c"));
		System.out.println("Mo, Di, Mi = " + concat(true, ", ", "Mo", "Di", "Mi"));
		System.out.println(", MoDiMi = " + concat(false, ", ", "Mo", "Di", "Mi"));
	}
	
	static int produkt(int... values)
	{
		int produkt = 1;
		if (values == null || values.length == 0)
		{
			return produkt;
		}
		if (values.length == 1)
		{
			return values[0];
		}
		
		produkt = values[0];
		for (int i = 1; i < values.length; i++) 
		{
			produkt *= values[i];
		}
		
		return produkt;
	}
	
	static String concat(String... values)
	{
		return concat(false, values);
	}
	
	/*
	 * @delimiter true, wenn values[0] als delimiter behandelt werden soll.
	 */
	static String concat(boolean delimiter, String... values)
	{
		String concat = "";
		if (values == null || values.length == 0)
		{
			return concat;
		}
		
		if (!delimiter)
		{
			if (values.length == 1)
			{
				return values[0];
			}
			
			concat = values[0];
			for (int i = 1; i < values.length; i++) 
			{
				concat += values[i];
			}
		}
		else
		{
			if (values.length == 2)
			{
				return values[1];
			}
			
			concat = values[1];
			for (int i = 2; i < values.length; i++) 
			{
				concat += values[0] + values[i];
			}
		}
		return concat;
	}
}