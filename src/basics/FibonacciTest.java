package basics;

public class FibonacciTest 
{
	public static void main(String[] args) 
	{
		double a = 1;
		double b = 0;
		double c = 0;
		
		long start = System.currentTimeMillis();
		while (i <= abort)
		{
			System.out.println(String.format("%3s.: %.0f", i, c));
			c = a + b;
			a = b;
			b = c;

			i++;
		}
		long end = System.currentTimeMillis();
		i = 1;
		System.out.println("Dauer Schleife: " + (end - start));
		
		start = System.currentTimeMillis();
		for (int i = 1; i <= 50; i++) 
		{
			System.out.println(String.format("%3s.: %.0f", i, fibonacci(i)));
		}
		end = System.currentTimeMillis();
		i = 1;
		System.out.println("Dauer Rekursion: " + (end - start));
	}
	
	static int abort = 50;
	static int i = 1;
	
	static double fibonacci(int stelle)
	{
		abort = stelle;
		i = 1;
		return fibonacci(1, 0);
	}
	
	static double fibonacci(double a, double b)
	{
		if (i >= abort)
		{
			return b;
		}
		
		i++;
		return fibonacci(b, a + b);
	}
}