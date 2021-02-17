package kapselung.aufgaben;

public class Person 
{
	private String vorname;
	private String nachname;
	private int alter;
	private String plz;
	
	public String getVorname() 
	{
		return vorname;
	}
	
	public void setVorname(String vorname)
	{
		this.vorname = vorname;
	}
	
	public String getNachname() 
	{
		return nachname;
	}
	
	public void setNachname(String nachname)
	{
		this.nachname = nachname;
	}
	
	public int getAlter()
	{
		return alter;
	}
	
	public void setAlter(int alter) 
	{
		if (alter < 0)
		{
			throw new IllegalArgumentException("Alter darf nicht kleiner 0 sein! " + alter);
		}
		
		this.alter = alter;
	}
	
	public String getPlz() 
	{
		return plz;
	}
	
	public void setPlz(String plz) 
	{
		if (plz == null || plz.length() != 5)
		{
			throw new IllegalArgumentException("PLZ muss 5 Zeichen lang sein! " + plz);
		}
		
		try
		{
			Integer.parseInt(plz);
		}
		catch (NumberFormatException e)
		{
			throw new IllegalArgumentException("PLZ muss eine Zahl sein." + e);
		}
		
		this.plz = plz;
	}
	
	public Person() {}

	public Person(String vorname, String nachname, int alter, String plz) 
	{
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setAlter(alter);
		this.setPlz(plz);
	}
	
	@Override
	public String toString()
	{
		return String.format("%s %s, Alter: %d, PLZ: %s", this.getVorname(), this.getNachname(), this.getAlter(), this.getPlz());
	}
	
	public static void testAlter(int alter)
	{
		if (alter <= 50)
		{
			System.out.println("bis 50");
		}
		else
		{
			System.out.println("über 50");
		}
	}
}