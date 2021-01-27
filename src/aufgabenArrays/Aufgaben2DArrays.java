package aufgabenArrays;

import java.util.Iterator;

public class Aufgaben2DArrays 
{
	public static void main(String[] args) 
	{
		Integer[][] a1 = createArray(4, 5);
		printArray(a1);
		System.out.println();
		
		// A3
		a1[1][1] = 5;
		printArray(a1);
		System.out.println();
		
		// A4
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a1[i].length; j++)
			{
				a1[i][j] = 2;
			}
		}
		printArray(a1);
		System.out.println();
		
		printArray(createArray(4, 5, 3));
		System.out.println();
		
		printArray(createBorderedArray(5, 'X'), false);
	}
	
	// A1
	static Integer[][] createArray(int height, int width)
	{
		return createArray(height, width, 0);
	}
	
	// A5
	static Integer[][] createArray(int height, int width, int value)
	{
		Integer[][] a1 = new Integer[height][width];
		for (int i = 0; i < a1.length; i++)
		{
			for ( int j = 0; j < a1[i].length; j++)
			{
				a1[i][j] = value;
			}
		}
		return a1;
	}
	
	// A2
	static void printArray(Object[][] arr)
	{
		printArray(arr, true);
	}
	
	static void printArray(Object[][] arr, boolean comma)
	{
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				if (comma)
				{
					System.out.print(arr[i][j] + ", ");
				}
				else
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}
	}
	
	// A7
	static Character[][] createBorderedArray(int dim, char ch)
	{
		Character[][] a1 = new Character[dim][dim];
		
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a1[i].length; j++) 
			{
				if (i == 0 || j == 0 || i == a1.length - 1 || j == a1[i].length - 1) 
				{
					a1[i][j] = ch;
				}
				else
				{
					a1[i][j] = ' ';
				}
			}
		}
		return a1;
	}
}