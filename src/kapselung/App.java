package kapselung;

import java.util.ArrayList;
import java.util.Comparator;

public class App 
{
	public static void main(String[] args) 
	{
		//Buch buch = new Buch("978-3-86680-192-9", "Test", "ABC", 2019, 1900);
		//System.out.println(buch);  
		
		Buch buch = new Buch();
//		System.out.println(buch.test);
//		buch.isbn = "XYZ"; // Compiler-Fehler: isbn ist private
//		System.out.println("ISBN: " + buch.isbn);  // Compiler-Fehler: isbn ist private
		buch.setIsbn("978-3-86680-192-9"); // richtig
//		buch.setIsbn("XYZ"); // falsch
//		buch.setIsbn("97838668019"); // falsch
//		buch.setIsbn("978386680X933"); // falsch
//		System.out.println("ISBN: " + buch.getIsbn()); 
		
		Buch krimi = new Buch("978-3-86680-192-9", "Conan Doyle, Arthur", "Sherlock Holmes: A study in scarlett", 1895, 1990);
		krimi.setBeschreibung(new StringBuilder("Spannender Krimi, erster Fall von Sherlock Holmes"));
		//System.out.println(krimi);
//		StringBuilder temp = new StringBuilder("Krimi");
//		krimi.setBeschreibung(temp);
		krimi.getBeschreibung().delete(0, krimi.getBeschreibung().length());
		//System.out.println(krimi);
		Buch sachbuch = new Buch("978-3-86680-192-9", "Inden, Michael", "Java 11: Alle Neuerungen", 2017, 1490);
		Buch thriller = new Buch("978-3-86680-192-9", "Harris, Thomas", "Das Schweigen der Lämmer", 1985, 2495);
		
		ArrayList<Buch>  buecherListe = new ArrayList<>();
		buecherListe.add(sachbuch);
		buecherListe.add(krimi);
		buecherListe.add(thriller);

		buecherListe.forEach(System.out::println);
		System.out.println("****************");
		
//		Standardsortierung nach Autor aufsteigend
		buecherListe.sort(Comparator.naturalOrder());
//		Ausgabe
		buecherListe.forEach(System.out::println);
		System.out.println("****************");
		
//		Alternative Sortiertung nach Erscheinungsjahr absteigend
		buecherListe.sort((b1, b2) -> (b1.getErscheinungsjahr() - b2.getErscheinungsjahr()) * -1);
		buecherListe.sort(Comparator.comparing(Buch::getErscheinungsjahr, Comparator.reverseOrder()));
		buecherListe.sort(Comparator.comparing(Buch::getErscheinungsjahr).reversed());
//		Ausgabe
		buecherListe.forEach(System.out::println);
		System.out.println("****************");
	}
}