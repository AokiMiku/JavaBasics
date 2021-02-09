package interfaces.personen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestPersonenArray 
{
	public static void main(String[] args) 
	{
		Person[] p = new Person[4];
		p[0] = new Person("Paul", "Smith");
		p[1] = new Person("Paul", "Black");
		p[2] = new Person("John", "Smith");
		p[3] = new Person("John", "Black");
		
		System.out.println(Arrays.toString(p));
		
		Arrays.sort(p);
		
		System.out.println(Arrays.toString(p));
		
		
		List<String> stringListe = new ArrayList<>();
		stringListe.add("Betty");
		stringListe.add("Fred");
		stringListe.add("Wilma");
		stringListe.add("Betty");
		stringListe.add("Barney");
		stringListe.add("Wilma");
		stringListe.add("Betty");
		stringListe.add("Pebbles");
		stringListe.add("Bam-Bam");
		stringListe.add("Betty");
		stringListe.add("Fred");
		stringListe.add("Pebbles");
		stringListe.add("Dino");
		System.out.println(stringListe);
//		stringListe.clear(); // Alle Elemente entfernen
		System.out.println("Anzahl der Elemente: " + stringListe.size());
		System.out.println("Ist die Liste leer: " + stringListe.isEmpty());
//		stringListe.remove(5);
		System.out.println(stringListe);
		Set<String> stringMenge = new HashSet<>(stringListe);
		System.out.println(stringMenge);
		stringListe = new ArrayList<>(stringMenge);
		System.out.println(stringListe);
		System.out.println("******");
		for (String name : stringListe) {
			System.out.println(name);
		}
//		Sortierung der Liste
//		Collections.sort(stringListe); // vor Java 8
		stringListe.sort(null); // seit Java 8, null für natürliche Sortierung (Comparable)
		stringListe.sort(Comparator.naturalOrder()); // seit Java 8, null für natürliche Sortierung (Comparable)
		// Sortierung absteigend
		//stringListe.sort(new StringReverseComparator());
		stringListe.sort((s1, s2) -> (s1.compareTo(s2)) * -1);
		System.out.println("******");
		for (String name : stringListe) {
			System.out.println(name);
		}
	}
}