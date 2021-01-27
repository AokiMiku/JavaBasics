package aufgabenArrays;

import java.util.Arrays;

public class Aufgabe2DArrays 
{
	public static void main(String[] args) 
	{
		int[][] a1 = new int[3][5];
		
		int count = 1;
		for (int i = 0; i < a1.length; i++)
		{
			for (int j = 0; j < a1[i].length; j++)
			{
				a1[i][j] = count++;
			}
		}
		
		for (int[] a2 : a1)
		{
			System.out.println(Arrays.toString(a2));
		}
	}
}