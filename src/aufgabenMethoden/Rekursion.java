package aufgabenMethoden;

public class Rekursion {
	public static void main(String[] args) {
		
		System.out.println(sumOneTo(5));
		
	}
	
	static int sumOneTo(int to)
	{
		if (to < 1)
		{
			return 0;
		}
		
		return to + sumOneTo(to - 1);
	}
}