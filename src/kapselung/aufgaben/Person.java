package kapselung.aufgaben;

import java.time.LocalDate;
import java.time.Period;

public class Person implements Comparable<Person>
{
	private String vorname;
	private String nachname;
	private LocalDate geburtsdatum;
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
	
	public LocalDate getGeburtsdatum()
	{
		return LocalDate.of(this.geburtsdatum.getYear(), this.geburtsdatum.getMonth(), this.geburtsdatum.getDayOfMonth());
	}
	
	public void setGeburtsdatum(LocalDate geburtsdatum)
	{
		if (geburtsdatum.isAfter(LocalDate.now()))
		{
			throw new IllegalArgumentException("Geburtsdatum darf nicht in der Zukunft liegen!");
		}
		this.geburtsdatum = geburtsdatum;
	}
	
	public int getAlter()
	{
		return Period.between(geburtsdatum, LocalDate.now()).getYears();
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

	public Person(String vorname, String nachname, LocalDate geburtsdatum, String plz) 
	{
		this.setVorname(vorname);
		this.setNachname(nachname);
		this.setGeburtsdatum(geburtsdatum);
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
	
	public boolean hatGeburtstag()
	{
		Period p = Period.between(geburtsdatum, LocalDate.now());
		return (p.getMonths() == 0 && p.getDays() == 0);
	}

	@Override
	public int compareTo(Person p) 
	{
		return this.getNachname().compareTo(p.getNachname());
	}
}