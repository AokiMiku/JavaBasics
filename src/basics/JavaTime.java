package basics;

import java.time.*;

public class JavaTime 
{

	public static void main(String[] args) 
	{
//		LocalDate heute = new LocalDate(2021, 2, 12); // Compiler-Fehler, Konstruktoren sind nicht sichtbar
		LocalDate heute = LocalDate.now();
		System.out.println(heute);
		int jahr = heute.getYear();
		System.out.println("Jahr = " + jahr);
		System.out.println("Monat = " + heute.getMonthValue());
		System.out.println("Monat = " + heute.getMonth());
		System.out.println("Tag = " + heute.getDayOfMonth());
		
//		Rechnungsdatum 01.02.2021
		LocalDate rechnungsdatum = LocalDate.of(2021, 2, 1);
		rechnungsdatum = LocalDate.of(2021, Month.FEBRUARY, 1);
		String eingabeDatum = "01.02.2021";	// false
		eingabeDatum = "2021-02-01"; // true
		//eingabeDatum = "2021-2-1"; // false
		
		if (check(eingabeDatum)) {
		rechnungsdatum = LocalDate.parse(eingabeDatum);
		System.out.println("Rechnungsdatum: " + rechnungsdatum);
		} else {
			System.out.println("Ungültiges Datum");
		}
		
		LocalDate test = LocalDate.ofEpochDay(-30_000);
		System.out.println(test);
	}
	
	private static boolean check(String datum ) 
	{
		boolean check = true;
		if (datum.length() != 10 
					|| datum.indexOf('-') != 4 
					|| datum.lastIndexOf('-') != 7)
		{
			check = false;
		}
		
		try
		{
			Integer.parseInt(datum.substring(0, datum.indexOf('-')));
			Integer.parseInt(datum.substring(datum.indexOf('-'), datum.lastIndexOf('-')));
			Integer.parseInt(datum.substring(datum.lastIndexOf('-')));
		}
		catch (NumberFormatException ex)
		{
			return false;
		}
		
		return check;
	}
}
