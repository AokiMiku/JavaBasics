package aufgabenArrays;

public class AufgabeBooleanArray 
{
	public static void main(String[] args) 
	{
		for(boolean element : createBooleanArray())
		{
			System.out.println(element);
		}
	}
	
	public static boolean[] createBooleanArray()
	{
		return new boolean[] { true, true, false, false };
	}
}
