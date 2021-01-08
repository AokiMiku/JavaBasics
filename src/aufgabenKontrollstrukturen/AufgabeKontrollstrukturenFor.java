package aufgabenKontrollstrukturen;

public class AufgabeKontrollstrukturenFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int j = 0; j < 10; j++)
		{
			if (j != 1)
			{
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		for (int k = -4; k <= 50; k += 2)
		{
			System.out.print(k + " ");
		}
		System.out.println();
		
		for (int l = 'a'; l <= 'z'; l++)
		{
			System.out.print((char)l + " ");
		}
		System.out.println();
		
		for (int m = 'Z'; m >= 'A'; m--)
		{
			System.out.print((char)m + " ");
		}
		System.out.println();
		
		for (int n = 0; n <= 100; n++)
		{
			if (n % 5 == 0)
			{
				System.out.print(n + " ");
			}
		}
		System.out.println();
		
		for (int o = 3; o > 0; o--)
		{
			System.out.print(o + " ");
			for (int p = 1; p <= o; p++)
			{
				System.out.print(p + " ");
			}
		}
		System.out.println();
	}

}
