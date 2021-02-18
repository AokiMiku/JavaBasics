package kapselung.aufgaben;

import java.time.*;
import java.util.*;

public class App 
{
	public static void main(String[] args) 
	{
		Person miku = new Person("Miku", "M.", LocalDate.of(1993, 12, 30), "32156");
		Person tosh = new Person("Toshio", "S.", LocalDate.of(1992, 3, 7), "35642");
		Person muster = new Person("Max", "Mustermann", LocalDate.of(1963, 1, 13), "54689");
		
		Person cynthia = new Person();
		cynthia.setVorname("Cynthia");
		cynthia.setNachname("L.");
		cynthia.setGeburtsdatum(LocalDate.of(1998, 3, 27));
		cynthia.setPlz("35462");
		
		System.out.println(miku);
		Person.testAlter(miku.getAlter());
		
		System.out.println(tosh);
		Person.testAlter(tosh.getAlter());
		
		System.out.println(cynthia);
		Person.testAlter(cynthia.getAlter());
		
		System.out.println(muster);
		Person.testAlter(muster.getAlter());

		System.out.println("****************");
		
		List<Person> personenListe = Arrays.asList(new Person[] { miku, tosh, cynthia, muster });
		personenListe.forEach(System.out::println);
		
		System.out.println("****************");
		
		personenListe.sort(Comparator.naturalOrder());
		personenListe.forEach(System.out::println);
		
		System.out.println("****************");
		
		personenListe.sort(Comparator.comparing(Person::getGeburtsdatum));
		personenListe.forEach(System.out::println);
	}
}