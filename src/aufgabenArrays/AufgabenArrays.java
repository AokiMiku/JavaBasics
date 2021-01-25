package aufgabenArrays;

import basics.RandomGenerator;

public class AufgabenArrays 
{
	public static void main(String[] args) 
	{
		printArray(createArray(2, 15, 30));
		
		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
		for (char element : deutscheUmlaute())
		{
			System.out.println(element);
		}

		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
		for (char element : deutscheBuchstaben())
		{
			System.out.println(element);
		}

		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
		// A5
		for (double element : new double[] { Math.PI, Math.E })
		{
			System.out.println(element);
		}
		
		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
		int[] a1 = { 1, 2, 3 };
		int[] a2 = { 12, 13, 14 };
		int[] a3 = add(a1, a2);
		
		for (int element : a3)
		{
			System.out.println(element);
		}

		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
		a3 = join(a1, a2);
		
		for (int element : a3)
		{
			System.out.println(element);
		}

		System.out.println(String.format("%020d", 0).replace("0", "*"));
		
	}
	
	// A1
	static int[] createArray(int from, int to, int length)
	{
		int[] resultArray = new int[length];
		
		for(int i = 0; i < resultArray.length; i++)
		{
			resultArray[i] = RandomGenerator.getRandomNumber(from, to);
		}
		
		return resultArray;
	}
	
	// A2
	static void printArray(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			System.out.println(String.format("Element %3d: %d", i + 1, array[i]));
		}
	}
	
	// A3
	static char[] deutscheUmlaute()
	{
		return new char[] { 'ä', 'ö', 'ü' };
	}
	
	// A4
	static char[] deutscheBuchstaben()
	{
		char[] buchstaben = new char[30];
		
		for (int i = 0; i < 30; i++)
		{			
			if (i > 'z' - 'a')
			{
				char[] umlaute = deutscheUmlaute();
				for (int j = 0; j < umlaute.length; j++)
				{
					buchstaben[i + j] = umlaute[j];
				}
				break;
			}
			else
			{
				buchstaben[i] = (char)(i + 'a');
			}
		}
		buchstaben[buchstaben.length - 1] = 'ß';
		
		return buchstaben;
	}
	
	// A6
	static int[] add(int[] left, int[] right)
	{
		int[] result = new int[Math.max(left.length, right.length) == left.length ? left.length : right.length];
		
		for (int i = 0; i < result.length; i++)
		{
			int leftOperand = 0;
			int rightOperand = 0;
			if (i < left.length)
			{
				leftOperand = left[i];
			}
			if (i < right.length)
			{
				rightOperand = right[i];
			}
			
			result[i] = leftOperand + rightOperand;
			
		}
		return result;
	}
	
	// A7
	static int[] join(int[] left, int[] right)
	{
		int[] result = new int[left.length + right.length];
		int iRight = 0;
		for (int i = 0; i < result.length; i++)
		{
			if (i < left.length)
			{
				result[i] = left[i];
			}
			else
			{
				result[i] = right[iRight++];
			}
		}
		
		return result;
	}
	
	
	
	
	
	
	
}