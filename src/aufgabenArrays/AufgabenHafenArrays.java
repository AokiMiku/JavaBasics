package aufgabenArrays;

class Hafen
{
	public Schiff[] schiffe = new Schiff[this.kapazitaet];
	private final int kapazitaet = 100;
	
	public String toString()
	{
		int schiffe = 0;
		for (Schiff schiff : this.schiffe)
		{
			if (schiff != null)
			{
				schiffe++;
			}
		}
		return String.format("Hafen (Schiffe: %d. Freie Plätze: %d)", schiffe, this.schiffe.length - schiffe);
	}
}

class Schiff
{
	public String name = "";
	
	public Schiff(String name)
	{
		this.name = name;
	}
	
	public Schiff()
	{
		this("");
	}
	
	public String toString()
	{
		return this.name;
	}
}

public class AufgabenHafenArrays 
{
	public static void main(String[] args) 
	{
		Hafen h = new Hafen();
		for (int i = 0; i < 12; i++)
		{
			h.schiffe[i] = new Schiff();
		}
		
		System.out.println(h);
	}
}