package aufgabenTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;

public class Aufgaben 
{
	public static void main(String[] args) 
	{
		// Wie lang sind Sie schon auf der Welt (Periode in Jahre, Monate und Tage?
		LocalDate bday = LocalDate.of(1993, 6, 3);
		Period p = Period.between(bday, LocalDate.now());
		System.out.println(String.format("Mein Alter: %s Jahre, %s Monate und %s Tage.", p.getYears(), p.getMonths(), p.getDays()));
		
		// Wie viele Sekunden sind seit Mitternacht vergangen?
		System.out.println(String.format("Seit Mitternacht sind %s Sekunden vergangen.", Duration.between(LocalTime.MIDNIGHT, LocalTime.now()).getSeconds()));
				
		// Wie viele Minuten dauert die Java-Schulung (8:00 bis 13:00 Uhr mit 30 Minuten Pause) an einem Tag?
		System.out.println(String.format("Die Java-Schulung dauert %s Minuten.", Duration.between(LocalTime.of(8, 0), LocalTime.of(13, 0)).toMinutes()));
				
		// Welches Datum ist heute in 3 Monaten und 10 Tagen?
		System.out.println(String.format("Das heutige Datum %s. In 3 Monaten und 10 Tagen wird es der %s sein.", 
							LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy")), 
							LocalDate.now().plusDays(10).plusMonths(3).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))));
				
		// Erzeugen Sie einen StringBuilder-Objekt und hängen Sie alle Tage des Januars vom 1. Januar 2021 bis zum 31. Januar 2021 als LocalDate-Objekte an.
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= 31; i++) 
		{
			sb.append(String.format("%s%n", LocalDate.of(2021, Month.JANUARY, i)));
		}
		
		System.out.println(sb);
				
		// Erzeugen Sie eine ArrayList und befüllen Sie diese mit den Uhrzeiten 
		// (LocalTime) 7:45, 6:15, 20:15, 12:00 (gerne auch als Konstante), 16:35 und 15:00. Sortieren Sie die Liste und erzeugen Sie eine Ausgabe. 
		ArrayList<LocalTime> times = new ArrayList<LocalTime>();
		times.add(LocalTime.of(7, 45));
		times.add(LocalTime.of(6, 15));
		times.add(LocalTime.of(20, 15));
		times.add(LocalTime.of(12, 0));
		times.add(LocalTime.of(16, 35));
		times.add(LocalTime.of(15, 0));
		times.sort(new LocalTimeComparator());
		times.forEach(System.out::println);
		
		// Erzeugen Sie eine ArrayList und befüllen Sie diese mit allen Tagen im Februar und der Uhrzeit 12:00 Uhr. 
		// Entfernen Sie mit einem Predicate alle ungeraden Tage und geben Sie die Liste absteigend sortiert aus.
		
		ArrayList<LocalDateTime> daysOfFebruary = new ArrayList<LocalDateTime>();
		
		for (int i = 1; i <= 28; i++) 
		{
			daysOfFebruary.add(LocalDateTime.of(LocalDate.of(2021, Month.FEBRUARY, i), LocalTime.of(12, 0)));
		}
		
		daysOfFebruary.removeIf(dt -> dt.getDayOfMonth() % 2 == 1);
		daysOfFebruary.forEach(System.out::println);
	}
}