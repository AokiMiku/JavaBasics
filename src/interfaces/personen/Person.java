package interfaces.personen;

public class Person implements Comparable<Person>
{
	private String vorname;
	private String nachname;
	
	public String getVorname() 
	{
		return this.vorname;
	}
	public void setVorname(String vorname) 
	{
		this.vorname = vorname;
	}
	public String getNachname() 
	{
		return this.nachname;
	}
	public void setNachname(String nachname) 
	{
		this.nachname = nachname;
	}
	
	public Person(String vorname, String nachname) 
	{
		super();
		this.setVorname(vorname);
		this.setNachname(nachname);
	}

	@Override
	public String toString()
	{
		return String.format("%s %s", this.getVorname(), this.getNachname());
	}
	
	@Override
	public int compareTo(Person o) 
	{
		if (this.getNachname().compareTo(o.getNachname()) == 0)
		{
			return this.getVorname().compareTo(o.getVorname());
		}
		else
		{
			return this.getNachname().compareTo(o.getNachname());
		}
	}
}