package lambdas;

public class App 
{
	public static void main(String[] args) 
	{
		printAddierbar(new Addierbar() 
		{		
			@Override
			public int addieren(int zahl1, int zahl2) 
			{
				return zahl1 + zahl2;
			}
		});
		
		printAddierbar((int zahl1, int zahl2) -> 
		{
			return zahl1 + zahl2;
		});
		
		printAddierbar((zahl1, zahl2) -> zahl1 + zahl2 + 2);
		
		printAddierbar(new AddierbarKlasse());
	}
	
	public static void printAddierbar(Addierbar a) 
	{
		System.out.println(a.addieren(34, 45));
	}
}