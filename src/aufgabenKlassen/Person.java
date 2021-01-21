package aufgabenKlassen;

//import aufgabenMethoden.Date;

public class Person 
{
	private String vorname;
	private String nachname;
	private int geburtsJahr;
	private int plz;
	
	public void setVorname(String value)
	{
		this.vorname = value;
	}
	
	public String getVorname()
	{
		return this.vorname;
	}
	
	public void setNachname(String value)
	{
		this.nachname = value;
	}
	
	public String getNachname()
	{
		return this.nachname;
	}
	
	public void setGeburtsjahr(int value)
	{
		this.geburtsJahr = value;
	}
	
	public int getGeburtsjahr()
	{
		return this.geburtsJahr;
	}
	
	public void setPlz(int value)
	{
		this.plz = value;
	}
	
	public int getPlz()
	{
		return this.plz;
	}
	
	public Person()
	{
		
	}
	
	public Person(PersonBuilder pb)
	{
		this.vorname = pb.vorname;
		this.nachname = pb.nachname;
		this.geburtsJahr = pb.geburtsjahr;
		this.plz = pb.plz;
	}
	
	public Person(String vorname, String nachname, int geburtsJahr, int plz)
	{
		this.vorname = vorname;
		this.nachname = nachname;
		this.geburtsJahr = geburtsJahr;
		this.plz = plz;
	}
	
	public String toString()
	{
		return String.format("%s %s, Geburtsjahr: %d, Plz: %d", 
				this.vorname, this.nachname, this.geburtsJahr, this.plz);
	}
	
	public boolean equals(Person other)
	{
		if (this.vorname == other.vorname
			&& this.nachname == other.nachname
			&& this.geburtsJahr == other.geburtsJahr
			&& this.plz == other.plz)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static Person getMustermann()
	{
		return new Person("Max", "Mustermann", 1960, 12345);
	}
	
	public static class PersonBuilder
	{
		private String vorname;
		private String nachname;
		private int geburtsjahr;
		private int plz;
		
		public PersonBuilder()
		{
			
		}
		
		public PersonBuilder vorname(String value)
		{
			this.vorname = value;
			return this;
		}
		
		public PersonBuilder nachname(String value)
		{
			this.nachname = value;
			return this;
		}
		
		public PersonBuilder geburtsjahr(int value)
		{
			this.geburtsjahr = value;
			return this;
		}
		
		public PersonBuilder plz(int value)
		{
			this.plz = value;
			return this;
		}
		
		public Person build()
		{
			return new Person(this);
		}
	}
}