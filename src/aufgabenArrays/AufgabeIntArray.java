package aufgabenArrays;

public class AufgabeIntArray 
{
	public static void main(String[] args) 
	{
		int[] array = new int[100];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.println(String.format("Element %3d: %d", i, array[i]));
		}
	}
}