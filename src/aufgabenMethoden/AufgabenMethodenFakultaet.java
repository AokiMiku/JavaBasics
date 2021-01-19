package aufgabenMethoden;

public class AufgabenMethodenFakultaet {
	public static void main(String[] args) {
		
		System.out.println(getFakultaetRekursiv(9));
		
	}
	
	// A1
	static int getFakultaetRekursiv(int base)
	{
		if (base < 1)
		{
			return 1;
		}
		
		return base * getFakultaetRekursiv(base - 1);
	}
	
	// A2
	static int getFakultaet(int base)
	{
		int result = 1;
		for (int i = 1; i <= base; i++)
		{
			result *= i;
		}
		return result;
	}
}