package aufgabenArrays;

class Hafen
{
	public Schiff[] schiffe;
	private int kapazitaet;
	
	public Hafen()
	{
		this(100);
	}
	
	private Hafen(int kapazitaet)
	{
		this.kapazitaet = kapazitaet;
		this.schiffe = new Schiff[this.kapazitaet];
	}
	
	public int getAnzahlSchiffe()
	{
		int schiffe = 0;
		for (Schiff schiff : this.schiffe)
		{
			if (schiff != null)
			{
				schiffe++;
			}
		}
		return schiffe;
	}
	
	public void addSchiff()
	{
		this.addSchiff(new Schiff());
	}
	
	public void addSchiff(Schiff schiff)
	{
		if (this.getAnzahlSchiffe() == this.kapazitaet)
		{
			System.out.println(String.format("%s konnte nicht hinzugefügt werden, "
										+ "da die Kapazität erschöpft ist.", schiff));
			return;
		}
		
		for (int i = 0; i < this.schiffe.length; i++)
		{
			if (this.schiffe[i] == null)
			{
				this.schiffe[i] = schiff;
				break;
			}
		}
	}
	
	public String toString()
	{
		return String.format("Hafen (Schiffe: %d. Freie Plätze: %d)", 
						this.getAnzahlSchiffe(), this.schiffe.length - this.getAnzahlSchiffe());
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
			h.addSchiff();
		}
		
		System.out.println(h);
	}
}