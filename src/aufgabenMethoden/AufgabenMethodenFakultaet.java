package aufgabenMethoden;

public class AufgabenMethodenFakultaet {
	public static void main(String[] args) {
		
		System.out.println(getFakultaet(4));
		
	}
	
	// A1
	static int getFakultaetRekursiv(int base)
	{
		if (base < 1)
		{
			return 0;
		}
		
		return base + getFakultaetRekursiv(base - 1);
	}
	
	// A2
	static int getFakultaet(int base)
	{
		int result = 0;
		for (int i = 1; i <= base; i++)
		{
			result += i;
		}
		return result;
	}
}