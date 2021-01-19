package aufgabenKlassen;

class Tier
{
	public int Alter;
	public String Name;
	
	public Tier(String name, int alter)
	{
		this.Name = name;
		this.Alter = alter;
	}
}

public class Tiere 
{

	public static void main(String[] args) 
	{
		Tier hase = new Tier("Blacky", 6);
		Tier katze = new Tier("Bobbie", 4);
		
		printTier(hase);
		printTier(katze);
	}
	
	public static void printTier(Tier tier)
	{
		System.out.format("Das Tier namens %s ist %d Jahre alt.\n", tier.Name, tier.Alter);
	}
}