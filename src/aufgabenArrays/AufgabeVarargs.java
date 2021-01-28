package aufgabenArrays;

public class AufgabeVarargs 
{
	public static void main(String[] args) 
	{
		System.out.println(getMin());
		System.out.println(getMin(6));
		System.out.println(getMin(6, -3));
		System.out.println(getMin(6, -3, 7, -3));
		System.out.println(getMin(6, -3, 7, -3, -22));
	}
	
	static int getMin(int... values)
	{
		int min = 0;
		if (values.length < 2)
		{
			if (values.length == 0)
			{
				return 0;
			}
			else
			{
				return values[0];	
			}
		}
		
		min = values[0];
		for (int i = 1; i < values.length; i++) 
		{
			if (values[i] < min)
			{
				min = values[i];
			}
		}
		
		return min;
	}
}