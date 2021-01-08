package aufgabenKontrollstrukturen;

public class AufgabeKontrollstrukturenFor {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 0; i < 10; i++)
		{
			if (i != 1)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for (int i = -4; i <= 50; i += 2)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i = 'a'; i <= 'z'; i++)
		{
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		for (int i = 'Z'; i >= 'A'; i--)
		{
			System.out.print((char)i + " ");
		}
		System.out.println();
		
		for (int i = 1; i <= 100; i++)
		{
			if (i % 5 == 0)
			{
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		for (int i = 3; i > 0; i--)
		{
			System.out.print(i + " ");
			for (int j = 1; j <= i; j++)
			{
				System.out.print(j + " ");
			}
		}
		System.out.println();
	}

}
