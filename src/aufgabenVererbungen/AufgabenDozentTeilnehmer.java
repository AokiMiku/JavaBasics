package aufgabenVererbungen;

class Kurs
{
	private int nummer;
	
	public int getNummer()
	{
		return this.nummer;
	}
	
	public Kurs (int nummer)
	{
		this.nummer = nummer;
	}
}

class PersonInKurs
{
	private String name;
	private String id;
	private Kurs kurs;
	private static String[] ids;
	
	static 
	{
		ids = new String[0];
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getId()
	{
		return this.id;
	}
	
	public Kurs getKurs()
	{
		return this.kurs;
	}
	
	public void setKurs(Kurs value)
	{
		this.kurs = value;
	}
	
	public PersonInKurs(String name, String id)
	{
		this.name = name;
		this.id = id;
	}
	
	protected static String getNewUniqueId()
	{
		String id = String.format("%05d", ids.length + 1);
		
		String[] tmpIds = ids;
		ids = new String[ids.length + 1];
		for (int i = 0; i < tmpIds.length; i++) 
		{
			ids[i] = tmpIds[i];
		}
		
		return id;
	}
}

class Dozent extends PersonInKurs
{
	public Dozent(String name)
	{
		super (name, PersonInKurs.getNewUniqueId());
	}
	
	public String toString()
	{
		if (this.getKurs() == null)
		{
			return String.format("%s leitet keinen Kurs und hat die ID %s.", 
					this.getName(), this.getId());
		}
		return String.format("%s leitet den Kurs mit der Nummer %d und hat die ID %s.", 
							this.getName(), this.getKurs().getNummer(), this.getId());
	}
}

class Teilnehmer extends PersonInKurs
{
	public Teilnehmer(String name)
	{
		super (name, PersonInKurs.getNewUniqueId());
	}
	
	public String toString()
	{
		if (this.getKurs() == null)
		{
			return String.format("%s nimmt an keinem Kurs teil und hat die ID %s.", 
					this.getName(), this.getId());
		}
		return String.format("%s nimmt an dem Kurs mit der Nummer %d teil und hat die ID %s.", 
							this.getName(), this.getKurs().getNummer(), this.getId());
	}
}

public class AufgabenDozentTeilnehmer 
{
	public static void main(String[] args) 
	{
		Kurs kurs = new Kurs(192314);
		
		Dozent patrin = new Dozent("Herr Patrin");
		patrin.setKurs(kurs);
		
		Teilnehmer miku = new Teilnehmer("Melissa Miku");
		miku.setKurs(kurs);
		
		System.out.println(patrin);
		System.out.println(miku);
	}
}