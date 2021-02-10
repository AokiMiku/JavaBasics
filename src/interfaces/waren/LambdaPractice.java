package interfaces.waren;

import java.util.ArrayList;

public class LambdaPractice 
{
	public static void main(String[] args) 
	{
		ArrayList<Ware> warenListe = new ArrayList<>();
		
		Ware eis = new Lebensmittel("Speiseeis", 150, 500);
		Buch buch1 = new Buch("Herr der Ringe", 1990, "Tolkien");
		Spielzeug spielzeug1 = new Spielzeug("Playmobil Ritterburg", 5900, 6);
		Buch buch2 = new Buch("Java 10 ist eine Insel", 4900, "Christian Ullenboom");
		Ware buch3 = new Buch("Java  8 - Die Neuerungen", 2490, "Michael Inden");
		Spielzeug spielzeug2 = new Spielzeug("Lego Ninja 2", 3950, 9);
		Spielzeug spielzeug3 = new Spielzeug("Cluedo", 3995, 8);
		Lebensmittel kaffee = new Lebensmittel("Kaffee", 690, 30);
		
		warenListe.add(eis);
		warenListe.add(buch1);
		warenListe.add(spielzeug1);
		warenListe.add(buch2);
		warenListe.add(buch3);
		warenListe.add(spielzeug2);
		warenListe.add(spielzeug3);
		warenListe.add(kaffee);
		
		warenListe.forEach(System.out::println);
		System.out.println("***************");
		
		// Löschen aller Waren mit einem Preis größer als 2000 Cent
		warenListe.removeIf(ware -> ware.getPreis() > 2000);
		
		warenListe.forEach(System.out::println);
		System.out.println("***************");
		
		final int MAX = 10_000; // 1_000_000; // String: 477431 ms; StringBuilder: 20 ms
		long start = System.currentTimeMillis();
		String log = "";
		for (int i = 0; i < MAX; i++) 
		{
			log += "X";
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		start = System.currentTimeMillis();
		StringBuilder sbLog = new StringBuilder();
		for (int i = 0; i < MAX; i++) 
		{
			sbLog.append("X");
		}
		end = System.currentTimeMillis();
		
		System.out.println(end - start);
		System.out.println(sbLog.length());
		System.out.println(sbLog);
	}
}