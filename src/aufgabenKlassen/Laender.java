package aufgabenKlassen;

class Land
{
	String Name = "";
	int Einwohner = 0;
	
	public Land(String name, int einwohner)
	{
		this.Name = name;
		this.Einwohner = einwohner;
	}
}

public class Laender 
{
	public static void main(String[] args) 
	{
		Land brasilien = new Land("Brasilien", 211_000_000);
		Land deutschland = new Land("Deutschland", 83_000_000);
		
		printLand(brasilien);
		printLand(deutschland);
	}
	
	static void printLand(Land land)
	{
		System.out.format("%s hat %d Einwohner.\n", land.Name, land.Einwohner);
	}
}
