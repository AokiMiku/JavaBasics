package interfaces.waren;

import java.util.Arrays;

public class App 
{
	public static void main(String[] args) 
	{
		Ware eis = new Lebensmittel("Speiseeis", 150, 500);
		Buch buch1 = new Buch("Herr der Ringe", 1990, "Tolkien");
		Buch buch2 = new Buch("Java ist eine Insel", 4900, "Christian Ullenboom");
		Verleihbar buch3 = new Buch("Java 8 - Die Neuerungen", 2490, "Michael Inden");
		Spielzeug spielzeug1 = new Spielzeug("Playmobil Ritterburg", 5900, 6);
		Spielzeug spielzeug2 = new Spielzeug("Lego Ninja 2", 3950, 9);
		Spielzeug spielzeug3 = new Spielzeug("Cluedo", 3995, 8);
		
		buch1.setVerleihpreis(200);
		spielzeug1.setVerleihpreis(500);
		spielzeug2.setVerleihpreis(500);
		spielzeug3.setPreis(4900);
		buch2.setVerleihpreis(200);
		buch3.setVerleihpreis(100);
		spielzeug3.setVerleihpreis(400);
		
		Verleihbar[] verlieheneObjekte = { buch1, buch2, buch3, spielzeug1, spielzeug2, spielzeug3 };
		double gesamtVerleihpreis = 0;
		for (int i = 0; i < verlieheneObjekte.length; i++) 
		{
			gesamtVerleihpreis += verlieheneObjekte[i].getVerleihpreis();
		}
		System.out.println(String.format("%d verliehene Objekte über %d Tage erbringen eine Gesamteinnahme von %.2f.", verlieheneObjekte.length, Verleihbar.VERLEIHDAUER, gesamtVerleihpreis));

		Ware[] waren = { eis, buch1, spielzeug1, buch2, (Buch) buch3, spielzeug2, spielzeug3 };
		System.out.println("*****************");
		for (Ware ware : waren) 
		{
			System.out.println(ware);
		}
		// System.out.println("Vergleich Spielzeug: " + spielzeug2.compareTo(spielzeug3));
		// System.out.println("Vergleich Buch: " + buch2.compareTo((Buch) buch3));
		
		// Sortieren des Arrays waren absteigend nach Preis
		Arrays.sort(waren);
		System.out.println("*****************");
		for (Ware ware : waren) 
		{
			System.out.println(ware);
		}
	}
}